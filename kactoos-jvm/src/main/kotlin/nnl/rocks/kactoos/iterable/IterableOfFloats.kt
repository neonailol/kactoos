package nnl.rocks.kactoos.iterable

import nnl.rocks.kactoos.iterator.IteratorOfFloats

/**
 * Iterable of float values.
 *
 * @since 0.5
 */
class IterableOfFloats(vararg values: Float) : IterableEnvelope<Float>({ IterableOf(IteratorOfFloats(*values)) })
