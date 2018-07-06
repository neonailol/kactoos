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
 * @constructor Map from iterable [Map.Entry]
 * @since 0.4
 */
class MapOf<X : Any, Y : Any>(
    entries: Iterable<Map.Entry<X, Y>>
) : MapEnvelope<X, Y>({ entries.map { entry: Map.Entry<X, Y> -> entry.key to entry.value }.toMap() }) {

    /**
     * @constructor Map from vararg [Map.Entry]
     */
    constructor(vararg entries: Map.Entry<X, Y>) : this(IterableOf(entries.asIterable()))

    /**
     * @constructor Extend Map with vararg entries
     */
    constructor(source: Map<X, Y>, vararg entries: Map.Entry<X, Y>) : this(source, IterableOf(entries.asIterable()))

    /**
     * @constructor Extend Map with iterable entries
     */
    constructor(source: Map<X, Y>, entries: Iterable<Map.Entry<X, Y>>) : this(Joined(source.entries, entries))

    companion object {

        inline operator fun <X : Any, Y : Any, Z : Any> invoke(
            crossinline key: KFunc<Z, X>,
            crossinline value: KFunc<Z, Y>,
            list: Iterable<Z>
        ): MapOf<X, Y> {
            return MapOf(
                { item -> MapEntry(key(item), value(item)) }, list
            )
        }

        inline operator fun <X : Any, Y : Any, Z : Any> invoke(
            crossinline key: KFunc<Z, X>,
            crossinline value: KFunc<Z, Y>,
            src: Map<X, Y>,
            list: Iterable<Z>
        ): MapOf<X, Y> {
            return MapOf(
                { item -> MapEntry(key(item), value(item)) },
                src,
                list
            )
        }

        inline operator fun <X : Any, Y : Any, Z : Any> invoke(
            noinline entry: KFunc<Z, Map.Entry<X, Y>>,
            list: Iterable<Z>
        ): MapOf<X, Y> {
            return MapOf(Mapped(entry, list))
        }

        inline operator fun <X : Any, Y : Any, Z : Any> invoke(
            noinline entry: KFunc<Z, Map.Entry<X, Y>>,
            src: Map<X, Y>,
            list: Iterable<Z>
        ): MapOf<X, Y> {
            return MapOf(src, Mapped(entry, list))
        }

        inline operator fun <X : Any, Y : Any, Z : Any> invoke(
            key: Func<Z, X>,
            value: Func<Z, Y>,
            list: Iterable<Z>
        ): MapOf<X, Y> {
            return MapOf(
                { item -> MapEntry(key.apply(item), value.apply(item)) }, list
            )
        }

        inline operator fun <X : Any, Y : Any, Z : Any> invoke(
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

        inline operator fun <X : Any, Y : Any, Z : Any> invoke(
            entry: Func<Z, Map.Entry<X, Y>>,
            list: Iterable<Z>
        ): MapOf<X, Y> {
            return MapOf(Mapped(entry, list))
        }

        inline operator fun <X : Any, Y : Any, Z : Any> invoke(
            entry: Func<Z, Map.Entry<X, Y>>,
            src: Map<X, Y>,
            list: Iterable<Z>
        ): MapOf<X, Y> {
            return MapOf(src, Mapped(entry, list))
        }
    }
}
