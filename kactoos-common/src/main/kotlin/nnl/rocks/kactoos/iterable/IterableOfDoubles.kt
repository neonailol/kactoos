package nnl.rocks.kactoos.iterable

/**
 * Iterable of double values.
 *
 * @since 0.4
 */
class IterableOfDoubles(vararg values: Double) : IterableEnvelope<Double>(values.asIterable())
