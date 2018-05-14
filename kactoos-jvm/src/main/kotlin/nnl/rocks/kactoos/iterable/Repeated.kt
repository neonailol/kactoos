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
 */
class Repeated<T : Any>(
    total: Int,
    item: KScalar<T>
) : IterableEnvelope<T>(
     {
        Iterable {
            Repeated<T>(total, item)
        }
    }
) {

    /**
     * Ctor.
     * @param total The total number of repetitions
     * @param elm The element to repeat
     */
    constructor(
        total: Int,
        elm: T
    ) : this(total, { elm })

}
