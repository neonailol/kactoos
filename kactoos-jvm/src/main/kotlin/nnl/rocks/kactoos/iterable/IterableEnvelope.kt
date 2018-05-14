package nnl.rocks.kactoos.iterable

import nnl.rocks.kactoos.Scalar
import nnl.rocks.kactoos.scalar.Constant

/**
 * Iterable envelope.
 *
 * There is no thread-safety guarantee.
 *
 * @param X Type of item
 * @since 0.24
 */
open class IterableEnvelope<out X : Any>(
    private val iterable: Scalar<Iterable<X>>
) : Iterable<X> by iterable() {

    constructor(iterable: Iterable<X>) : this(Constant { iterable })
}
