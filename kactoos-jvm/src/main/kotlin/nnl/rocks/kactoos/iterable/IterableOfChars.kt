package nnl.rocks.kactoos.iterable

import nnl.rocks.kactoos.iterator.IteratorOfChars

/**
 * Iterable of characters.
 *
 * @since 0.5
 */
class IterableOfChars(vararg chars: Char) : IterableEnvelope<Char>({ IterableOf(IteratorOfChars(*chars)) })
