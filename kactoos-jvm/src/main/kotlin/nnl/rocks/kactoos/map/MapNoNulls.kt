package nnl.rocks.kactoos.map

/**
 * A decorator of [Map] that tolerates no NULLs.
 *
 * There is no thread-safety guarantee.
 *
 * @param K Type of key
 * @param V Type of value
 * @since 0.27
 */
class MapNoNulls<K : Any, V : Any>(private val map: MutableMap<K, V>) : MutableMap<K, V> by map {

    constructor(map: MapEnvelope<K, V>) : this(
        {
            val mapOf = mutableMapOf<K, V>()
            mapOf.putAll(map)
            mapOf
        }.invoke()
    )
}
