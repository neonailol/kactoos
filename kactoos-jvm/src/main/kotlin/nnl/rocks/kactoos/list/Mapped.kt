package nnl.rocks.kactoos.list

import nnl.rocks.kactoos.Func
import nnl.rocks.kactoos.collection.Mapped
import nnl.rocks.kactoos.text.TextOf

/**
 * Mapped list.
 *
 * There is no thread-safety guarantee.
 *
 * @param X Type of source item
 * @param Y Type of target item
 * @since 0.4
 */
class Mapped<X : Any, Y : Any> : ListEnvelope<Y> {

    constructor(fnc: Func<X, Y>, src: Collection<X>) : super(
        { ListOf(Mapped(fnc, src)) }
    )

    constructor(
        fnc: Func<X, Y>,
        src: Iterator<X>
    ) : this(fnc, ListOf(src))

    constructor(
        fnc: Func<X, Y>,
        src: Iterable<X>
    ) : this(fnc, ListOf(src))

    override fun toString(): String {
        return TextOf(this).asString()
    }
}
