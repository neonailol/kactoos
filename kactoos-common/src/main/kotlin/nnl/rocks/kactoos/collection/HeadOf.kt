package nnl.rocks.kactoos.collection

import nnl.rocks.kactoos.iterable.HeadOf
import nnl.rocks.kactoos.iterable.IterableOf

/**
 * Head portion of collection.
 *
 * There is no thread-safety guarantee.
 *
 * @param T Type of source item
 * @param num Number of head elements
 * @param src Source collection
 * @since 0.4
 */
class HeadOf<out T : Any>(
    num: Int,
    src: Collection<T>
) : CollectionEnvelope<T>({ CollectionOf<T>(HeadOf<T>(num, src)) }) {

    constructor(num: Int, vararg src: T) : this(num, IterableOf(src.asIterable()))

    constructor(num: Int, src: Iterable<T>) : this(num, CollectionOf(src))

}
