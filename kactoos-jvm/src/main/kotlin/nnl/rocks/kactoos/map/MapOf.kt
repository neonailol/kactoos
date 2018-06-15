package nnl.rocks.kactoos.map

import nnl.rocks.kactoos.Func
import nnl.rocks.kactoos.func.FuncOf
import nnl.rocks.kactoos.iterable.IterableOf
import nnl.rocks.kactoos.iterable.Joined
import nnl.rocks.kactoos.iterable.Mapped

/**
 * Iterable as [Map].
 *
 * This class should be used very carefully. You must understand that
 * it will fetch the entire content of the encapsulated [Map] on each
 * method call. It doesn't cache the data anyhow.
 * If you don't need this [Map] to re-fresh its content on every call,
 * by doing round-trips to the encapsulated iterable, use
 * [StickyMap].
 *
 * There is no thread-safety guarantee.
 *
 * @param X Type of key
 * @param Y Type of value
 * @see StickyMap
 *
 * @since 0.3
 */
class MapOf<X : Any, Y : Any>(
    entries: Iterable<Map.Entry<X, Y>>
) : MapEnvelope<X, Y>({ entries.map { entry: Map.Entry<X, Y> -> entry.key to entry.value }.toMap() }) {

    /**
     * @param list List of entries
     */
    constructor(vararg list: Map.Entry<X, Y>) : this(IterableOf(list.asIterable()))

    /**
     * @param src The map to extend
     * @param list List of entries
     * @since 0.4
     */
    constructor(
        src: Map<X, Y>,
        vararg list: Map.Entry<X, Y>
    ) : this(src, IterableOf(list.asIterable()))

    /**
     * @param src Map to extend
     * @param list List of the entries
     * @since 0.4
     */
    constructor(
        src: Map<X, Y>,
        list: Iterable<Map.Entry<X, Y>>
    ) : this(Joined(src.entries, list))

    /**
     * @param entries List of the entries
     */
    constructor(entries: Iterator<Map.Entry<X, Y>>) : this(Iterable { entries })

    companion object {

        /**
         * @param list List of items
         * @param key Func to create key
         * @param value Func to create value
         * @param Z Type of items in the list
         * @since 0.3
         */
        operator fun <X : Any, Y : Any, Z : Any> invoke(
            key: Func<Z, X>,
            value: Func<Z, Y>,
            list: Iterable<Z>
        ): MapOf<X, Y> {
            return MapOf(
                FuncOf { item -> MapEntry(key.apply(item), value.apply(item)) }, list
            )
        }

        /**
         * @param src The map to extend
         * @param list List of items
         * @param key Func to create key
         * @param value Func to create value
         * @param Z Type of items in the list
         * @since 0.4
         */
        operator fun <X : Any, Y : Any, Z : Any> invoke(
            key: Func<Z, X>,
            value: Func<Z, Y>,
            src: Map<X, Y>,
            list: Iterable<Z>
        ): MapOf<X, Y> {
            return MapOf(FuncOf { item -> MapEntry(key.apply(item), value.apply(item)) }, src, list)
        }

        /**
         * @param list List of items
         * @param entry Func to create entry
         * @param Z Type of items in the list
         * @since 0.4
         */
        operator fun <X : Any, Y : Any, Z : Any> invoke(
            entry: Func<Z, Map.Entry<X, Y>>,
            list: Iterable<Z>
        ): MapOf<X, Y> {
            return MapOf(Mapped(entry, list))
        }

        /**
         * @param src The map to extend
         * @param list List of items
         * @param entry Func to create entry
         * @param Z Type of items in the list
         * @since 0.4
         */
        operator fun <X : Any, Y : Any, Z : Any> invoke(
            entry: Func<Z, Map.Entry<X, Y>>,
            src: Map<X, Y>,
            list: Iterable<Z>
        ): MapOf<X, Y> {
            return MapOf(src, Mapped(entry, list))
        }
    }
}
