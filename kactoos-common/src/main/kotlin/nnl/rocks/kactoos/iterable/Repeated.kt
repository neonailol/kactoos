package nnl.rocks.kactoos.iterable

import nnl.rocks.kactoos.KScalar
import nnl.rocks.kactoos.iterator.Repeated

/**
 * Repeat an element.
 *
 * If you need to repeat endlessly, use [Endless].
 *
 * @param T Element type
 * @since 0.1
 * @param total The total number of repetitions
 * @param item The element to repeat
 */
class Repeated<out T : Any>(
    total: Int,
    item: KScalar<T>
) : IterableEnvelope<T>({ IterableOf { Repeated(total, item) } }) {

    constructor(
        total: Int,
        elm: T
    ) : this(total, { elm })

}
