package nnl.rocks.kactoos.list

import nnl.rocks.kactoos.collection.CollectionOf
import nnl.rocks.kactoos.iterable.IterableOf
import nnl.rocks.kactoos.scalar.SolidScalar

/**
 * A List that is both synchronized and sticky.
 *
 * Objects of this class are thread-safe.
 *
 * @param X Type of item
 * @since 0.4
 */
class SolidList<X : Any> : ListEnvelope<X> {

    constructor(list: Collection<X>) : super(SolidScalar<List<X>> { SyncList(StickyList(list)) })

    constructor(vararg items: X) : this(IterableOf(items.asIterable()))

    constructor(items: Iterable<X>) : this(CollectionOf(items))
}
