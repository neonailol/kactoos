package nnl.rocks.kactoos.map

/**
 * MapEntry as [kotlin.collections.Map.Entry].
 *
 * There is no thread-safety guarantee.
 *
 * @param K Key type
 * @param V Value type
 * @param key The key of the entry's map.
 * @param value The value associated to the key of the entry's map.
 * @since 0.4
 */
class MapEntry<out K : Any, out V : Any>(
    override val key: K,
    override val value: V
) : Map.Entry<K, V> {

    override fun toString(): String = "$key=$value"

    override fun equals(other: Any?): Boolean {
        return when (other) {
            is Map.Entry<*, *> -> other.key == key && other.value == other.value
            else -> false
        }
    }

    override fun hashCode(): Int {
        var hash: Int = key.hashCode()
        hash = hash xor value.hashCode()
        return hash
    }
}
