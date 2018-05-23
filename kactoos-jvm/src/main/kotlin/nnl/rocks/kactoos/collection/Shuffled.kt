package nnl.rocks.kactoos.collection

import java.util.ArrayList

/**
 * Sorted collection.
 *
 * Pay attention that sorting will happen on each operation
 * with the collection. Every time you touch it, it will fetch the
 * entire collection from the encapsulated object and shuffle it. If you
 * want to avoid that "side-effect", decorate it with
 * [StickyCollection].
 *
 * There is no thread-safety guarantee.
 *
 * @param T Element type
 * @since 0.3
 */
class Shuffled<T : Any> : CollectionEnvelope<T> {

    constructor(src: Collection<T>) : super({ MutableList(src.size, { index: Int -> src.elementAt(index) } ).shuffled() })

    /**
     * @param src The underlying collection
     */
    @SafeVarargs
    constructor(vararg src: T) : this(CollectionOf<T>(src.iterator()))

    /**
     * @param src The underlying collection
     */
    constructor(src: Iterable<T>) : this(CollectionOf<T>(src))
}
