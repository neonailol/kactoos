package nnl.rocks.kactoos.list

import java.util.Collections
import java.util.LinkedList

/**
 * Shuffled list.
 *
 * Pay attention that shuffling will happen on each operation
 * with the collection. Every time you touch it, it will fetch the
 * entire list from the encapsulated object and sort it. If you
 * want to avoid that "side-effect", decorate it with
 * [StickyList].
 *
 * There is no thread-safety guarantee.
 *
 *
 *
 * @param T Element type
 * @see StickyList
 * @since 0.23
 */
class Shuffled<T : Any>
(src: Collection<T>) : ListEnvelope<T>(
    {
        val items = LinkedList<T>()
        items.addAll(src)
        Collections.shuffle(items)
        Collections.unmodifiableList<T>(items)
    }
) {

    /**
     * @param src The underlying collection
     */
    @SafeVarargs
    constructor(vararg src: T) : this(ListOf<T>(src.iterator()))

    /**
     * @param src The underlying collection
     */
    constructor(src: Iterator<T>) : this(Iterable { src })

    /**
     * @param src The underlying collection
     */
    constructor(src: Iterable<T>) : this(ListOf<T>(src))
}
