package nnl.rocks.kactoos.scalar

import nnl.rocks.kactoos.Scalar

/**
 * Scalar that is thread-safe.
 *
 *
 * This class implements [Scalar], which throws a checked
 * [Exception]. This may not be convenient in many cases. To make
 * it more convenient and get rid of the checked exception you can
 * use [UncheckedScalar] or [IoCheckedScalar] decorators.
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

    @Throws(Exception::class)
    override fun value(): T {
        synchronized(this.mutex) {
            return this.origin()
        }
    }
}
