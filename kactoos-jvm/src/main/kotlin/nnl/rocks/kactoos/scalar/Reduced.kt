package nnl.rocks.kactoos.scalar

import nnl.rocks.kactoos.BiFunc
import nnl.rocks.kactoos.KBiFunc
import nnl.rocks.kactoos.KScalar
import nnl.rocks.kactoos.Scalar

/**
 * Reduce iterable via BiFunc.
 *
 * ```
 * Reduced(
 * { head, tail -> head + tail },
 * IterableOf({ 1 }, { 2 }, { 3 }, { 4 })
 * ).invoke()
 * ```
 *
 * There is no thread-safety guarantee.
 *
 *
 * @param T KScalar type
 * @param function Folding function
 * @param items The scalars
 * @since 0.3
 */
class Reduced<out T : Any>(
    private val function: KBiFunc<T, T, T>,
    private val items: Iterable<KScalar<T>>
) : Scalar<T> {

    constructor(
        function: BiFunc<T, T, T>,
        items: Iterable<KScalar<T>>
    ) : this({ l, r -> function.apply(l, r) }, items)

    override fun invoke(): T {
        return items.reduce { acc, next -> { function.invoke(acc(), next()) } }.invoke()
    }
}
