package nnl.rocks.kactoos.collection

import nnl.rocks.kactoos.iterable.IterableOf
import nnl.rocks.kactoos.scalar.StickyScalar

/**
 * Collection decorator that goes through the list only once.
 *
 * There is no thread-safety guarantee.
 *
 * @param E Type of item
 * @since 0.3
 */
class StickyCollection<E : Any> : CollectionEnvelope<E> {

    constructor(list: Collection<E>) : super(StickyScalar<Collection<E>>({ list.toList() }))

    constructor(vararg items: E) : this(IterableOf<E>(items.iterator()))

    constructor(items: Iterator<E>) : this(IterableOf<E>(items))

    constructor(items: Iterable<E>) : this(CollectionOf<E>(items))
}
