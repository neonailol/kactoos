package nnl.rocks.kactoos.list

import nnl.rocks.kactoos.Func
import nnl.rocks.kactoos.collection.Mapped
import nnl.rocks.kactoos.scalar.ScalarOf

/**
 * Mapped list.
 *
 * There is no thread-safety guarantee.
 *
 *
 *
 * @param X Type of source item
 * @param Y Type of target item
 * @since 0.14
 */
class Mapped<X : Any, Y : Any>(
    fnc: Func<X, Y>,
    src: Collection<X>
) : ListEnvelope<Y>(
    ScalarOf { ListOf<Y>(Mapped<X, Y>(fnc, src)) }
) {

    /**
     * @param src Source list
     * @param fnc Func
     * @since 0.21
     */
    constructor(
        fnc: Func<X, Y>,
        src: Iterator<X>
    ) : this(fnc, ListOf<X>(src))

    /**
     * @param src Source list
     * @param fnc Func
     */
    constructor(
        fnc: Func<X, Y>,
        src: Iterable<X>
    ) : this(fnc, ListOf<X>(src))
}
