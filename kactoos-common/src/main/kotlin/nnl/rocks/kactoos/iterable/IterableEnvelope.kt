package nnl.rocks.kactoos.iterable

import nnl.rocks.kactoos.KScalar
import nnl.rocks.kactoos.Scalar
import nnl.rocks.kactoos.iterator.Immutable

/**
 * Iterable envelope.
 *
 * There is no thread-safety guarantee.
 *
 * @param T Type of item
 * @since 0.5
 */
open class IterableEnvelope<out T : Any>(
    private val iterable: KScalar<Iterable<T>>
) : Iterable<T> by iterable() {

    constructor(iterable: Iterable<T>) : this({ iterable })

    constructor(iterable: Scalar<Iterable<T>>) : this({ iterable() })

    override fun iterator(): Iterator<T> = Immutable(iterable().iterator())
}
