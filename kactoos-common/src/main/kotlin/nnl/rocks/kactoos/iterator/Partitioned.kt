package nnl.rocks.kactoos.iterator

import nnl.rocks.kactoos.internal.isEmpty

/**
 * Iterator implementation for [Iterator] partitioning.
 *
 * @param size Size of the partitions.
 * @param decorated Source iterator.
 * @param T Partitions value type
 * @since 0.4
 */
class Partitioned<out T : Any>(
    private val size: Int,
    private val decorated: Iterator<T>
) : Iterator<List<T>> {

    override fun hasNext(): Boolean = decorated.hasNext()

    override fun next(): List<T> = when {
        isEmpty() -> throw NoSuchElementException("No partition left.")
        size < 1 -> throw IllegalArgumentException("Partition size < 1")

        else -> {
            val result = mutableListOf<T>()
            var count = 0
            while (count < size && hasNext()) {
                result.add(decorated.next())
                ++ count
            }
            result.toList()
        }
    }
}
