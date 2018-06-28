package nnl.rocks.kactoos.scalar

import nnl.rocks.kactoos.Func
import nnl.rocks.kactoos.KScalar
import nnl.rocks.kactoos.Scalar

/**
 * Ternary operation.
 *
 * There is no thread-safety guarantee.
 *
 * @param T Type of item.
 * @param condition The condition
 * @param consequent The consequent
 * @param alternative The alternative
 * @since 0.4
 */
class Ternary<T : Any>(
    private val condition: KScalar<Boolean>,
    private val consequent: KScalar<T>,
    private val alternative: KScalar<T>
) : Scalar<T> {

    /**
     * @param cnd The condition
     * @param cons The consequent
     * @param alter The alternative
     * @since 0.4
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
     * @since 0.4
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

    companion object {

        /**
         * @param input The input to pass to all of them
         * @param cnd The condition
         * @param cons The consequent
         * @param alter The alternative
         * @param X Type of input
         * @since 0.4
         */
        operator fun <T : Any, X : Any> invoke(
            input: X,
            cnd: Func<X, Boolean>,
            cons: Func<X, T>,
            alter: Func<X, T>
        ): Ternary<T> {
            return Ternary(
                { cnd.apply(input) },
                { cons.apply(input) },
                { alter.apply(input) }
            )
        }
    }
}
