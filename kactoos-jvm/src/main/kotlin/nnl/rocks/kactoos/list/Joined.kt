package nnl.rocks.kactoos.list

import nnl.rocks.kactoos.scalar.Constant

/**
 * Joined list.
 *
 * There is no thread-safety guarantee.
 *
 * @param X Type of source item
 * @since 0.20
 */
class Joined<X : Any> : ListEnvelope<X> {

    constructor(src: Iterable<List<X>>) : super(Constant { src.flatMap { it } })

    @SafeVarargs
    constructor(vararg src: List<X>) : this(ListOf<List<X>>(src.iterator()))
}
