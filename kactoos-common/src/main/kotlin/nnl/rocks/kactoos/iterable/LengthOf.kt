package nnl.rocks.kactoos.iterable

import nnl.rocks.kactoos.iterator.LengthOf
import nnl.rocks.kactoos.scalar.NumberEnvelope

/**
 * Length of iterable.
 *
 * There is no thread-safety guarantee.
 *
 * @since 0.1
 */
class LengthOf(items: Iterable<*>) : NumberEnvelope(
    {
        LengthOf(items.iterator()).toDouble()
    }
)
