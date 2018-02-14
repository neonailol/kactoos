package nnl.rocks.kactoos.map

import nnl.rocks.kactoos.Func
import nnl.rocks.kactoos.func.FuncOf
import nnl.rocks.kactoos.iterable.IterableOf
import nnl.rocks.kactoos.iterable.Mapped
import nnl.rocks.kactoos.scalar.Constant
import nnl.rocks.kactoos.scalar.StickyScalar
import java.util.Collections
import java.util.HashMap

/**
 * Read-only [Map] decorator that goes through the map only once.
 *
 * There is no thread-safety guarantee.
 *
 * @param X Type of key
 * @param Y Type of value
 * @since 0.3
 */
class StickyMap<X : Any, Y : Any> : MapEnvelope<X, Y> {

    constructor(map: Map<X, Y>) : super(
        StickyScalar<Map<X, Y>>(
            Constant {
                val temp = HashMap<X, Y>(0)
                temp.putAll(map)
                Collections.unmodifiableMap<X, Y>(temp)
            }
        )
    )

    /**
     * @param list List of entries
     */
    @SafeVarargs
    constructor(vararg list: Map.Entry<X, Y>) : this(IterableOf<Map.Entry<X, Y>>(list.iterator()))

    /**
     * @param map The map to extend
     * @param list List of entries
     * @since 0.12
     */
    @SafeVarargs
    constructor(
        map: Map<X, Y>,
        vararg list: Map.Entry<X, Y>
    ) : this(map, IterableOf<Map.Entry<X, Y>>(list.iterator()))

    /**
     * @param list Entries for the entries
     */
    constructor(list: Iterable<Map.Entry<X, Y>>) : this(MapOf<X, Y>(list))

    /**
     * @param list Entries for the entries
     * @since 0.21
     */
    constructor(list: Iterator<Map.Entry<X, Y>>) : this(Iterable { list })

    /**
     * @param map Pre-existing map we want to extend
     * @param list Entries for the entries
     * @since 0.12
     */
    constructor(
        map: Map<X, Y>,
        list: Iterable<Map.Entry<X, Y>>
    ) : this(MapOf<X, Y>(map, list))

    companion object {

        /**
         * @param map The map to extend
         * @param list List of items
         * @param key Func to create key
         * @param value Func to create value
         * @param Z Type of items in the list
         *
         */
        operator fun <X : Any, Y : Any, Z : Any> invoke(
            key: Func<Z, X>,
            value: Func<Z, Y>,
            map: Map<X, Y>,
            list: Iterable<Z>
        ): StickyMap<X, Y> {
            return StickyMap(
                entry = FuncOf { item: Z -> MapEntry(key.apply(item), value.apply(item)) },
                map = map,
                list = list
            )
        }

        /**
         * @param list List of items
         * @param key Func to create key
         * @param value Func to create value
         * @param Z Type of items in the list
         */
        operator fun <X : Any, Y : Any, Z : Any> invoke(
            list: Iterable<Z>,
            key: Func<Z, X>,
            value: Func<Z, Y>
        ): StickyMap<X, Y> {
            return StickyMap(
                entry = FuncOf<Z, MapEntry<X, Y>> { item -> MapEntry(key.apply(item), value.apply(item)) },
                list = list
            )
        }

        /**
         * @param list List of items
         * @param entry Func to create entry
         * @param Z Type of items in the list
         */
        @SafeVarargs
        @Suppress("SpreadOperator")
        operator fun <X : Any, Y : Any, Z : Any> invoke(
            entry: Func<Z, Map.Entry<X, Y>>,
            vararg args: Z
        ): StickyMap<X, Y> {
            return StickyMap(Mapped(entry, IterableOf(*args)))
        }

        /**
         * @param list List of items
         * @param entry Func to create entry
         * @param Z Type of items in the list
         */
        operator fun <X : Any, Y : Any, Z : Any> invoke(
            entry: Func<Z, Map.Entry<X, Y>>,
            list: Iterable<Z>
        ): StickyMap<X, Y> {
            return StickyMap(Mapped(entry, list))
        }

        /**
         * @param map The map to extend
         * @param list List of items
         * @param entry Func to create entry
         * @param Z Type of items in the list
         */
        operator fun <X : Any, Y : Any, Z : Any> invoke(
            entry: Func<Z, Map.Entry<X, Y>>,
            map: Map<X, Y>,
            list: Iterable<Z>
        ): StickyMap<X, Y> {
            return StickyMap(map, Mapped(entry, list))
        }
    }
}
