package nnl.rocks.kactoos.map

import nnl.rocks.kactoos.Func
import nnl.rocks.kactoos.func.FuncOf
import nnl.rocks.kactoos.iterable.IterableOf
import nnl.rocks.kactoos.iterable.Mapped
import nnl.rocks.kactoos.scalar.ScalarOf
import nnl.rocks.kactoos.scalar.SyncScalar
import java.util.concurrent.ConcurrentHashMap

/**
 * Map decorator that goes through the map only once.
 *
 *
 * The map is read-only.
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
class SyncMap<X : Any, Y : Any, Z : Any>(map: Map<X, Y>) : MapEnvelope<X, Y>(
    SyncScalar<Map<X, Y>>(ScalarOf { val temp = ConcurrentHashMap<X, Y>(0); temp.putAll(map); temp })
) {

    /**
     * @param list List of entries
     */
    @SafeVarargs
    @Suppress("SpreadOperator")
    constructor(vararg list: Map.Entry<X, Y>) : this(IterableOf<Map.Entry<X, Y>>(*list))

    /**
     * @param map The map to extend
     * @param list List of entries
     */
    @SafeVarargs
    @Suppress("SpreadOperator")
    constructor(
        map: Map<X, Y>,
        vararg list: Map.Entry<X, Y>
    ) : this(map, IterableOf<Map.Entry<X, Y>>(*list))

    /**
     * @param map The map to extend
     * @param list List of items
     * @param key Func to create key
     * @param value Func to create value
     * @param Z Type of items in the list
     *
     */
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
        list: Iterable<Z>,
        key: Func<Z, X>,
        value: Func<Z, Y>
    ) : this(
        FuncOf { item -> MapEntry<X, Y>(key.apply(item), value.apply(item)) }, list
    )

    /**
     * @param list List of items
     * @param entry Func to create entry
     * @param Z Type of items in the list
     */
    @SafeVarargs
    @Suppress("SpreadOperator")
    constructor(
        entry: Func<Z, Map.Entry<X, Y>>,
        vararg list: Z
    ) : this(Mapped<Z, Map.Entry<X, Y>>(entry, IterableOf<Z>(*list)))

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
    constructor(list: Iterable<Map.Entry<X, Y>>) : this(MapOf<X, Y, Z>(list))

    /**
     * @param list Entries for the entries
     */
    constructor(list: Iterator<Map.Entry<X, Y>>) : this(MapOf<X, Y, Z>(list))

    /**
     * Ctor.
     * @param map Pre-existing map we want to extend
     * @param list Entries for the entries
     */
    constructor(
        map: Map<X, Y>,
        list: Iterable<Map.Entry<X, Y>>
    ) : this(MapOf<X, Y, Z>(map, list))
}
