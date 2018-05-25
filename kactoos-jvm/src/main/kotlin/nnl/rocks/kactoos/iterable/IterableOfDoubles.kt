package nnl.rocks.kactoos.iterable

import nnl.rocks.kactoos.iterator.IteratorOfDoubles

/**
 * Iterable of double values.
 *
 * @since 0.5
 */
class IterableOfDoubles(vararg values: Double) : IterableEnvelope<Double>({ IterableOf(IteratorOfDoubles(*values)) })
