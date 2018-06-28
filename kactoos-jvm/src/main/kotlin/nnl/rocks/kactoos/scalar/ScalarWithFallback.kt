package nnl.rocks.kactoos.scalar

import nnl.rocks.kactoos.KFunc
import nnl.rocks.kactoos.KScalar
import nnl.rocks.kactoos.Scalar
import nnl.rocks.kactoos.func.FuncOf
import nnl.rocks.kactoos.iterator.Filtered
import nnl.rocks.kactoos.iterator.Sorted
import nnl.rocks.kactoos.map.MapOf

/**
 * Scalar with a fallback plan.
 *
 * There is no thread-safety guarantee.
 *
 * @param T Type of result
 * @param origin Original scalar
 * @param fallbacks Fallbacks
 * @param follow Follow up function
 * @since 0.4
 */
class ScalarWithFallback<T : Any>(
    private val origin: KScalar<T>,
    private val fallbacks: Iterable<FallbackFrom<T>>,
    private val follow: KFunc<T, T>
) : Scalar<T> {

    override fun invoke(): T {
        val result: T = try {
            origin()
        } catch (ex: InterruptedException) {
            Thread.currentThread().interrupt()
            fallback(ex)
        } catch (ex: Throwable) {
            fallback(ex)
        }
        return follow(result)
    }

    /**
     * Finds the best fallback for the given exception type and apply it to
     * the exception or throw the original error if no fallback found.
     * @param exp The original exception
     * @return Result of the most suitable fallback
     * @throws Exception The original exception if no fallback found
     */
    private fun fallback(exp: Throwable): T {
        val candidates = Sorted(
            Comparator.comparingInt<Map.Entry<FallbackFrom<T>, Int>>({ it.value }),
            Filtered(
                FuncOf { entry: Map.Entry<FallbackFrom<T>, Int> ->
                    Not(
                        Equals(
                            { entry.value },
                            { Int.MIN_VALUE }
                        )
                    ).invoke()
                },
                MapOf(
                    FuncOf<FallbackFrom<T>, FallbackFrom<T>> { fbk -> fbk },
                    FuncOf<FallbackFrom<T>, Int> { fbk -> fbk.support(exp.javaClass) },
                    fallbacks
                ).entries.iterator()
            )
        )
        return if (candidates.hasNext()) {
            candidates.next().key.apply(exp)
        } else {
            throw Exception(
                "No fallback found - throw the original exception",
                exp
            )
        }
    }
}
