package nnl.rocks.kactoos.scalar

import nnl.rocks.kactoos.KScalar
import nnl.rocks.kactoos.Scalar

/**
 * Float Scalar which sums up the values of other Scalars of the same type
 *
 * Here is how you can use it to summarize float numbers:
 *
 * `val sum = SumOfFloatScalar(arrayOf({ 1f }, { 2f }, { 3f })).invoke()`
 *
 * There is no thread-safety guarantee.
 *
 * @param scalars Scalars to sum up values from
 * @since 0.5
 */
class SumOfFloatScalar(private val scalars: Array<KScalar<Float>>) : Scalar<Float> {

    constructor(vararg scalars: Scalar<Float>) : this(scalars.map { { it() } }.toTypedArray())

    override fun invoke(): Float = SumOfScalar(scalars).invoke().invoke().toFloat()
}
