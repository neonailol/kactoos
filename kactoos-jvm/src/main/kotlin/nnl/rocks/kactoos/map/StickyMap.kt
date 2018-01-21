package nnl.rocks.kactoos.map

import nnl.rocks.kactoos.Func
import nnl.rocks.kactoos.func.FuncOf
import nnl.rocks.kactoos.iterable.IterableOf
import nnl.rocks.kactoos.iterable.Mapped
import nnl.rocks.kactoos.scalar.ScalarOf
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
 * @since 0.8
 */
class StickyMap<X : Any, Y : Any, Z : Any> : MapEnvelope<X, Y> {

    constructor(map: Map<X, Y>) : super(
        StickyScalar<Map<X, Y>>(
            ScalarOf {
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
     * @param map The map to extend
     * @param list List of items
     * @param key Func to create key
     * @param value Func to create value
     * @param Z Type of items in the list
     * @since 0.12
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
     * @since 0.11
     */
    constructor(
        key: Func<Z, X>,
        value: Func<Z, Y>,
        list: Iterable<Z>
    ) : this(
        FuncOf { item -> MapEntry<X, Y>(key.apply(item), value.apply(item)) }, list
    )

    constructor(
        entry: Func<Z, Map.Entry<X, Y>>,
        vararg args: Z
    ) : this(Mapped<Z, Map.Entry<X, Y>>(entry, args.iterator()))

    /**
     * @param list List of items
     * @param entry Func to create entry
     * @param Z Type of items in the list
     * @since 0.11
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
     * @since 0.12
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
    ) : this(MapOf<X, Y, Any>(map, list))
}
