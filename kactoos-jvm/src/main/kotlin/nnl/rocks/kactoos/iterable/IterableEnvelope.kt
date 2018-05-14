package nnl.rocks.kactoos.iterable

import nnl.rocks.kactoos.KScalar

/**
 * Iterable envelope.
 *
 * There is no thread-safety guarantee.
 *
 * @param X Type of item
 * @since 0.24
 */
open class IterableEnvelope<out X : Any>(
    private val iterable: KScalar<Iterable<X>>
) : Iterable<X> by iterable() {

    constructor(iterable: Iterable<X>) : this({ iterable })
}
