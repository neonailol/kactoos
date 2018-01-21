package nnl.rocks.kactoos.scalar

import nnl.rocks.kactoos.Func
import nnl.rocks.kactoos.Proc
import nnl.rocks.kactoos.Scalar
import nnl.rocks.kactoos.func.FuncOf
import nnl.rocks.kactoos.iterable.IterableOf
import nnl.rocks.kactoos.iterable.Mapped

/**
 * Logical disjunction.
 *
 * There is no thread-safety guarantee.
 *
 * This class implements [Scalar], which throws a checked
 * [Exception]. This may not be convenient in many cases. To make
 * it more convenient and get rid of the checked exception you can
 * use [UncheckedScalar] or [IoCheckedScalar] decorators.
 *
 * @param origin The iterable.
 * @since 0.8
 */
class Or(
    private val origin: Iterable<Scalar<Boolean>>
) : Scalar<Boolean> {

    /**
     * @param scalar The Scalar.
     */
    @SafeVarargs
    constructor(vararg scalar: Scalar<Boolean>) : this(IterableOf<Scalar<Boolean>>(scalar.iterator()))

    /**
     * @param iterable The iterable.
     * @since 0.24
     */
    constructor(iterable: Iterator<Scalar<Boolean>>) : this(IterableOf<Scalar<Boolean>>(iterable))

    @Throws(Exception::class)
    override fun value(): Boolean {
        var result = false
        for (item in this.origin) {
            if (item.value()) {
                result = true
                break
            }
        }
        return result
    }

    companion object {

        /**
         * @param proc Proc to map
         * @param src The iterable
         * @param X Type of items in the iterable
         */
        @SafeVarargs
        operator fun <X : Any> invoke(
            proc: Proc<X>,
            vararg src: X
        ): Or {
            return Or(OrFunc(FuncOf(proc, false), src.iterator()))
        }

        /**
         * @param func Func to map
         * @param src The iterable
         * @param X Type of items in the iterable
         */
        @SafeVarargs
        operator fun <X : Any> invoke(
            func: Func<X, Boolean>,
            vararg src: X
        ): Or {
            return Or(OrFunc(func, IterableOf(src.iterator())))
        }

        /**
         * @param src The iterable
         * @param proc Proc to use
         * @param X Type of items in the iterable
         * @since 0.24
         */
        operator fun <X : Any> invoke(
            proc: Proc<X>,
            src: Iterator<X>
        ): Or {
            return Or(OrFunc(proc, IterableOf(src)))
        }

        /**
         * @param src The iterable
         * @param proc Proc to use
         * @param X Type of items in the iterable
         * @since 0.24
         */
        operator fun <X : Any> invoke(
            proc: Proc<X>,
            src: Iterable<X>
        ): Or {
            return Or(OrFunc(FuncOf(proc, false), src))
        }

        /**
         * @param src The iterable
         * @param func Func to map
         * @param X Type of items in the iterable
         * @since 0.24
         */
        operator fun <X : Any> invoke(
            func: Func<X, Boolean>,
            src: Iterator<X>
        ): Or {
            return Or(OrFunc(func, IterableOf(src)))
        }

        /**
         * @param src The iterable
         * @param func Func to map
         * @param X Type of items in the iterable
         */
        operator fun <X : Any> invoke(
            func: Func<X, Boolean>,
            src: Iterable<X>
        ): Or {
            return Or(
                OrFunc<X>(
                    Mapped<X, Scalar<Boolean>>(
                        FuncOf { item -> ScalarOf(func.apply(item)) }, src
                    )
                )
            )
        }
    }
}
