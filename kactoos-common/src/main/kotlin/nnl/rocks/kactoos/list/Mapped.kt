package nnl.rocks.kactoos.list

import nnl.rocks.kactoos.Func
import nnl.rocks.kactoos.KFunc
import nnl.rocks.kactoos.collection.Mapped

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

    constructor(fnc: KFunc<X, Y>, src: Collection<X>) : super({ ListOf(Mapped(fnc, src)) })

    constructor(fnc: KFunc<X, Y>, src: Iterable<X>) : this(fnc, ListOf(src))

    constructor(fnc: KFunc<X, Y>, vararg args: X) : this(fnc, args.asIterable())

    constructor(fnc: Func<X, Y>, src: Collection<X>) : super({ ListOf(Mapped(fnc, src)) })

    constructor(fnc: Func<X, Y>, src: Iterable<X>) : this(fnc, ListOf(src))

    constructor(fnc: Func<X, Y>, vararg args: X) : this(fnc, args.asIterable())
}
