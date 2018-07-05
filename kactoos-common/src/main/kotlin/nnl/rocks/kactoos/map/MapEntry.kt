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

    override fun toString(): String = "MapEntry(key=$key, value=$value)"

    override fun equals(other: Any?): Boolean {
        return when {
            this === other -> true
            other !is MapEntry<*, *> -> false
            key != other.key -> false
            value != other.value -> false
            else -> true
        }
    }

    override fun hashCode(): Int {
        var result = key.hashCode()
        result = 31 * result + value.hashCode()
        return result
    }

}
