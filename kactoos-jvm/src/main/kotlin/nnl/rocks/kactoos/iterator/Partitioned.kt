package nnl.rocks.kactoos.iterator

import java.util.Collections
import java.util.LinkedList
import java.util.NoSuchElementException

/**
 * Iterator implementation for [Iterator] partitioning.
 *
 * @param size Size of the partitions.
 * @param decorated Source iterator.
 * @param T Partitions value type
 * @since 0.29
 */
class Partitioned<out T : Any>(
    private val size: Int,
    private val decorated: Iterator<T>
) : Iterator<List<T>> {

    override fun hasNext(): Boolean {
        return this.decorated.hasNext()
    }

    override fun next(): List<T> {
        if (! this.hasNext()) {
            throw NoSuchElementException("No partition left.")
        }
        if (this.size < 1) {
            throw IllegalArgumentException("Partition size < 1")
        }
        val result = LinkedList<T>()
        var count = 0
        while (count < this.size && this.hasNext()) {
            result.add(this.decorated.next())
            ++ count
        }
        return Collections.unmodifiableList(result)
    }
}
