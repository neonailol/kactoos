package nnl.rocks.kactoos.list

/**
 * Joined list.
 *
 * There is no thread-safety guarantee.
 *
 * @param X Type of source item
 * @since 0.20
 */
class Joined<X : Any> : ListEnvelope<X> {

    constructor(src: Iterable<List<X>>) : super( { src.flatMap { it } })

    @SafeVarargs
    constructor(vararg src: List<X>) : this(ListOf<List<X>>(src.iterator()))
}
