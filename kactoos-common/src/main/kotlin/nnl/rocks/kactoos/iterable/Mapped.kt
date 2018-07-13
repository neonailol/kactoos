package nnl.rocks.kactoos.iterable

import nnl.rocks.kactoos.Func
import nnl.rocks.kactoos.KFunc
import nnl.rocks.kactoos.iterator.Mapped

/**
 * Mapped iterable.
 *
 * There is no thread-safety guarantee.
 *
 * @param X Type of source item
 * @param Y Type of target item
 * @param func Func
 * @param iterable Source iterable
 * @since 0.4
 */
class Mapped<out X : Any, out Y : Any>(
    func: KFunc<X, Y>,
    iterable: Iterable<X>
) : IterableEnvelope<Y>({ IterableOf { Mapped(func, iterable.iterator()) } }) {

    constructor(
        func: KFunc<X, Y>,
        vararg args: X
    ) : this(func, args.asIterable())

    constructor(
        func: Func<X, Y>,
        vararg args: X
    ) : this(
        { x -> func.apply(x) },
        args.asIterable()
    )

    constructor(
        func: Func<X, Y>,
        iterable: Iterable<X>
    ) : this(
        { x -> func.apply(x) },
        iterable
    )
}
