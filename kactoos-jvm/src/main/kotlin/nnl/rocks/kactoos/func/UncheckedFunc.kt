package nnl.rocks.kactoos.func

import nnl.rocks.kactoos.Func
import nnl.rocks.kactoos.KFunc

/**
 * Func that doesn't throw checked [Exception].
 *
 * There is no thread-safety guarantee.
 *
 * @param X Type of input
 * @param Y Type of output
 * @since 0.2
 */
class UncheckedFunc<in X : Any, out Y : Any>(private val func: KFunc<X, Y>) : Func<X, Y> {

    constructor(func: Func<X, Y>) : this({ x -> func.apply(x) })

    override fun apply(input: X): Y = func(input)
}
