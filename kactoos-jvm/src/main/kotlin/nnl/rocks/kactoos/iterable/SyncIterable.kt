package nnl.rocks.kactoos.iterable

/**
 * Synchronized iterable.
 *
 *
 * This class should be used very carefully. You must understand that
 * it will fetch the entire content of the encapsulated [Iterable] on each
 * method call. It doesn't cache the data anyhow. If you don't
 * need this [Iterable] to re-fresh
 * its content on every call, by doing round-trips to
 * the encapsulated iterable, use [StickyIterable].
 *
 *
 * Objects of this class are thread-safe.
 *
 * @param X Type of item
 * @since 0.3
 */
class SyncIterable<X : Any> @JvmOverloads constructor(
    private val origin: Iterable<X>,
    private val lock: Any = Any()
) : Iterable<X> {

    /**
     * @param src The underlying iterable
     */
    @SafeVarargs
    constructor(vararg src: X) : this(IterableOf<X>(*src))

    override fun iterator(): Iterator<X> {
        synchronized(this.lock) {
            return this.origin.iterator()
        }
    }
}
