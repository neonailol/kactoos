package nnl.rocks.kactoos.scalar

import nnl.rocks.kactoos.KScalar

/**
 * KScalar that is thread-safe.
 *
 *
 *
 *
 *
 * @param T Type of result
 * @param origin The KScalar to cache
 * @param mutex Sync lock
 * @since 0.3
 */
class SyncScalar<T : Any>(
    private val origin: KScalar<T>,
    private val mutex: Any
) : KScalar<T> {

    /**
     * @param src The KScalar to cache
     */
    constructor(src: KScalar<T>) : this(src, src)

    override fun invoke(): T {
        synchronized(this.mutex) {
            return this.origin()
        }
    }
}
