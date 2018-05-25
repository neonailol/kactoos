package nnl.rocks.kactoos.iterable

import nnl.rocks.kactoos.iterator.IteratorOfInts

/**
 * Iterable of integer values.
 *
 * @since 0.5
 */
class IterableOfInts(vararg values: Int) : IterableEnvelope<Int>({ IterableOf(IteratorOfInts(*values)) })
