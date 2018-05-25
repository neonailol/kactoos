package nnl.rocks.kactoos.iterable

import nnl.rocks.kactoos.iterator.IteratorOfBytes

/**
 * Iterable of bytes.
 *
 * @since 0.5
 */
class IterableOfBytes(vararg bytes: Byte) : IterableEnvelope<Byte>({ IterableOf(IteratorOfBytes(*bytes)) })
