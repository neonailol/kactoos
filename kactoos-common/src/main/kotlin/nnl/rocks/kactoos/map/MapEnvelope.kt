package nnl.rocks.kactoos.map

import nnl.rocks.kactoos.KScalar
import nnl.rocks.kactoos.Scalar

/**
 * Map envelope.
 *
 * There is no thread-safety guarantee.
 *
 * @param K Type of key
 * @param V Type of value
 * @since 0.3
 */
open class MapEnvelope<K, out V>(private val map: KScalar<Map<K, V>>) : Map<K, V> by map() {

    constructor(map: Map<K, V>) : this({ map })

    constructor(map: Scalar<Map<K, V>>) : this({ map() })
}
