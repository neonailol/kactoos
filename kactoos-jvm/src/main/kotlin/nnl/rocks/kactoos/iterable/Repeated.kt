package nnl.rocks.kactoos.iterable

import nnl.rocks.kactoos.Scalar
import nnl.rocks.kactoos.iterator.Repeated
import nnl.rocks.kactoos.scalar.Constant
import nnl.rocks.kactoos.scalar.UncheckedScalar

/**
 * Repeat an element.
 *
 * If you need to repeat endlessly, use [Endless].
 *
 *
 *
 *
 * @param T Element type
 * @since 0.1
 */
class Repeated<T : Any>(
    total: Int,
    item: UncheckedScalar<T>
) : IterableEnvelope<T>(
    Constant {
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
    ) : this(total, Constant { elm })

    /**
     * Ctor.
     * @param total The total number of repetitions
     * @param elm The element to repeat
     */
    constructor(
        total: Int,
        elm: Scalar<T>
    ) : this(total, UncheckedScalar<T>(elm))
}
