package nnl.rocks.kactoos.iterable

/**
 * Reverse iterable.
 *
 * There is no thread-safety guarantee.
 *
 * @param X Type of item
 * @since 0.4
 */
class Reversed<X : Any>(
    src: Iterable<X>
) : IterableEnvelope<X>({ src.reversed() }) {

    constructor(vararg src: X) : this(src.asIterable())
}
