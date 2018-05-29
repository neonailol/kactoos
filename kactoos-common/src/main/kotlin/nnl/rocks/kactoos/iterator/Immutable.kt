package nnl.rocks.kactoos.iterator

/**
 * Iterator that doesn't allow removal of elements.
 *
 * There is no thread-safety guarantee.
 *
 * @param T Element type.
 * @param iterator Encapsulated iterator.
 * @since 0.4
 */
class Immutable<out T : Any>(private val iterator: Iterator<T>) : Iterator<T> by iterator
