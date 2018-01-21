package nnl.rocks.kactoos.collection

import nnl.rocks.kactoos.iterable.Joined
import nnl.rocks.kactoos.scalar.ScalarOf

/**
 * Joined collection.
 *
 * There is no thread-safety guarantee.
 *
 * @param X Type of source item
 * @since 1.16
 */
class Joined<X : Any> : CollectionEnvelope<X> {

    constructor(list: Iterable<Iterable<X>>) : super(
        ScalarOf { CollectionOf<X>(Joined<X>(list)) }
    )

    /**
     * @param list Items to concatenate
     */
    @SafeVarargs
    constructor(vararg list: Iterable<X>) : this(CollectionOf<Iterable<X>>(list.iterator()))
}
