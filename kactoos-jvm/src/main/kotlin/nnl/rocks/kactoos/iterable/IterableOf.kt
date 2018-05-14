package nnl.rocks.kactoos.iterable

import nnl.rocks.kactoos.KScalar

/**
 * Array as iterable.
 *
 * There is no thread-safety guarantee.
 *
 *
 *
 * @param X Type of item
 * @since 0.12
 */
class IterableOf<X : Any> : IterableEnvelope<X> {

    constructor(scalar: KScalar<Iterator<X>>) : super(
         { Iterable { scalar.invoke() } }
    )

    /**
     * @param items The array
     */
    @SafeVarargs
    constructor(vararg items: X) : this( { items.iterator() })

    /**
     * @param list The List
     */
    constructor(list: List<X>) : this( { list.iterator() })

    /**
     * @param set The Set
     */
    constructor(set: Set<X>) : this( { set.iterator() })

    /**
     * @param iterator The Iterator
     */
    constructor(iterator: Iterator<X>) : this( { iterator })
}
