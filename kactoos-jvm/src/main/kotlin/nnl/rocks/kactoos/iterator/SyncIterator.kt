package nnl.rocks.kactoos.iterator

import java.util.concurrent.locks.ReadWriteLock
import java.util.concurrent.locks.ReentrantReadWriteLock

/**
 * Synchronized [Iterator] implementation using a [ReadWriteLock]
 * either provided to the constructor or an internally created
 * [ReentrantReadWriteLock].
 * The [ReadWriteLock] is used to synchronize read calls to
 * [SyncIterator.hasNext] against write calls to
 * [SyncIterator.next] and write calls to any other read or write
 * calls.
 *
 * @param T The type of the iterator.
 * @param iterator The iterator to synchronize access to.
 * @param lock The lock to use for synchronization.
 * @since 0.3
 */
class SyncIterator<out T> @JvmOverloads constructor(
    private val iterator: Iterator<T>,
    private val lock: ReadWriteLock = ReentrantReadWriteLock()
) : Iterator<T> {

    override fun hasNext(): Boolean {
        this.lock.readLock().lock()
        try {
            return this.iterator.hasNext()
        } finally {
            this.lock.readLock().unlock()
        }
    }

    override fun next(): T {
        this.lock.writeLock().lock()
        try {
            return this.iterator.next()
        } finally {
            this.lock.writeLock().unlock()
        }
    }
}
