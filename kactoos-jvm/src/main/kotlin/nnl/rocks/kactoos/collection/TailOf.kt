package nnl.rocks.kactoos.collection

import nnl.rocks.kactoos.iterable.IterableOf

/**
 * Tail portion of the collection.
 *
 *
 * There is no thread-safety guarantee.
 *
 * @param T Element type
 * @param num Number of tail elements
 * @param src Source collection
 * @since 0.5
 */
class TailOf<T : Any>(
    num: Int,
    src: Collection<T>
) : CollectionEnvelope<T>({ CollectionOf<T>(nnl.rocks.kactoos.iterable.TailOf<T>(num, src)) }) {

    constructor(num: Int, vararg src: T) : this(num, IterableOf<T>(*src))

    constructor(num: Int, src: Iterable<T>) : this(num, CollectionOf<T>(src))
}
