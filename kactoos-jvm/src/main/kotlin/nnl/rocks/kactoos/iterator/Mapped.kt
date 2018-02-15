package nnl.rocks.kactoos.iterator

import nnl.rocks.kactoos.Func
import nnl.rocks.kactoos.func.UncheckedFunc
import nnl.rocks.kactoos.text.TextOf

/**
 * Mapped iterator.
 *
 *
 * There is no thread-safety guarantee.
 *
 *
 *
 * @param X Type of source item
 * @param Y Type of target item
 * @since 0.1
 */
class Mapped<X : Any, out Y : Any>(
    private val fnc: Func<X, Y>,
    private val origin: Iterator<X>
) : Iterator<Y> {

    override fun hasNext(): Boolean = this.origin.hasNext()

    override fun next(): Y = UncheckedFunc(this.fnc).apply(this.origin.next())

    override fun toString(): String {
        return TextOf(Iterable { this }).asString()
    }
}
