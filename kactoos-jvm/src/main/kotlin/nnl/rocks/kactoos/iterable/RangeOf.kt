package nnl.rocks.kactoos.iterable

import nnl.rocks.kactoos.Func
import nnl.rocks.kactoos.func.UncheckedFunc
import java.util.NoSuchElementException

/**
 * Iterable implementation to model range functionality.
 *
 *
 * @param T Range value type
 * @since 1.0
 */
class RangeOf<T : Comparable<T>>(
    min: T,
    max: T,
    incrementor: Func<T, T>
) : IterableEnvelope<T>(
    {
        IterableOf<T>(
            object : Iterator<T> {
                private val inc = UncheckedFunc(incrementor)
                private var value = min

                override fun hasNext(): Boolean {
                    return this.value.compareTo(max) < 1
                }

                override fun next(): T {
                    if (! this.hasNext()) {
                        throw NoSuchElementException()
                    }
                    val result = this.value
                    this.value = this.inc.apply(this.value)
                    return result
                }
            }
        )
    }
)
