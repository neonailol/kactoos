package nnl.rocks.kactoos.func

import nnl.rocks.kactoos.Func
import nnl.rocks.kactoos.KFunc

/**
 * Composed function.
 *
 * @param before Before function
 * @param functions Functions
 * @param after After function
 * @param X Type of input.
 * @param Y Intermediate type.
 * @param Z Type of output.
 * @since 0.4
 */
class ChainedFunc<X : Any, Y : Any, Z : Any>(
    private val before: KFunc<X, Y>,
    private val functions: Iterable<KFunc<Y, Y>>,
    private val after: KFunc<Y, Z>
) : Func<X, Z> {

    /**
     * @param before Before function
     * @param after After function
     */
    constructor(
        before: KFunc<X, Y>,
        after: KFunc<Y, Z>
    ) : this(before, emptyList(), after)

    override fun apply(input: X): Z {
        var temp = before(input)
        for (func in functions) {
            temp = func(temp)
        }
        return after(temp)
    }
}
