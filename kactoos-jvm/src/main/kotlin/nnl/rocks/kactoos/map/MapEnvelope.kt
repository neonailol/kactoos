package nnl.rocks.kactoos.map

import nnl.rocks.kactoos.Scalar
import nnl.rocks.kactoos.scalar.UncheckedScalar

/**
 * Map envelope.
 *
 * There is no thread-safety guarantee.
 *
 *
 *
 * @param X Type of key
 * @param Y Type of value
 * @see StickyMap
 *
 * @since 0.24
 */
open class MapEnvelope<X, out Y>(private val map: UncheckedScalar<Map<X, Y>>) : Map<X, Y> by map.value() {

    constructor(scalar: Scalar<Map<X, Y>>) : this(
        UncheckedScalar(scalar)
    )
}
