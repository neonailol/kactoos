package nnl.rocks.kactoos.iterator

/**
 * Iterator that doesn't allow removal of elements.
 *
 * There is no thread-safety guarantee.
 *
 * @param T Element type
 * @since 0.5
 */
class Immutable<T>(
    private val iterator: Iterator<T>
) : Iterator<T> by iterator
