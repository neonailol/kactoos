package nnl.rocks.kactoos.list

import nnl.rocks.kactoos.KScalar
import nnl.rocks.kactoos.Scalar
import nnl.rocks.kactoos.iterator.Immutable

/**
 * List envelope.
 *
 * There is no thread-safety guarantee.
 *
 * @param T Element type.
 * @param list Encapsulated list.
 * @since 0.3
 */
abstract class ListEnvelope<T : Any>(
    private val list: KScalar<List<T>>
) : List<T> by list() {

    constructor(list: List<T>) : this({ list })

    constructor(list: Scalar<List<T>>) : this({ list() })

    override fun iterator(): Iterator<T> = Immutable(list().iterator())

    override fun listIterator(): ListIterator<T> = ListIterator(list())

    override fun listIterator(index: Int): ListIterator<T> = ListIterator(list(), index)
}
