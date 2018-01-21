package nnl.rocks.kactoos.func

import nnl.rocks.kactoos.Func

/**
 * Composed function.
 *
 * @param before Before function
 * @param functions Functions
 * @param after After function
 * @param X Type of input.
 * @param Y Intermediate type.
 * @param Z Type of output.
 * @since 0.7
 */
class ChainedFunc<X : Any, Y : Any, Z : Any>(
    private val before: Func<X, Y>,
    private val functions: Iterable<Func<Y, Y>>,
    private val after: Func<Y, Z>
) : Func<X, Z> {

    /**
     * @param bfr Before function
     * @param atr After function
     */
    constructor(
        bfr: Func<X, Y>,
        atr: Func<Y, Z>
    ) : this(bfr, emptyList<Func<Y, Y>>(), atr)

    @Throws(Exception::class)
    override fun apply(input: X): Z {
        var temp = this.before.apply(input)
        for (func in this.functions) {
            temp = func.apply(temp)
        }
        return this.after.apply(temp)
    }
}
