package nnl.rocks.kactoos.iterable

import nnl.rocks.kactoos.Func
import nnl.rocks.kactoos.KFunc
import nnl.rocks.kactoos.iterator.Filtered

/**
 * Filtered iterable.
 *
 * You can use it in order to create a declarative/lazy
 * version of a filtered collection/iterable. For example,
 * this code will create a list of two strings "red" and "fox":
 *
 * ```
 * val filtered = Filtered(
 *     { input -> input.length < 4 },
 *     IterableOf("red", "lazy", "fox")
 * )
 * ```
 *
 * There is no thread-safety guarantee.
 *
 * @param X Type of item
 * @param fnc Predicate
 * @param src Source
 * @since 0.1
 */
class Filtered<X : Any>(
    fnc: KFunc<X, Boolean>,
    src: Iterable<X>
) : IterableEnvelope<X>(IterableOf(Filtered(fnc, src.iterator()))) {

    constructor(
        fnc: KFunc<X, Boolean>,
        vararg src: X
    ) : this(fnc, IterableOf(src.iterator()))

    constructor(
        fnc: KFunc<X, Boolean>,
        src: Iterator<X>
    ) : this(fnc, IterableOf(src))

    constructor(
        fnc: Func<X, Boolean>,
        src: Iterable<X>
    ) : this({ x -> fnc.apply(x) }, src)
}
