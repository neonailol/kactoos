package nnl.rocks.kactoos.iterable

/**
 * Iterable of float values.
 *
 * @since 0.5
 */
class IterableOfFloats(vararg values: Float) : IterableEnvelope<Float>(values.asIterable())
