package nnl.rocks.kactoos.list

import nnl.rocks.kactoos.iterable.IterableOf
import nnl.rocks.kactoos.scalar.StickyScalar

/**
 * List decorator that goes through the list only once.
 *
 * The list is read only.
 *
 * There is no thread-safety guarantee.
 *
 * @param X Type of item
 * @since 0.4
 */
class StickyList<X : Any> : ListEnvelope<X> {

    constructor(collection: Collection<X>) : super(StickyScalar { collection.toList() })

    constructor(vararg items: X) : this(IterableOf(items.iterator()))

    constructor(items: Iterable<X>) : this(ListOf(items))

    constructor(items: Iterator<X>) : this(ListOf(items))


}
