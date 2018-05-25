package nnl.rocks.kactoos.scalar

import nnl.rocks.kactoos.KScalar
import nnl.rocks.kactoos.Scalar

/**
 * Make a scalar which is sum of scalar's values.
 *
 * There is no thread-safety guarantee.
 *
 * Note this class is for internal usage only
 *
 * @since 0.5
 */
internal class SumOfScalar<T : Number>(private val scalars: Iterable<KScalar<T>>) : Scalar<SumOf> {

    constructor(vararg scalars: Scalar<T>) : this(scalars.map { { it() } })

    constructor(vararg scalars: KScalar<T>) : this(scalars.map { it })

    override fun invoke(): SumOf = SumOf(
        scalars.map { UncheckedScalar(it).invoke() }
    )
}
