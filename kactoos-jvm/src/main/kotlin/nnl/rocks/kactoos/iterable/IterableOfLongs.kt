package nnl.rocks.kactoos.iterable

import nnl.rocks.kactoos.iterator.IteratorOfLongs

/**
 * Iterable of long values.
 *
 * @since 0.5
 */
class IterableOfLongs(vararg values: Long) : IterableEnvelope<Long>({ IterableOf(IteratorOfLongs(*values)) })
