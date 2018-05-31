package nnl.rocks.kactoos.list

import nnl.rocks.kactoos.KScalar
import nnl.rocks.kactoos.scalar.StickyScalar
import nnl.rocks.kactoos.scalar.UncheckedScalar

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
    private val origin: UncheckedScalar<kotlin.collections.ListIterator<T>>
) : kotlin.collections.ListIterator<T> by origin() {

    constructor(orig: KScalar<kotlin.collections.ListIterator<T>>) : this(UncheckedScalar(StickyScalar(orig)))

    constructor(list: List<T>) : this({ list.listIterator() })

    constructor(list: List<T>, index: Int) : this({ list.listIterator(index) })

    constructor(iter: kotlin.collections.ListIterator<T>) : this({ iter })

}
