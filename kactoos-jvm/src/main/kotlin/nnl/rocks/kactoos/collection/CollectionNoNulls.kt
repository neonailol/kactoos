package nnl.rocks.kactoos.collection

import nnl.rocks.kactoos.KScalar
import nnl.rocks.kactoos.iterator.IteratorNoNulls

/**
 * A decorator of [Collection] that tolerates no NULLs.
 *
 * There is no thread-safety guarantee.
 *
 * @param X Element type
 * @since 0.3
 */
class CollectionNoNulls<X : Any>(
    private val col: KScalar<Collection<X>>
) : Collection<X> by col() {

    constructor(col: CollectionEnvelope<X>) : this({ col.toList() })

    constructor(col: Collection<X>) : this({ col.toList() })

    override fun iterator(): Iterator<X> = IteratorNoNulls(col().iterator())
}
