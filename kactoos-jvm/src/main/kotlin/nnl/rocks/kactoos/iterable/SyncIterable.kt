package nnl.rocks.kactoos.iterable

import nnl.rocks.kactoos.scalar.SyncScalar

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
 *
 *
 * @param X Type of item
 * @since 0.24
 */
class SyncIterable<X : Any>(iterable: Iterable<X>) : IterableEnvelope<X>(
    SyncScalar<Iterable<X>>(
         {
            iterable
        }
    )
) {

    /**
     * @param src The underlying iterable
     */
    @SafeVarargs
    @Suppress("SpreadOperator")
    constructor(vararg src: X) : this(IterableOf<X>(*src))
}
