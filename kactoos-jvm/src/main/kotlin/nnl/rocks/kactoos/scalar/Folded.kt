package nnl.rocks.kactoos.scalar

import nnl.rocks.kactoos.BiFunc
import nnl.rocks.kactoos.KBiFunc
import nnl.rocks.kactoos.Scalar

/**
 * Iterable, which elements are "folded" through the func.
 *
 * @param T Type of element
 * @param X Type of input and output
 * @param input Input
 * @param func Func original
 * @param iterable List of items
 * @since 0.9
 */
class Folded<out X : Any, T : Any>(
    private val input: X,
    private val func: KBiFunc<X, T, X>,
    private val iterable: Iterable<T>
) : Scalar<X> {

    constructor(
        input: X,
        func: BiFunc<X, T, X>,
        iterable: Iterable<T>
    ) : this(input, { l, r -> func.apply(l, r) }, iterable)

    override fun invoke(): X {
        return iterable.fold(input, func)
    }
}
