package nnl.rocks.kactoos.scalar

import nnl.rocks.kactoos.KScalar
import nnl.rocks.kactoos.Scalar

/**
 * Long Scalar which sums up the values of other Scalars of the same type
 *
 * Here is how you can use it to summarize numbers:
 *
 * `val sum = SumOfLongScalar({ 1L }, { 2L }, { 3L }).invoke()`
 *
 * There is no thread-safety guarantee.
 *
 * @param scalars Scalars to sum up values from
 * @since 0.5
 */
class SumOfLongScalar(private val scalars: Iterable<KScalar<Long>>) : Scalar<Long> {

    constructor(vararg scalars: Scalar<Long>) : this(scalars.map { { it() } })

    constructor(vararg scalars: KScalar<Long>) : this(scalars.map { it })

    override fun invoke(): Long = SumOfScalar(scalars).invoke().invoke().toLong()
}
