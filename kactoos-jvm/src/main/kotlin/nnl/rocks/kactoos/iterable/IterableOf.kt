package nnl.rocks.kactoos.iterable

import nnl.rocks.kactoos.Scalar
import nnl.rocks.kactoos.scalar.Constant
import nnl.rocks.kactoos.scalar.UncheckedScalar

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

    constructor(scalar: Scalar<Iterator<X>>) : super(
        Constant { Iterable { UncheckedScalar(scalar).value() } }
    )

    /**
     * @param items The array
     */
    @SafeVarargs
    constructor(vararg items: X) : this(Constant { items.iterator() })

    /**
     * @param list The List
     */
    constructor(list: List<X>) : this(Constant<Iterator<X>> { list.iterator() })

    /**
     * @param set The Set
     */
    constructor(set: Set<X>) : this(Constant<Iterator<X>> { set.iterator() })

    /**
     * @param iterator The Iterator
     */
    constructor(iterator: Iterator<X>) : this(Constant { iterator })
}
