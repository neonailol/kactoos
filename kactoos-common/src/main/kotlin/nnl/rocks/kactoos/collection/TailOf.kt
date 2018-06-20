package nnl.rocks.kactoos.collection

import nnl.rocks.kactoos.iterable.IterableOf
import nnl.rocks.kactoos.iterable.TailOf

/**
 * Tail portion of the collection.
 *
 * There is no thread-safety guarantee.
 *
 * @param T Element type
 * @param num Number of tail elements
 * @param src Source collection
 * @since 0.4
 */
class TailOf<T : Any>(
    num: Int,
    src: Collection<T>
) : CollectionEnvelope<T>({ CollectionOf(TailOf(num, src)) }) {

    constructor(num: Int, vararg src: T) : this(num, IterableOf(src.asIterable()))

    constructor(num: Int, src: Iterable<T>) : this(num, CollectionOf(src))
}
