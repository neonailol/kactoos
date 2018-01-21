package nnl.rocks.kactoos.list

import nnl.rocks.kactoos.Scalar
import nnl.rocks.kactoos.scalar.UncheckedScalar

/**
 * List envelope.
 *
 * There is no thread-safety guarantee.
 *
 * @param T Element type
 * @since 0.23
 */
open class ListEnvelope<T : Any>(
    private val list: UncheckedScalar<List<T>>
) : List<T> by list.value() {

    constructor(src: Scalar<List<T>>) : this(UncheckedScalar(src))
}
