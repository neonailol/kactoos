package nnl.rocks.kactoos.func

import nnl.rocks.kactoos.Func
import nnl.rocks.kactoos.Proc
import nnl.rocks.kactoos.dummy

/**
 * Func that repeats its calculation a few times before returning the last result.
 * If [times] is equal or less than zero [RepeatedFunc.apply] will return an exception.
 *
 * @param func Func original
 * @param times How many times.
 * @param X Type of input
 * @param Y Type of output
 * @since 0.6
 */
class RepeatedFunc<X : Any, Y : Any>(
    private val func: Func<X, Y>,
    private val times: Int
) : Func<X, Y> {

    /**
     * @param proc Proc
     * @param max How many times
     * @since 0.12
     */
    constructor(
        proc: Proc<X>,
        result: Y,
        max: Int
    ) : this(FuncOf { input -> proc.exec(input); result }, max)

    constructor(
        proc: Proc<X>,
        max: Int
    ) : this(proc, dummy(), max)

    @Throws(Exception::class)
    override fun apply(input: X): Y {
        return when {
            this.times <= 0 -> throw IllegalArgumentException("The number of repetitions must be at least 1")
            else -> (0 until times).map { func.apply(input) }.reduce { _, y -> y }
        }
    }
}
