package nnl.rocks.kactoos.iterable

/**
 * Iterable of double values.
 *
 * @since 0.5
 */
class IterableOfDoubles(vararg values: Double) : IterableEnvelope<Double>(values.asIterable())
