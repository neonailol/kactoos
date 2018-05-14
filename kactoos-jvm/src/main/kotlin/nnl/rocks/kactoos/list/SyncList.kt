package nnl.rocks.kactoos.list

import nnl.rocks.kactoos.iterable.IterableOf
import nnl.rocks.kactoos.scalar.SyncScalar
import java.util.Collections
import java.util.LinkedList

/**
 * Synchronized list.
 *
 * This class should be used very carefully. You must understand that
 * it will fetch the entire content of the encapsulated [Iterable] on each
 * method call. It doesn't cache the data anyhow. If you don't
 * need this [java.util.List] to re-fresh
 * its content on every call, by doing round-trips to
 * the encapsulated iterable, use [StickyList].
 *
 * The list is read only.
 *
 * Objects of this class are thread-safe.
 *
 *
 *
 * @param X Type of item
 * @since 0.24
 */
class SyncList<X : Any>(list: Collection<X>) : ListEnvelope<X>(
    SyncScalar<List<X>>(
         {
            val temp = LinkedList<X>()
            temp.addAll(list)
            Collections.synchronizedList<X>(temp)
        }
    )
) {

    /**
     * @param items The array
     */
    @SafeVarargs
    @Suppress("SpreadOperator")
    constructor(vararg items: X) : this(IterableOf<X>(*items))

    /**
     * @param items The array
     */
    constructor(items: Iterable<X>) : this(ListOf<X>(items))

    /**
     * @param items The array
     * @since 0.21
     */
    constructor(items: Iterator<X>) : this(ListOf<X>(items))
}
