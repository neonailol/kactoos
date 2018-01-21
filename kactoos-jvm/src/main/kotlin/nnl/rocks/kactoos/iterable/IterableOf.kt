package nnl.rocks.kactoos.iterable

import nnl.rocks.kactoos.Scalar
import nnl.rocks.kactoos.scalar.ScalarOf
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

    constructor(sclr: Scalar<Iterator<X>>) : super(
        ScalarOf { Iterable { UncheckedScalar(sclr).value() } }
    )

    /**
     * @param items The array
     */
    @SafeVarargs
    constructor(vararg items: X) : this(ScalarOf { items.iterator() })

    /**
     * @param list The list
     */
    constructor(list: List<X>) : this(ScalarOf<Iterator<X>> { list.iterator() })

    /**
     * @param list The list
     * @since 0.21
     */
    constructor(list: Iterator<X>) : this(ScalarOf { list })
}
