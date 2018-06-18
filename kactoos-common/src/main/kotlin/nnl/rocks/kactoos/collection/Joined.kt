package nnl.rocks.kactoos.collection

import nnl.rocks.kactoos.iterable.Joined

/**
 * A few Collections joined together.
 *
 * There is no thread-safety guarantee.
 *
 * @param X Type of source item
 * @since 0.4
 */
class Joined<X : Any> : CollectionEnvelope<X> {

    constructor(
        iterable: Iterable<Iterable<X>>
    ) : super({ CollectionOf(Joined(iterable)) })

    constructor(
        vararg args: Iterable<X>
    ) : this(CollectionOf(args.asIterable()))
}
