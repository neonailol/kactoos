package nnl.rocks.kactoos.scalar

import nnl.rocks.kactoos.KScalar
import nnl.rocks.kactoos.Scalar

/**
 * Double Scalar which sums up the values of other Scalars of the same type.
 *
 * Here is how you can use it to summarize double numbers:
 *
 * `val sum = SumOfDoubleScalar({ 1.0 }, { 2.1 }, { 3.1 }).invoke()`
 *
 * There is no thread-safety guarantee.
 *
 * @param scalars Scalars to sum up values from
 * @since 0.4
 */
class SumOfDoubleScalar(private val scalars: Iterable<KScalar<Double>>) : Scalar<Double> {

    constructor(vararg scalars: Scalar<Double>) : this(scalars.map { { it() } })

    constructor(vararg scalars: KScalar<Double>) : this(scalars.map { it })

    override fun invoke(): Double = SumOfScalar(scalars).invoke().invoke()
}
