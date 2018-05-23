package nnl.rocks.kactoos.collection

import nnl.rocks.kactoos.KScalar

/**
 * Base read-only collection.
 *
 * There is no thread-safety guarantee.
 *
 * @param X Element type.
 * @param collection Encapsulated collection.
 * @since 0.3
 */
open class CollectionEnvelope<X : Any>(
    private val collection: KScalar<Collection<X>>
) : Collection<X> by collection() {

    constructor(collection: Collection<X>) : this({ collection })
}