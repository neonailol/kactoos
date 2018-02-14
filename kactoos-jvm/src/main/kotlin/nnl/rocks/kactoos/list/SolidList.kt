package nnl.rocks.kactoos.list

import nnl.rocks.kactoos.collection.CollectionOf
import nnl.rocks.kactoos.iterable.IterableOf
import nnl.rocks.kactoos.scalar.Constant
import nnl.rocks.kactoos.scalar.SolidScalar

/**
 * A [java.util.List] that is both synchronized and sticky.
 *
 *
 * Objects of this class are thread-safe.
 *
 *
 *
 * @param X Type of item
 * @since 0.24
 */
class SolidList<X : Any>(list: Collection<X>) : ListEnvelope<X>(
    SolidScalar<List<X>>(Constant { SyncList<X>(StickyList<X>(list)) })
) {

    /**
     * @param items The array
     */
    @SafeVarargs
    constructor(vararg items: X) : this(IterableOf<X>(items.iterator()))

    /**
     * @param items The array
     * @since 0.21
     */
    constructor(items: Iterator<X>) : this(IterableOf<X>(items))

    /**
     * @param items The array
     */
    constructor(items: Iterable<X>) : this(CollectionOf<X>(items))
}
