package nnl.rocks.kactoos.iterable

import nnl.rocks.kactoos.Func
import nnl.rocks.kactoos.iterator.Mapped
import nnl.rocks.kactoos.scalar.ScalarOf

/**
 * Mapped iterable.
 *
 * @param fnc Func
 * @param src Source iterable
 *
 * There is no thread-safety guarantee.
 *
 *
 *
 * @param X Type of source item
 * @param Y Type of target item
 * @since 0.1
 */
class Mapped<X : Any, Y : Any> : IterableEnvelope<Y> {

    constructor(
        fnc: Func<X, Y>,
        src: Iterable<X>
    ) : super(
        ScalarOf { Iterable { Mapped<X, Y>(fnc, src.iterator()) } }
    )

    /**
     * Ctor.
     * @param fnc Func
     * @param args Source iterable
     */
    @SafeVarargs
    constructor(
        fnc: Func<X, Y>,
        vararg args: X
    ) : this(fnc, IterableOf(args.iterator()))

    /**
     * @param fnc Func
     * @param src Source iterable
     */
    constructor(
        fnc: Func<X, Y>,
        src: Iterator<X>
    ) : this(fnc, IterableOf<X>(src))
}
