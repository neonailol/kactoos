package nnl.rocks.kactoos.list

import nnl.rocks.kactoos.KScalar
import nnl.rocks.kactoos.Scalar

/**
 * List envelope.
 *
 * There is no thread-safety guarantee.
 *
 * @param T Element type.
 * @param list Encapsulated list.
 * @since 0.3
 */
open class ListEnvelope<T : Any>(
    private val list: KScalar<List<T>>
) : List<T> by list() {

    constructor(list: List<T>) : this({ list })

    constructor(list: Scalar<List<T>>) : this({ list() })
}