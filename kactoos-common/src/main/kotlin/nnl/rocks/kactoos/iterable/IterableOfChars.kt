package nnl.rocks.kactoos.iterable

/**
 * Iterable of characters.
 *
 * @since 0.4
 */
class IterableOfChars(vararg values: Char) : IterableEnvelope<Char>(values.asIterable())
