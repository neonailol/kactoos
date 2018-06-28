package nnl.rocks.kactoos.scalar

import nnl.rocks.kactoos.KScalar
import nnl.rocks.kactoos.Scalar

/**
 * Float Scalar which sums up the values of other Scalars of the same type
 *
 * Here is how you can use it to summarize float numbers:
 *
 * `val sum = SumOfFloatScalar({ 1f }, { 2f }, { 3f }).invoke()`
 *
 * There is no thread-safety guarantee.
 *
 * @param scalars Scalars to sum up values from
 * @since 0.4
 */
class SumOfFloatScalar(private val scalars: Iterable<KScalar<Float>>) : Scalar<Float> {

    constructor(vararg scalars: Scalar<Float>) : this(scalars.map { { it() } })

    constructor(vararg scalars: KScalar<Float>) : this(scalars.map { it })

    override fun invoke(): Float = SumOfScalar(scalars).invoke().invoke().toFloat()
}
