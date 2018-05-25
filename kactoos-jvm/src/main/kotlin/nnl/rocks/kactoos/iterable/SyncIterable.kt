package nnl.rocks.kactoos.iterable

/**
 * Synchronized iterable.
 *
 * This class should be used very carefully. You must understand that
 * it will fetch the entire content of the encapsulated [Iterable] on each
 * method call. It doesn't cache the data anyhow. If you don't
 * need this [Iterable] to re-fresh
 * its content on every call, by doing round-trips to
 * the encapsulated iterable, use [StickyIterable].
 *
 * Objects of this class are thread-safe.
 *
 * @param X Type of item
 * @param origin The iterable synchronize access to.
 * @param lock The lock to synchronize with.
 * @since 0.5
 */
class SyncIterable<X : Any>(
    private val origin: Iterable<X>,
    private val lock: Any = Any()
) : Iterable<X> {

    constructor(vararg src: X) : this(IterableOf<X>(*src))

    override fun iterator(): Iterator<X> = synchronized(lock) {
        return origin.iterator()
    }

}
