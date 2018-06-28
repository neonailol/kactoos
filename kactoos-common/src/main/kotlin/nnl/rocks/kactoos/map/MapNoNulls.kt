package nnl.rocks.kactoos.map

/**
 * A decorator of [Map] that tolerates no NULLs.
 *
 * There is no thread-safety guarantee.
 *
 * @param K Type of key
 * @param V Type of value
 * @since 0.4
 */
class MapNoNulls<K : Any, V : Any>(map: Map<K, V>) : MapEnvelope<K, V>(map)
