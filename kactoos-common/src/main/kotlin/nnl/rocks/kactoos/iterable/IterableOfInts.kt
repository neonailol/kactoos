package nnl.rocks.kactoos.iterable

/**
 * Iterable of integer values.
 *
 * @since 0.5
 */
class IterableOfInts(vararg values: Int) : IterableEnvelope<Int>(values.asIterable())
