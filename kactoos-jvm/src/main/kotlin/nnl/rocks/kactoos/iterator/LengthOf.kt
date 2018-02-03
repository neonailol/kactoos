package nnl.rocks.kactoos.iterator

import nnl.rocks.kactoos.scalar.NumberEnvelope
import nnl.rocks.kactoos.scalar.ScalarOf

/**
 * Length of iterator.
 *
 * There is no thread-safety guarantee.
 *
 *
 *
 * @since 0.1
 */
class LengthOf(iterator: Iterator<*>) : NumberEnvelope(
    ScalarOf {
        var size = 0
        while (iterator.hasNext()) {
            iterator.next()
            ++ size
        }
        size.toDouble()
    }
)
