package nnl.rocks.kactoos.iterable

import nnl.rocks.kactoos.iterator.IteratorOfBooleans

/**
 * Iterable of boolean values.
 *
 * @since 0.5
 */
class IterableOfBooleans(vararg values: Boolean) : IterableEnvelope<Boolean>({ IterableOf(IteratorOfBooleans(*values)) })
