package nnl.rocks.kactoos.func

import nnl.rocks.kactoos.BiFunc
import nnl.rocks.kactoos.KBiFunc
import nnl.rocks.kactoos.map.MapEntry

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
 * @param func Original function
 * @param size Cache size
 * @see StickyScalar
 *
 * @since 0.4
 */
class StickyBiFunc<in X : Any, in Y : Any, out Z : Any>(
    private val func: KBiFunc<X, Y, Z>,
    private val size: Int
) : BiFunc<X, Y, Z> {

    constructor(func: BiFunc<X, Y, Z>) : this({ first, second -> func.apply(first, second) }, Int.MAX_VALUE)

    constructor(func: BiFunc<X, Y, Z>, size: Int) : this({ first, second -> func.apply(first, second) }, size)

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
            cache[key] = func(first, second)
        }
        return cache[key] !!
    }
}
