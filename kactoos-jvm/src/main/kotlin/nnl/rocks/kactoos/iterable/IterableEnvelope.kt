package nnl.rocks.kactoos.iterable

import nnl.rocks.kactoos.Scalar
import nnl.rocks.kactoos.scalar.UncheckedScalar

/**
 * Iterable envelope.
 *
 *
 * There is no thread-safety guarantee.
 *
 *
 *
 * @param X Type of item
 * @since 0.24
 */
open class IterableEnvelope<out X : Any>(
    private val iterable: UncheckedScalar<Iterable<X>>
) : Iterable<X> by iterable() {

    constructor(scalar: Scalar<Iterable<X>>) : this(UncheckedScalar(scalar))
}
