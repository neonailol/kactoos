package nnl.rocks.kactoos.scalar

import nnl.rocks.kactoos.KScalar
import nnl.rocks.kactoos.Scalar

/**
 * Scalar that is thread-safe.
 *
 * @param T Type of result
 * @param origin The KScalar to cache
 * @param mutex Sync lock
 * @since 0.3
 */
class SyncScalar<T : Any>(
    private val origin: KScalar<T>,
    private val mutex: Any
) : Scalar<T> {

    constructor(src: KScalar<T>) : this(src, src)

    constructor(src: Scalar<T>) : this({ src() }, src)

    constructor(src: Scalar<T>, mutex: Any) : this({ src() }, mutex)

    override fun invoke(): T = synchronized(mutex) { origin() }
}
