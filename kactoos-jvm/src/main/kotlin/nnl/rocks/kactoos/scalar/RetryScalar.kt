package nnl.rocks.kactoos.scalar

import nnl.rocks.kactoos.Func
import nnl.rocks.kactoos.Scalar
import nnl.rocks.kactoos.func.FuncOf
import nnl.rocks.kactoos.func.RetryFunc

/**
 * Func that will try a few times before throwing an exception.
 *
 * There is no thread-safety guarantee.
 *
 *
 * @param T Type of output
 * @param origin Func original
 * @param func Exit condition, returns TRUE if there is no reason to try
 * @since 0.9
 */
class RetryScalar<T : Any>(
    private val origin: Scalar<T>,
    private val func: Func<Int, Boolean>
) : Scalar<T> {

    /**
     * @param scalar Scalar original
     * @param attempts Maximum number of attempts
     */
    constructor(
        scalar: Scalar<T>,
        attempts: Int
    ) : this(scalar, FuncOf { attempt -> attempt >= attempts })

    constructor(scalar: Scalar<T>) : this(scalar, 3)

    override fun invoke(): T {
        return RetryFunc(
            FuncOf<Boolean, T> { _ -> this.origin() },
            this.func
        ).apply(true)
    }
}
