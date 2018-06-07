package nnl.rocks.kactoos.iterable

/**
 * Iterable of short values.
 *
 * @since 0.5
 */
class IterableOfShorts(vararg values: Short) : IterableEnvelope<Short>(values.asIterable())
