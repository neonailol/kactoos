package nnl.rocks.kactoos.iterator

/**
 * Tail portion of the iterator.
 *
 * There is no thread-safety guarantee.
 *
 * @param T Element type
 * @param iterator Decorated iterator
 * @param num Number of tail elements
 * @since 0.4
 */
class TailOf<out T : Any>(num: Int, iterator: Iterator<T>) : Iterator<T> {

    private val origin: Iterator<T> = Immutable(iterator.asSequence().toList().takeLast(num).iterator())

    override fun hasNext(): Boolean = origin.hasNext()

    override fun next(): T = origin.next()
}
