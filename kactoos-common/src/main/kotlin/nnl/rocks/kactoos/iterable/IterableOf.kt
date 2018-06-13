package nnl.rocks.kactoos.iterable

import nnl.rocks.kactoos.KScalar
import nnl.rocks.kactoos.Scalar

/**
 * Array as iterable.
 *
 * There is no thread-safety guarantee.
 *
 * @param X Type of item
 * @since 0.4
 */
class IterableOf<X : Any> : IterableEnvelope<X> {

    constructor(scalar: KScalar<Iterator<X>>) : super(
        Iterable { scalar() }
    )

    constructor(scalar: Scalar<Iterator<X>>) : this({ scalar() })

    constructor(vararg items: X) : this({ items.iterator() })

    constructor(list: List<X>) : this({ list.iterator() })

    constructor(set: Set<X>) : this({ set.iterator() })

    constructor(iterator: Iterator<X>) : this({ iterator })
}
