package nnl.rocks.kactoos.map

import nnl.rocks.kactoos.Func
import nnl.rocks.kactoos.func.FuncOf
import nnl.rocks.kactoos.iterable.IterableOf
import nnl.rocks.kactoos.iterable.Mapped
import nnl.rocks.kactoos.scalar.SolidScalar

/**
 * A [Map] that is both synchronized and sticky.
 *
 * Objects of this class are thread-safe.
 *
 * @param X Type of key
 * @param Y Type of value
 * @since 0.4
 */
class SolidMap<X : Any, Y : Any>(
    map: Map<X, Y>
) : MapEnvelope<X, Y>(SolidScalar<Map<X, Y>> { SyncMap(StickyMap(map)) }) {

    constructor(vararg list: Map.Entry<X, Y>) : this(IterableOf<Map.Entry<X, Y>>(list.asIterable()))

    constructor(map: Map<X, Y>, vararg list: Map.Entry<X, Y>) : this(map, IterableOf<Map.Entry<X, Y>>(list.asIterable()))

    constructor(list: Iterable<Map.Entry<X, Y>>) : this(MapOf(list))

    constructor(
        map: Map<X, Y>,
        list: Iterable<Map.Entry<X, Y>>
    ) : this(MapOf(map, list))

    companion object {

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

        operator fun <X : Any, Y : Any, Z : Any> invoke(
            list: Iterable<Z>,
            key: Func<Z, X>,
            value: Func<Z, Y>
        ): SolidMap<X, Y> {
            return SolidMap(
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
        ): SolidMap<X, Y> {
            return SolidMap(Mapped(entry, IterableOf(*args)))
        }

        operator fun <X : Any, Y : Any, Z : Any> invoke(
            entry: Func<Z, Map.Entry<X, Y>>,
            list: Iterable<Z>
        ): SolidMap<X, Y> {
            return SolidMap(Mapped(entry, list))
        }

        operator fun <X : Any, Y : Any, Z : Any> invoke(
            entry: Func<Z, Map.Entry<X, Y>>,
            map: Map<X, Y>,
            list: Iterable<Z>
        ): SolidMap<X, Y> {
            return SolidMap(map, Mapped(entry, list))
        }
    }
}
