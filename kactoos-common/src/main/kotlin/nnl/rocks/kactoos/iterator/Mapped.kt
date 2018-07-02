package nnl.rocks.kactoos.iterator

import nnl.rocks.kactoos.Func
import nnl.rocks.kactoos.KFunc

/**
 * Mapped iterator.
 *
 * There is no thread-safety guarantee.
 *
 * @param X Type of source item
 * @param Y Type of target item
 * @param func Mapping function
 * @param origin Decorated iterator
 * @since 0.4
 */
class Mapped<out X : Any, out Y : Any>(
    private val func: KFunc<X, Y>,
    private val origin: Iterator<X>
) : Iterator<Y> {

    constructor(func: Func<X, Y>, origin: Iterator<X>) : this({ x: X -> func.apply(x) }, origin)

    override fun hasNext(): Boolean = origin.hasNext()

    override fun next(): Y = func(origin.next())
}
