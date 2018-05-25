package nnl.rocks.kactoos.scalar

import nnl.rocks.kactoos.KScalar
import nnl.rocks.kactoos.Scalar

/**
 * Integer Scalar which sums up the values of other Scalars of the same type
 *
 * Here is how you can use it to summarize numbers:
 *
 * `val sum = SumOfIntScalar(arrayOf({ 1 }, { 2 }, { 3 })).invoke()`
 *
 * There is no thread-safety guarantee.
 *
 * @param scalars Scalars to sum up values from
 * @since 0.5
 */
class SumOfIntScalar(private val scalars: Array<KScalar<Int>>) : Scalar<Int> {

    constructor(vararg scalars: Scalar<Int>) : this(scalars.map { { it() } }.toTypedArray())

    override fun invoke(): Int = SumOfScalar(scalars).invoke().invoke().toInt()
}
