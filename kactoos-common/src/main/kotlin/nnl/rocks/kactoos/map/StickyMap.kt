package nnl.rocks.kactoos.map

import nnl.rocks.kactoos.Func
import nnl.rocks.kactoos.func.FuncOf
import nnl.rocks.kactoos.iterable.IterableOf
import nnl.rocks.kactoos.iterable.Mapped
import nnl.rocks.kactoos.scalar.StickyScalar

/**
 * Map decorator that goes through the map only once.
 *
 * There is no thread-safety guarantee.
 *
 * @param X Type of key
 * @param Y Type of value
 * @since 0.4
 */
class StickyMap<X : Any, Y : Any> : MapEnvelope<X, Y> {

    constructor(map: Map<X, Y>) : super(StickyScalar<Map<X, Y>> { map })

    constructor(vararg list: Map.Entry<X, Y>) : this(IterableOf<Map.Entry<X, Y>>(list.asIterable()))

    constructor(
        map: Map<X, Y>,
        vararg list: Map.Entry<X, Y>
    ) : this(map, IterableOf<Map.Entry<X, Y>>(list.asIterable()))

    constructor(list: Iterable<Map.Entry<X, Y>>) : this(MapOf(list))

    constructor(
        map: Map<X, Y>,
        list: Iterable<Map.Entry<X, Y>>
    ) : this(MapOf<X, Y>(map, list))

    companion object {

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

        operator fun <X : Any, Y : Any, Z : Any> invoke(
            list: Iterable<Z>,
            key: Func<Z, X>,
            value: Func<Z, Y>
        ): StickyMap<X, Y> {
            return StickyMap(
                entry = FuncOf<Z, MapEntry<X, Y>> { item ->
                    MapEntry(
                        key.apply(item),
                        value.apply(item)
                    )
                },
                list = list
            )
        }

        operator fun <X : Any, Y : Any, Z : Any> invoke(
            entry: Func<Z, Map.Entry<X, Y>>,
            vararg args: Z
        ): StickyMap<X, Y> {
            return StickyMap(Mapped(entry, IterableOf(*args)))
        }

        operator fun <X : Any, Y : Any, Z : Any> invoke(
            entry: Func<Z, Map.Entry<X, Y>>,
            list: Iterable<Z>
        ): StickyMap<X, Y> {
            return StickyMap(Mapped(entry, list))
        }

        operator fun <X : Any, Y : Any, Z : Any> invoke(
            entry: Func<Z, Map.Entry<X, Y>>,
            map: Map<X, Y>,
            list: Iterable<Z>
        ): StickyMap<X, Y> {
            return StickyMap(map, Mapped(entry, list))
        }
    }
}
