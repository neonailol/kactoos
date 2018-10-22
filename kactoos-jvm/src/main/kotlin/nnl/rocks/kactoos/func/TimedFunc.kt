package nnl.rocks.kactoos.func

import nnl.rocks.kactoos.Func
import java.util.concurrent.ExecutionException
import java.util.concurrent.Future
import java.util.concurrent.TimeUnit
import java.util.concurrent.TimeoutException

/**
 * Function that gets interrupted after a certain time has passed.
 *
 * @param X Type of input
 * @param Y Type of output
 * @param func Async function
 * @param time Milliseconds
 * @since 0.4
 */
class TimedFunc<X : Any, Y : Any>(
    private val time: Long,
    private val func: Func<X, Future<Y>>
) : Func<X, Y> {

    constructor(function: Func<X, Y>, milliseconds: Long) : this(milliseconds, Async<X, Y>(function))

    override fun apply(input: X): Y {
        val future = func.apply(input)
        try {
            return future.get(time, TimeUnit.MILLISECONDS)
        } catch (exp: InterruptedException) {
            future.cancel(true)
            throw exp
        } catch (exp: ExecutionException) {
            future.cancel(true)
            throw exp
        } catch (exp: TimeoutException) {
            future.cancel(true)
            throw exp
        }
    }
}
