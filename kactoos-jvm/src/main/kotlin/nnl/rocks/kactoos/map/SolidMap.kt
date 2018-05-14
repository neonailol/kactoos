package nnl.rocks.kactoos.map

import nnl.rocks.kactoos.Func
import nnl.rocks.kactoos.func.FuncOf
import nnl.rocks.kactoos.iterable.IterableOf
import nnl.rocks.kactoos.iterable.Mapped
import nnl.rocks.kactoos.scalar.SolidScalar

/**
 * A [Map] that is both synchronized and sticky.
 *
 *
 * Objects of this class are thread-safe.
 *
 *
 *
 * @param X Type of key
 * @param Y Type of value
 * @since 0.24
 */
class SolidMap<X : Any, Y : Any>(map: Map<X, Y>) : MapEnvelope<X, Y>(
    SolidScalar<Map<X, Y>>(
         {
            SyncMap<X, Y>(StickyMap<X, Y>(map))
        }
    )
) {

    /**
     * @param list List of entries
     */
    @SafeVarargs
    constructor(vararg list: Map.Entry<X, Y>) : this(IterableOf<Map.Entry<X, Y>>(list.iterator()))

    /**
     * @param map The map to extend
     * @param list List of entries
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
     */
    constructor(list: Iterator<Map.Entry<X, Y>>) : this(Iterable { list })

    /**
     * @param map Pre-existing map we want to extend
     * @param list Entries for the entries
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
        ): SolidMap<X, Y> {
            return SolidMap(
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
        ): SolidMap<X, Y> {
            return SolidMap(
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
        ): SolidMap<X, Y> {
            return SolidMap(Mapped(entry, IterableOf(*args)))
        }

        /**
         * @param list List of items
         * @param entry Func to create entry
         * @param Z Type of items in the list
         */
        operator fun <X : Any, Y : Any, Z : Any> invoke(
            entry: Func<Z, Map.Entry<X, Y>>,
            list: Iterable<Z>
        ): SolidMap<X, Y> {
            return SolidMap(Mapped(entry, list))
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
        ): SolidMap<X, Y> {
            return SolidMap(map, Mapped(entry, list))
        }
    }
}
