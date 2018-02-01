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
class SolidMap<X : Any, Y : Any, Z : Any>(map: Map<X, Y>) : MapEnvelope<X, Y>(
    SolidScalar<Map<X, Y>>(
        {
            SyncMap<X, Y, Z>(StickyMap<X, Y, Z>(map))
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
     * @param map The map to extend
     * @param list List of items
     * @param key Func to create key
     * @param value Func to create value
     * @param Z Type of items in the list
     *
    </Z> */
    constructor(
        key: Func<Z, X>,
        value: Func<Z, Y>,
        map: Map<X, Y>,
        list: Iterable<Z>
    ) : this(
        FuncOf { item -> MapEntry<X, Y>(key.apply(item), value.apply(item)) },
        map, list
    )

    /**
     * @param list List of items
     * @param key Func to create key
     * @param value Func to create value
     * @param Z Type of items in the list
     */
    constructor(
        key: Func<Z, X>,
        value: Func<Z, Y>,
        list: Iterable<Z>
    ) : this(
        FuncOf { item -> MapEntry<X, Y>(key.apply(item), value.apply(item)) }, list
    )

    /**
     * @param list List of items
     * @param entry Func to create entry
     * @param Z Type of items in the list
     */
    @SafeVarargs
    constructor(
        entry: Func<Z, Map.Entry<X, Y>>,
        vararg list: Z
    ) : this(Mapped<Z, Map.Entry<X, Y>>(entry, IterableOf<Z>(list.iterator())))

    /**
     * @param list List of items
     * @param entry Func to create entry
     * @param Z Type of items in the list
     */
    constructor(
        entry: Func<Z, Map.Entry<X, Y>>,
        list: Iterable<Z>
    ) : this(Mapped<Z, Map.Entry<X, Y>>(entry, list))

    /**
     * @param map The map to extend
     * @param list List of items
     * @param entry Func to create entry
     * @param Z Type of items in the list
     */
    constructor(
        entry: Func<Z, Map.Entry<X, Y>>,
        map: Map<X, Y>,
        list: Iterable<Z>
    ) : this(map, Mapped<Z, Map.Entry<X, Y>>(entry, list))

    /**
     * @param list Entries for the entries
     */
    constructor(list: Iterable<Map.Entry<X, Y>>) : this(MapOf<X, Y, Any>(list))

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
    ) : this(MapOf<X, Y, Any>(map, list))
}
