package nnl.rocks.kactoos.iterable

/**
 * Iterable of long values.
 *
 * @since 0.4
 */
class IterableOfLongs(vararg values: Long) : IterableEnvelope<Long>(values.asIterable())
