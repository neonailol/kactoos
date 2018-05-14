package nnl.rocks.kactoos.map

import nnl.rocks.kactoos.Scalar
import nnl.rocks.kactoos.scalar.Constant

/**
 * Map envelope.
 *
 * There is no thread-safety guarantee.
 *
 * @param X Type of key
 * @param Y Type of value
 * @see StickyMap
 *
 * @since 0.3
 */
open class MapEnvelope<X, out Y>(private val map: Scalar<Map<X, Y>>) : Map<X, Y> by map() {

    constructor(map: Map<X, Y>) : this(Constant { map })
}
