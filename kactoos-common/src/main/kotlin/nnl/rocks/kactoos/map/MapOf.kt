package nnl.rocks.kactoos.map

import nnl.rocks.kactoos.Func
import nnl.rocks.kactoos.KFunc
import nnl.rocks.kactoos.iterable.IterableOf
import nnl.rocks.kactoos.iterable.Joined
import nnl.rocks.kactoos.iterable.Mapped

/**
 * Constructs Map from various inputs.
 *
 * There is no thread-safety guarantee.
 *
 * @param X Type of key
 * @param Y Type of value
 * @see StickyMap
 * @since 0.4
 */
class MapOf<X : Any, Y : Any>(
    entries: Iterable<Map.Entry<X, Y>>
) : MapEnvelope<X, Y>({ entries.map { entry: Map.Entry<X, Y> -> entry.key to entry.value }.toMap() }) {

    constructor(vararg list: Map.Entry<X, Y>) : this(IterableOf(list.asIterable()))

    constructor(src: Map<X, Y>, vararg list: Map.Entry<X, Y>) : this(src, IterableOf(list.asIterable()))

    constructor(src: Map<X, Y>, list: Iterable<Map.Entry<X, Y>>) : this(Joined(src.entries, list))

    companion object {

        operator fun <X : Any, Y : Any, Z : Any> invoke(
            key: KFunc<Z, X>,
            value: KFunc<Z, Y>,
            list: Iterable<Z>
        ): MapOf<X, Y> {
            return MapOf(
                { item -> MapEntry(key.invoke(item), value.invoke(item)) }, list
            )
        }

        operator fun <X : Any, Y : Any, Z : Any> invoke(
            key: KFunc<Z, X>,
            value: KFunc<Z, Y>,
            src: Map<X, Y>,
            list: Iterable<Z>
        ): MapOf<X, Y> {
            return MapOf(
                { item -> MapEntry(key.invoke(item), value.invoke(item)) },
                src,
                list
            )
        }

        operator fun <X : Any, Y : Any, Z : Any> invoke(
            entry: KFunc<Z, Map.Entry<X, Y>>,
            list: Iterable<Z>
        ): MapOf<X, Y> {
            return MapOf(Mapped(entry, list))
        }

        operator fun <X : Any, Y : Any, Z : Any> invoke(
            entry: KFunc<Z, Map.Entry<X, Y>>,
            src: Map<X, Y>,
            list: Iterable<Z>
        ): MapOf<X, Y> {
            return MapOf(src, Mapped(entry, list))
        }

        operator fun <X : Any, Y : Any, Z : Any> invoke(
            key: Func<Z, X>,
            value: Func<Z, Y>,
            list: Iterable<Z>
        ): MapOf<X, Y> {
            return MapOf(
                { item -> MapEntry(key.apply(item), value.apply(item)) }, list
            )
        }

        operator fun <X : Any, Y : Any, Z : Any> invoke(
            key: Func<Z, X>,
            value: Func<Z, Y>,
            src: Map<X, Y>,
            list: Iterable<Z>
        ): MapOf<X, Y> {
            return MapOf(
                { item -> MapEntry(key.apply(item), value.apply(item)) },
                src,
                list
            )
        }

        operator fun <X : Any, Y : Any, Z : Any> invoke(
            entry: Func<Z, Map.Entry<X, Y>>,
            list: Iterable<Z>
        ): MapOf<X, Y> {
            return MapOf(Mapped(entry, list))
        }

        operator fun <X : Any, Y : Any, Z : Any> invoke(
            entry: Func<Z, Map.Entry<X, Y>>,
            src: Map<X, Y>,
            list: Iterable<Z>
        ): MapOf<X, Y> {
            return MapOf(src, Mapped(entry, list))
        }
    }
}
