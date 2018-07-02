package nnl.rocks.kactoos.collection

import nnl.rocks.kactoos.Func
import nnl.rocks.kactoos.KFunc
import nnl.rocks.kactoos.iterable.Filtered
import nnl.rocks.kactoos.iterable.IterableOf

/**
 * Filtered collection.
 *
 * There is no thread-safety guarantee.
 *
 * @param X Type of source item.
 * @since 0.4
 */
class Filtered<out X : Any>(
    func: KFunc<X, Boolean>,
    src: Iterable<X>
) : CollectionEnvelope<X>({ CollectionOf(Filtered(func, src)) }) {

    constructor(
        func: KFunc<X, Boolean>,
        vararg src: X
    ) : this(func, IterableOf(src.asIterable()))

    constructor(
        func: Func<X, Boolean>,
        vararg src: X
    ) : this({ x -> func.apply(x) }, IterableOf(src.asIterable()))

    constructor(
        func: Func<X, Boolean>,
        src: Iterable<X>
    ) : this({ x -> func.apply(x) }, src)
}
