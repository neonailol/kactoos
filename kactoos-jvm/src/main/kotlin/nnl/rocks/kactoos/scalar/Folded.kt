package nnl.rocks.kactoos.scalar

import nnl.rocks.kactoos.BiFunc
import nnl.rocks.kactoos.Scalar
import java.util.NoSuchElementException

/**
 * Folds iterable via BiFunc.
 *
 * ```
 * new Folded<>(
 * (first, last) -> first + last,
 * new IterableOf<>(() -> 1L, () -> 2L, () -> 3L, () -> 4L)
 * ).value() // returns 10L
 * ```
 *
 * There is no thread-safety guarantee.
 *
 *
 * @param T Scalar type
 * @param function Folding function
 * @param items The scalars
 * @since 0.3
 */
class Folded<out T : Any>(
    private val function: BiFunc<T, T, T>,
    private val items: Iterable<Scalar<T>>
) : Scalar<T> {

    override fun invoke(): T {
        val iter = this.items.iterator()
        if (! iter.hasNext()) {
            throw NoSuchElementException(
                "Can't find first element in an empty iterable"
            )
        }
        var acc = iter.next().invoke()
        while (iter.hasNext()) {
            val next = iter.next().invoke()
            acc = this.function.apply(acc, next)
        }
        return acc
    }
}
