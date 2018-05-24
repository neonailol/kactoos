package nnl.rocks.kactoos.scalar

import nnl.rocks.kactoos.Func
import nnl.rocks.kactoos.KScalar

/**
 * Ternary operation.
 *
 * There is no thread-safety guarantee.
 *
 * @param T Type of item.
 * @param condition The condition
 * @param consequent The consequent
 * @param alternative The alternative
 * @since 0.5
 */
class Ternary<T : Any, X : Any>(
    private val condition: KScalar<Boolean>,
    private val consequent: KScalar<T>,
    private val alternative: KScalar<T>
) : KScalar<T> {

    /**
     * @param input The input to pass to all of them
     * @param cnd The condition
     * @param cons The consequent
     * @param alter The alternative
     * @param X Type of input
     * @since 0.9
     */
    constructor(
        input: X,
        cnd: Func<X, Boolean>,
        cons: Func<X, T>,
        alter: Func<X, T>
    ) : this(
        { cnd.apply(input) },
        { cons.apply(input) },
        { alter.apply(input) }
    )

    /**
     * @param cnd The condition
     * @param cons The consequent
     * @param alter The alternative
     * @since 0.9
     */
    constructor(
        cnd: Boolean,
        cons: T,
        alter: T
    ) : this({ cnd }, cons, alter)

    /**
     * @param cnd The condition
     * @param cons The consequent
     * @param alter The alternative
     */
    constructor(
        cnd: KScalar<Boolean>,
        cons: T,
        alter: T
    ) : this(cnd, { cons }, { alter })

    override fun invoke(): T {
        return if (condition()) {
            consequent()
        } else {
            alternative()
        }
    }
}
