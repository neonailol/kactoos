package nnl.rocks.kactoos.map

/**
 * MapEntry as [kotlin.collections.Map.Entry].
 *
 * There is no thread-safety guarantee.
 *
 *
 *
 * @param K Key type
 * @param V Value type
 * @param src The key of the entry's map.
 * @param trgt The value associated to the key of the entry's map.
 * @since 0.9
 */
class MapEntry<out K, out V>(
    private val src: K,
    private val trgt: V
) : Map.Entry<K, V> {

    override val key: K
        get() = src

    override val value: V
        get() = trgt

    override fun toString(): String {
        return String.format("%s=%s", this.key, this.value)
    }

    override fun equals(other: Any?): Boolean {
        return (other is Map.Entry<*, *>
            && Map.Entry::class.java.cast(other).key == this.key
            && Map.Entry::class.java.cast(other).value == this.value)
    }

    override fun hashCode(): Int {
        var hash: Int = if (this.src == null) {
            0
        } else {
            this.src.hashCode()
        }
        hash = if (this.trgt == null) {
            hash xor 0
        } else {
            hash xor this.trgt.hashCode()
        }
        return hash
    }
}
