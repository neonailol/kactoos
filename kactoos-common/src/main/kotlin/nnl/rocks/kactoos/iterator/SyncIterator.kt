package nnl.rocks.kactoos.iterator

import nnl.rocks.kactoos.internal.kSynchronized

/**
 * Synchronized [Iterator].
 *
 * @param T The type of the iterator.
 * @param iterator The iterator to synchronize access to.
 * @param readLock The lock to use for synchronization on reads.
 * @param writeLock The lock to use for synchronization on writes.
 * @since 0.3
 */
class SyncIterator<out T>(
    private val iterator: Iterator<T>,
    private val readLock: Any,
    private val writeLock: Any
) : Iterator<T> {

    constructor(iterator: Iterator<T>) : this(iterator, Any(), Any())

    override fun hasNext(): Boolean = kSynchronized(readLock) { iterator.hasNext() }

    override fun next(): T = kSynchronized(writeLock) { iterator.next() }
}
