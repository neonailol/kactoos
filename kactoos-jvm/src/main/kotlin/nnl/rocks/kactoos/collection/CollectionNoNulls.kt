package nnl.rocks.kactoos.collection

import nnl.rocks.kactoos.Scalar
import nnl.rocks.kactoos.iterator.IteratorNoNulls
import nnl.rocks.kactoos.scalar.ScalarOf
import java.util.concurrent.atomic.AtomicLong

/**
 * A decorator of [Collection] that tolerates no NULLs.
 *
 * There is no thread-safety guarantee.
 *
 * @param X Element type
 * @since 0.27
 */
class CollectionNoNulls<X : Any>(
    private val col: Scalar<MutableCollection<X>>
) : MutableCollection<X> by col.value() {

    constructor(col: CollectionEnvelope<X>) : this(ScalarOf { col.toMutableList() })

    constructor(col: Collection<X>) : this(ScalarOf { col.toMutableList() })

    override fun iterator(): MutableIterator<X> {
        return IteratorNoNulls(this.col.value().iterator(), AtomicLong())
    }
}
