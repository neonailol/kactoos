package nnl.rocks.kactoos.collection

import nnl.rocks.kactoos.iterable.IterableOf
import nnl.rocks.kactoos.scalar.ScalarOf
import java.util.Collections
import java.util.LinkedList

/**
 * Reversed collection.
 *
 * Pay attention that sorting will happen on each operation
 * with the collection. Every time you touch it, it will fetch the
 * entire collection from the encapsulated object and reverse it. If you
 * want to avoid that "side-effect", decorate it with
 * [StickyCollection].
 *
 * There is no thread-safety guarantee.
 *
 * @param X Type of source item
 * @since 1.16
 */
class Reversed<X : Any> : CollectionEnvelope<X> {

    constructor(src: Collection<X>) : super(
        ScalarOf {
            val items = LinkedList<X>()
            items.addAll(src)
            Collections.reverse(items)
            items
        }
    )

    /**
     * @param src Source collection
     * @since 0.23
     */
    @SafeVarargs
    constructor(vararg src: X) : this(IterableOf<X>(src.iterator()))

    /**
     * @param src Source collection
     */
    constructor(src: Iterable<X>) : this(CollectionOf<X>(src))
}
