package nnl.rocks.kactoos.iterable

import nnl.rocks.kactoos.iterator.IteratorOfShorts

/**
 * Iterable of short values.
 *
 * @since 0.5
 */
class IterableOfShorts(vararg values: Short) : IterableEnvelope<Short>({ IterableOf(IteratorOfShorts(*values)) })
