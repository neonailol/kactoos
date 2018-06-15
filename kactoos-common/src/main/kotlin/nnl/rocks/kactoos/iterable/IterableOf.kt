package nnl.rocks.kactoos.iterable

import nnl.rocks.kactoos.KScalar
import nnl.rocks.kactoos.Scalar

/**
 * Array as iterable.
 *
 * There is no thread-safety guarantee.
 *
 * @param T Type of item
 * @since 0.4
 */
class IterableOf<out T : Any> : IterableEnvelope<T> {

    constructor(scalar: KScalar<Iterator<T>>) : super(Iterable { scalar() })

    constructor(vararg items: T) : super(items.asIterable())

    constructor(scalar: Scalar<Iterator<T>>) : this({ scalar() })

    constructor(list: List<T>) : this({ list.iterator() })

    constructor(set: Set<T>) : this({ set.iterator() })

    constructor(iterable: Iterable<T>) : super(iterable)

}
