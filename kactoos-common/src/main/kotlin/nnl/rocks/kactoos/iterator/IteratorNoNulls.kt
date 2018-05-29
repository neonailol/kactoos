package nnl.rocks.kactoos.iterator

/**
 * A decorator of an [Iterator] that returns no NULL.
 *
 * There is no thread-safety guarantee.
 *
 * @param T Element type.
 * @param iterator Encapsulated iterator.
 * @since 0.3
 */
class IteratorNoNulls<out T : Any>(private val iterator: Iterator<T>) : Iterator<T> by iterator
