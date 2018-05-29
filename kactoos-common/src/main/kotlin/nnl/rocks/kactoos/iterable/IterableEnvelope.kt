package nnl.rocks.kactoos.iterable

import nnl.rocks.kactoos.KScalar
import nnl.rocks.kactoos.Scalar

/**
 * Iterable envelope.
 *
 * There is no thread-safety guarantee.
 *
 * @param X Type of item
 * @since 0.5
 */
open class IterableEnvelope<out X : Any>(
    private val iterable: KScalar<Iterable<X>>
) : Iterable<X> by iterable() {

    constructor(iterable: Iterable<X>) : this({ iterable })

    constructor(iterable: Scalar<Iterable<X>>) : this({ iterable() })
}
