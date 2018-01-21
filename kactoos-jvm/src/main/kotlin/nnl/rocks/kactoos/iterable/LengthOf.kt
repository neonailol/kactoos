package nnl.rocks.kactoos.iterable

import nnl.rocks.kactoos.iterator.LengthOf
import nnl.rocks.kactoos.scalar.NumberEnvelope
import nnl.rocks.kactoos.scalar.ScalarOf

/**
 * Length of iterable.
 *
 * There is no thread-safety guarantee.
 *
 *
 *
 * @since 0.1
 */
class LengthOf(items: Iterable<*>) : NumberEnvelope(
    ScalarOf {
        LengthOf(
            items.iterator()
        ).toDouble()
    }
)
