package nnl.rocks.kactoos.map

import nnl.rocks.kactoos.Func
import nnl.rocks.kactoos.func.FuncOf
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

    constructor(entries: Iterator<Map.Entry<X, Y>>) : this(Iterable { entries })

    companion object {

        operator fun <X : Any, Y : Any, Z : Any> invoke(
            key: Func<Z, X>,
            value: Func<Z, Y>,
            list: Iterable<Z>
        ): MapOf<X, Y> {
            return MapOf(
                FuncOf { item -> MapEntry(key.apply(item), value.apply(item)) }, list
            )
        }

        operator fun <X : Any, Y : Any, Z : Any> invoke(
            key: Func<Z, X>,
            value: Func<Z, Y>,
            src: Map<X, Y>,
            list: Iterable<Z>
        ): MapOf<X, Y> {
            return MapOf(
                FuncOf { item -> MapEntry(key.apply(item), value.apply(item)) },
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
