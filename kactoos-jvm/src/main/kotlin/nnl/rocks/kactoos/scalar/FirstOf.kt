package nnl.rocks.kactoos.scalar

import nnl.rocks.kactoos.Func
import nnl.rocks.kactoos.Scalar
import nnl.rocks.kactoos.iterable.Filtered
import nnl.rocks.kactoos.iterable.HeadOf
import nnl.rocks.kactoos.iterable.IterableOf

/**
 * Find first element in a list that satisfies specified condition.
 *
 * There is no thread-safety guarantee.
 *
 * @param T Type of result
 * @param condition Condition for getting the element
 * @param source Source iterable
 * @param fallback Fallback used if no value matches
 * @since 0.5
 */
class FirstOf<T : Any>(
    private val condition: Func<T, Boolean>,
    private val source: Iterable<T>,
    private val fallback: Scalar<T>
) : Scalar<T> {

    override fun invoke(): T {
        return ScalarWithFallback(
            {
                HeadOf(
                    1,
                    Filtered(condition, source)
                ).iterator().next()
            },
            IterableOf(
                FallbackFrom(
                    IterableOf<Class<out Throwable>>(
                        NoSuchElementException::class.java
                    ),
                    { fallback() }
                )
            ),
            { t -> t }
        ).invoke()
    }
}
