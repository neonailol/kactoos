package nnl.rocks.kactoos.collection

import nnl.rocks.kactoos.KScalar
import nnl.rocks.kactoos.iterator.IteratorNoNulls
import java.util.concurrent.atomic.AtomicLong

/**
 * A decorator of [Collection] that tolerates no NULLs.
 *
 * There is no thread-safety guarantee.
 *
 * @param X Element type
 * @since 0.3
 */
class CollectionNoNulls<X : Any>(
    private val col: KScalar<MutableCollection<X>>
) : MutableCollection<X> by col() {

    constructor(col: CollectionEnvelope<X>) : this({ col.toMutableList() })

    constructor(col: Collection<X>) : this({ col.toMutableList() })

    override fun iterator(): MutableIterator<X> {
        return IteratorNoNulls(this.col().iterator(), AtomicLong())
    }
}
