package nnl.rocks.kactoos.list

import nnl.rocks.kactoos.KScalar
import nnl.rocks.kactoos.Scalar
import nnl.rocks.kactoos.scalar.StickyScalar

/**
 * Iterator of the list.
 *
 * There is no thread-safety guarantee.
 *
 * @param T Items type
 * @param origin Original list iterator.
 * @since 0.4
 */
class ListIterator<T : Any>(
    private val origin: Scalar<kotlin.collections.ListIterator<T>>
) : kotlin.collections.ListIterator<T> by origin() {

    constructor(origin: KScalar<kotlin.collections.ListIterator<T>>) : this(StickyScalar { origin() })

    constructor(list: List<T>) : this({ list.listIterator() })

    constructor(list: List<T>, index: Int) : this({ list.listIterator(index) })

    constructor(iterator: kotlin.collections.ListIterator<T>) : this({ iterator })

}
