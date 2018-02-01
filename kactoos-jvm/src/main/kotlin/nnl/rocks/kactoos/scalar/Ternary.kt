package nnl.rocks.kactoos.scalar

import nnl.rocks.kactoos.Func
import nnl.rocks.kactoos.KFunc
import nnl.rocks.kactoos.Scalar

/**
 * Ternary operation.
 *
 *
 * There is no thread-safety guarantee.
 *
 *
 * This class implements [Scalar], which throws a checked
 * [Exception]. This may not be convenient in many cases. To make
 * it more convenient and get rid of the checked exception you can
 * use [UncheckedScalar] or [IoCheckedScalar] decorators.
 *
 *
 *
 * @param T Type of item.
 * @param condition The condition
 * @param consequent The consequent
 * @param alternative The alternative
 * @since 0.8
 */
class Ternary<T : Any, X : Any>(
    private val condition: Scalar<Boolean>,
    private val consequent: Scalar<T>,
    private val alternative: Scalar<T>
) : Scalar<T> {

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
        ScalarOf { cnd.apply(input) },
        ScalarOf { cons.apply(input) },
        ScalarOf { alter.apply(input) }
    )

    constructor(
        input: X,
        cnd: KFunc<X, Boolean>,
        cons: KFunc<X, T>,
        alter: KFunc<X, T>
    ) : this(
        ScalarOf { cnd.invoke(input) },
        ScalarOf { cons.invoke(input) },
        ScalarOf { alter.invoke(input) }
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
    ) : this(ScalarOf { cnd }, cons, alter)

    /**
     * @param cnd The condition
     * @param cons The consequent
     * @param alter The alternative
     */
    constructor(
        cnd: Scalar<Boolean>,
        cons: T,
        alter: T
    ) : this(cnd, ScalarOf { cons }, ScalarOf { alter })

    @Throws(Exception::class)
    override fun value(): T {
        val result: Scalar<T> = if (this.condition.value()) {
            this.consequent
        } else {
            this.alternative
        }
        return result.value()
    }
}
