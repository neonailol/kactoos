package nnl.rocks.kactoos.scalar

import nnl.rocks.kactoos.Func
import nnl.rocks.kactoos.KScalar
import nnl.rocks.kactoos.Proc
import nnl.rocks.kactoos.func.FuncOf
import nnl.rocks.kactoos.iterable.IterableOf
import nnl.rocks.kactoos.iterable.Mapped

/**
 * Logical disjunction.
 *
 * There is no thread-safety guarantee.
 *
 *
 * @param origin The iterable.
 * @since 0.8
 */
class Or(
    private val origin: Iterable<KScalar<Boolean>>
) : KScalar<Boolean> {

    /**
     * @param scalar The KScalar.
     */
    @SafeVarargs
    constructor(vararg scalar: KScalar<Boolean>) : this(IterableOf<KScalar<Boolean>>(scalar.iterator()))

    /**
     * @param iterable The iterable.
     * @since 0.24
     */
    constructor(iterable: Iterator<KScalar<Boolean>>) : this(IterableOf<KScalar<Boolean>>(iterable))

    override fun invoke(): Boolean {
        var result = false
        for (item in this.origin) {
            if (item()) {
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
                    Mapped<X, KScalar<Boolean>>(
                        FuncOf { item -> {func.apply(item)} }, src
                    )
                )
            )
        }
    }
}
