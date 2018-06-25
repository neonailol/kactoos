package nnl.rocks.kactoos.collection

import nnl.rocks.kactoos.iterable.IterableOf
import nnl.rocks.kactoos.scalar.StickyScalar

/**
 * Collection decorator that goes through the list only once.
 *
 * There is no thread-safety guarantee.
 *
 * @param E Type of item
 * @since 0.4
 */
class StickyCollection<E : Any> : CollectionEnvelope<E> {

    constructor(source: Collection<E>) : super(StickyScalar<Collection<E>> { source })

    constructor(vararg args: E) : this(IterableOf(args.asIterable()))

    constructor(iterable: Iterable<E>) : this(CollectionOf(iterable))
}
