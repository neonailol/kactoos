package nnl.rocks.kactoos.iterable

/**
 * Iterable of boolean values.
 *
 * @since 0.5
 */
class IterableOfBooleans(vararg values: Boolean) : IterableEnvelope<Boolean>(values.asIterable())
