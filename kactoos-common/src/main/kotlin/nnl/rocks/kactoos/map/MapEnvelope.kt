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
abstract class MapEnvelope<K : Any, out V : Any>(private val map: KScalar<Map<K, V>>) : Map<K, V> by map() {

    constructor(map: Scalar<Map<K, V>>) : this({ map() })

    /**
     * Returns the value corresponding to the given [key], or throws [NullPointerException] if such a key is not present in the map.
     *
     * @param key [K] Key.
     * @return [V] Value.
     * @throws [NullPointerException] if [key] is not present in the map.
     * @see get
     * @since 0.5
     */
    fun unsafeGet(key: K): V = get(key) ?: throw NullPointerException("Map does not contain value for key $key")
}
