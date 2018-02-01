package nnl.rocks.kactoos.scalar

import nnl.rocks.kactoos.BiFunc
import nnl.rocks.kactoos.KBiFunc
import nnl.rocks.kactoos.Scalar

/**
 * Iterable, which elements are "reduced" through the func.
 *
 *
 *
 * @param T Type of element
 * @param X Type of input and output
 * @param input Input
 * @param func Func original
 * @param iterable List of items
 * @since 0.9
 */
class Reduced<out X : Any, T : Any>(
    private val input: X,
    private val func: KBiFunc<X, T, X>,
    private val iterable: Iterable<T>
) : Scalar<X> {

    @Throws(Exception::class)
    override fun value(): X {
        var memo = this.input
        for (item in this.iterable) {
            memo = this.func.invoke(memo, item)
        }
        return memo
    }
}
