package nnl.rocks.kactoos.collection

import nnl.rocks.kactoos.Scalar
import nnl.rocks.kactoos.scalar.Constant

/**
 * Base read-only collection.
 *
 * There is no thread-safety guarantee.
 *
 * @param X Element type.
 * @param col Encapsulated collection.
 * @since 0.3
 */
open class CollectionEnvelope<X : Any>(
    private val col: Scalar<Collection<X>>
) : Collection<X> by col() {

    constructor(col: Collection<X>) : this(Constant { col })
}
