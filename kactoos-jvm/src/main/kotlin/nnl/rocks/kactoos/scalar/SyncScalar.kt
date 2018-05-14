package nnl.rocks.kactoos.scalar

import nnl.rocks.kactoos.Scalar

/**
 * Scalar that is thread-safe.
 *
 *
 *
 *
 *
 * @param T Type of result
 * @param origin The Scalar to cache
 * @param mutex Sync lock
 * @since 0.3
 */
class SyncScalar<T : Any>(
    private val origin: Scalar<T>,
    private val mutex: Any
) : Scalar<T> {

    /**
     * @param src The Scalar to cache
     */
    constructor(src: Scalar<T>) : this(src, src)

    override fun invoke(): T {
        synchronized(this.mutex) {
            return this.origin()
        }
    }
}
