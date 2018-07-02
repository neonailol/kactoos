package nnl.rocks.kactoos.collection

import nnl.rocks.kactoos.KScalar
import nnl.rocks.kactoos.iterator.IteratorNoNulls

/**
 * A decorator of [Collection] that tolerates no NULLs.
 *
 * There is no thread-safety guarantee.
 *
 * @param X Element type
 * @param collection Encapsulated collection.
 * @since 0.3
 */
class CollectionNoNulls<out X : Any>(
    private val collection: KScalar<Collection<X>>
) : Collection<X> by collection() {

    constructor(collection: CollectionEnvelope<X>) : this({ collection.toList() })

    constructor(collection: Collection<X>) : this({ collection.toList() })

    override fun iterator(): Iterator<X> = IteratorNoNulls(collection().iterator())
}
