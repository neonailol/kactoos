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
 * @since 0.14
 */
class Mapped<X : Any, Y : Any> : CollectionEnvelope<Y> {

    constructor(
        fnc: KFunc<X, Y>,
        src: Collection<X>
    ) : super(
        { CollectionOf<Y>(Mapped<X, Y>(fnc, src)) }
    )

    /**
     * @param src Source collection
     * @param fnc Func
     * @since 0.23
     */
    @SafeVarargs
    constructor(
        fnc: KFunc<X, Y>,
        vararg src: X
    ) : this(fnc, IterableOf<X>(src.iterator()))

    /**
     * @param src Source collection
     * @param fnc Func
     * @since 0.23
     */
    constructor(
        fnc: KFunc<X, Y>,
        src: Iterator<X>
    ) : this(fnc, IterableOf<X>(src))

    /**
     * @param src Source collection
     * @param fnc Func
     */
    constructor(
        fnc: KFunc<X, Y>,
        src: Iterable<X>
    ) : this(fnc, CollectionOf<X>(src))
}
