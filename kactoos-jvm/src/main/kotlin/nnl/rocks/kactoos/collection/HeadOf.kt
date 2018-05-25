package nnl.rocks.kactoos.collection

import nnl.rocks.kactoos.iterable.IterableOf

/**
 * Head portion of collection.
 *
 * There is no thread-safety guarantee.
 *
 * @param T Type of source item
 * @param num Number of head elements
 * @param src Source collection
 * @since 0.5
 */
class HeadOf<T : Any>(
    num: Int,
    src: Collection<T>
) : CollectionEnvelope<T>({ CollectionOf<T>(nnl.rocks.kactoos.iterable.HeadOf<T>(num, src)) }) {

    constructor(num: Int, vararg src: T) : this(num, IterableOf<T>(*src))

    constructor(num: Int, src: Iterable<T>) : this(num, CollectionOf<T>(src))

}
