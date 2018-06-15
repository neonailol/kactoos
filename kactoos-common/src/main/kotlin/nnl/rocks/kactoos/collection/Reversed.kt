package nnl.rocks.kactoos.collection

import nnl.rocks.kactoos.iterable.IterableOf

/**
 * Reversed collection.
 *
 * Pay attention that sorting will happen on each operation
 * with the collection. Every time you touch it, it will fetch the
 * entire collection from the encapsulated object and reverse it. If you
 * want to avoid that behaviour, decorate it with [StickyCollection].
 *
 * There is no thread-safety guarantee.
 *
 * @param X Type of source item
 * @since 0.4
 */
class Reversed<X : Any> : CollectionEnvelope<X> {

    constructor(src: Collection<X>) : super({ src.reversed() })

    constructor(vararg src: X) : this(src.asIterable())

    constructor(src: Iterable<X>) : this(CollectionOf(src))
}
