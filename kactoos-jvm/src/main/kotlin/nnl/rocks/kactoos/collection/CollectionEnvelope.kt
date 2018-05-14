package nnl.rocks.kactoos.collection

import nnl.rocks.kactoos.Scalar
import nnl.rocks.kactoos.scalar.UncheckedScalar

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
    private val col: UncheckedScalar<Collection<X>>
) : Collection<X> by col() {

    constructor(slr: Scalar<Collection<X>>) : this(UncheckedScalar(slr))
}
