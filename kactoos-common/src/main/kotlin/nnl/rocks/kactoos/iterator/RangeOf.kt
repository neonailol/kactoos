package nnl.rocks.kactoos.iterator

import nnl.rocks.kactoos.KFunc
import nnl.rocks.kactoos.internal.isEmpty

/**
 * Iterator implementation to model range functionality.
 *
 * @param T Range value type
 * @since 0.4
 */
class RangeOf<T : Comparable<T>>(
    private val min: T,
    private val max: T,
    private val incrementer: KFunc<T, T>
) : Iterator<T> {

    private var value = min

    override fun hasNext(): Boolean = value.compareTo(max) < 1

    override fun next(): T {
        when {
            isEmpty() -> throw NoSuchElementException("Iterator has no more elements")

            else -> {
                val result = value
                value = incrementer(value)
                return result
            }
        }
    }
}
