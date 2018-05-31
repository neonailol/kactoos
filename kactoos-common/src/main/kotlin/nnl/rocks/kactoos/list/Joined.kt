package nnl.rocks.kactoos.list

/**
 * Joined list.
 *
 * There is no thread-safety guarantee.
 *
 * @param X Type of source item
 * @since 0.4
 */
class Joined<X : Any> : ListEnvelope<X> {

    constructor(iterable: Iterable<List<X>>) : super({ iterable.flatMap { it } })

    constructor(vararg lists: List<X>) : this(ListOf(lists.iterator()))

    constructor(first: X, vararg lists: List<X>) : this(ListOf(first), *lists)
}
