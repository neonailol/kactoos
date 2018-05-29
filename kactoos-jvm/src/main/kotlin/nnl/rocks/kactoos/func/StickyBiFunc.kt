package nnl.rocks.kactoos.func

import nnl.rocks.kactoos.BiFunc
import nnl.rocks.kactoos.map.MapEntry
import nnl.rocks.kactoos.scalar.StickyScalar

/**
 * Func that accepts two arguments and caches previously calculated values
 * and doesn't recalculate again.
 *
 * Pay attention that this class is not thread-safe. It is highly
 * recommended to always decorate it with [SyncBiFunc].
 *
 * This [BiFunc] decorator technically is an in-memory cache.
 *
 * There is no thread-safety guarantee.
 *
 * @param X Type of input
 * @param Y Type of input
 * @param Z Type of output
 * @see StickyScalar
 *
 * @since 0.13
 */
class StickyBiFunc<in X : Any, in Y : Any, out Z : Any>(
    private val func: BiFunc<X, Y, Z>,
    private val size: Int
) : BiFunc<X, Y, Z> {

    constructor(func: BiFunc<X, Y, Z>) : this(func, Integer.MAX_VALUE)

    /**
     * Cache.
     */
    private val cache: MutableMap<Map.Entry<X, Y>, Z> = mutableMapOf()

    override fun apply(
        first: X,
        second: Y
    ): Z {
        val key = MapEntry(first, second)
        while (cache.size > size) {
            cache.remove(cache.keys.iterator().next())
        }
        if (! cache.containsKey(key)) {
            cache[key] = func.apply(first, second)
        }
        return cache[key] !!
    }
}
