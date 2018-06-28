package nnl.rocks.kactoos.iterable

/**
 * Iterable of float values.
 *
 * @since 0.4
 */
class IterableOfFloats(vararg values: Float) : IterableEnvelope<Float>(values.asIterable())
