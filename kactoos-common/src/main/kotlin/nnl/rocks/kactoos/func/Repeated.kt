package nnl.rocks.kactoos.func

import nnl.rocks.kactoos.Func
import nnl.rocks.kactoos.Proc

/**
 * Func that repeats its calculation a few times before returning the last result.
 * If [times] is equal or less than zero [Repeated.apply] will return an exception.
 *
 * @param func Func original
 * @param times How many times.
 * @param X Type of input
 * @param Y Type of output
 * @since 0.4
 */
class Repeated<X : Any, Y : Any>(
    private val func: Func<X, Y>,
    private val times: Int
) : Func<X, Y> {

    /**
     * @param proc Proc
     * @param max How many times
     * @since 0.4
     */
    constructor(
        proc: Proc<X>,
        result: Y,
        max: Int
    ) : this(FuncOf { input -> proc.exec(input); result }, max)

    override fun apply(input: X): Y {
        return when {
            times <= 0 -> throw IllegalArgumentException("The number of repetitions must be at least 1")
            else -> (0 until times).map { func.apply(input) }.reduce { _, y -> y }
        }
    }
}
