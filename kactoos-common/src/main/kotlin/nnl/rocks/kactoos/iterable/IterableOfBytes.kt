package nnl.rocks.kactoos.iterable

/**
 * Iterable of bytes.
 *
 * @since 0.4
 */
class IterableOfBytes(vararg values: Byte) : IterableEnvelope<Byte>(values.asIterable())
