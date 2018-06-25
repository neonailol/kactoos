package nnl.rocks.kactoos.list

import nnl.rocks.kactoos.iterable.IterableOf
import nnl.rocks.kactoos.scalar.SyncScalar

/**
 * Synchronized list.
 *
 * Objects of this class are thread-safe.
 *
 * @param X Type of item
 * @since 0.4
 */
class SyncList<X : Any> : ListEnvelope<X> {

    constructor(list: Collection<X>) : super(SyncScalar { list.toList() })

    constructor(vararg items: X) : this(IterableOf(items.asIterable()))

    constructor(items: Iterable<X>) : this(ListOf(items))

}
