package nnl.rocks.kactoos.collection

import nnl.rocks.kactoos.Func
import nnl.rocks.kactoos.KFunc
import nnl.rocks.kactoos.iterable.IterableOf
import nnl.rocks.kactoos.iterable.Mapped

/**
 * Mapped collection.
 *
 * There is no thread-safety guarantee.
 *
 * @param X Type of source item
 * @param Y Type of target item
 * @since 0.3
 */
class Mapped<out X : Any, out Y : Any>(
    fnc: KFunc<X, Y>,
    src: Collection<X>
) : CollectionEnvelope<Y>({ CollectionOf(Mapped(fnc, src)) }) {

    constructor(
        fnc: KFunc<X, Y>,
        src: Iterable<X>
    ) : this(fnc, CollectionOf(src))

    constructor(
        fnc: KFunc<X, Y>,
        vararg src: X
    ) : this(fnc, IterableOf(src.asIterable()))

    constructor(
        fnc: Func<X, Y>,
        src: Iterable<X>
    ) : this({ x -> fnc.apply(x) }, CollectionOf(src))

    constructor(
        fnc: Func<X, Y>,
        vararg src: X
    ) : this({ x -> fnc.apply(x) }, IterableOf(src.asIterable()))
}
