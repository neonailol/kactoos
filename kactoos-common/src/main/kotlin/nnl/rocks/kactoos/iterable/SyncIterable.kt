package nnl.rocks.kactoos.iterable

/**
 * Synchronized iterable.
 *
 * Objects of this class are thread-safe.
 *
 * @param X Type of item.
 * @param origin The iterable synchronize access to.
 * @param lock The lock to synchronize with.
 * @since 0.4
 * @see StickyIterable
 * @see SolidIterable
 */
class SyncIterable<out X : Any>(
    private val origin: Iterable<X>,
    private val lock: Any
) : Iterable<X> {

    constructor(origin: Iterable<X>) : this(origin, Any())

    constructor(vararg src: X) : this(src.asIterable())

    override fun iterator(): Iterator<X> = synchronized(lock) { origin.iterator() }

}
