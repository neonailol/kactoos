package nnl.rocks.kactoos.scalar

import nnl.rocks.kactoos.*
import nnl.rocks.kactoos.func.BiFuncOf
import nnl.rocks.kactoos.func.FuncOf
import nnl.rocks.kactoos.iterable.IterableOf
import nnl.rocks.kactoos.iterable.Mapped

/**
 * Logical conjunction, with index.
 *
 * This class can be effectively used to iterate through a collection,
 * just like [java.util.stream.Stream.forEach] works,
 * but with an index provided for each item:
 *
 * ```
 * new And(
 *   new IterableOf("Mary", "John", "William", "Napkin"),
 *   new BiFuncOf<>(
 *     (text, index) -> System.out.printf("Name #%d: %s\n", index, text),
 *     true
 *   )
 * ).value();
 * ```
 *
 * There is no thread-safety guarantee.
 *
 * @param iterable The iterable
 * @since 0.5
 */
class AndWithIndex(
    private val iterable: Iterable<Func<Int, Boolean>>
) : Scalar<Boolean> {

    /**
     * @param src The iterable
     */
    constructor(vararg src: Func<Int, Boolean>) : this(IterableOf<Func<Int, Boolean>>(src.iterator()))

    /**
     * @param src The iterator
     * @since 0.24
     */
    constructor(src: Iterator<Func<Int, Boolean>>) : this(IterableOf<Func<Int, Boolean>>(src))

    override fun invoke(): Boolean {
        var result = true
        var pos = 0
        for (item in this.iterable) {
            if (! item.apply(pos)) {
                result = false
                break
            }
            ++ pos
        }
        return result
    }

    companion object {

        /**
         * @param proc Proc to map
         * @param src The iterable
         * @param X Type of items in the iterable
         */
        operator fun <X : Any> invoke(
            proc: Proc<X>,
            vararg src: X
        ): AndWithIndex {
            return AndWithIndex(AndWithIndexFunc(BiFuncOf(proc, true), *src).iterable())
        }

        /**
         * @param func Func to map
         * @param src The iterable
         * @param X Type of items in the iterable
         */
        operator fun <X : Any> invoke(
            func: BiFunc<X, Int, Boolean>,
            vararg src: X
        ): AndWithIndex {
            return AndWithIndex(AndWithIndexFunc(func, IterableOf(src.iterator())).iterable())
        }

        /**
         * @param src The iterable
         * @param proc Proc to use
         * @param X Type of items in the iterable
         * @since 0.24
         */
        operator fun <X : Any> invoke(
            proc: BiProc<X, Int>,
            src: Iterable<X>
        ): AndWithIndex {
            return AndWithIndex(AndWithIndexFunc(BiFuncOf(proc, true), src).iterable())
        }

        /**
         * @param src The iterable
         * @param func Func to map
         * @param X Type of items in the iterable
         * @since 0.24
         */
        operator fun <X : Any> invoke(
            func: BiFunc<X, Int, Boolean>,
            src: Iterable<X>
        ): AndWithIndex {
            return AndWithIndex(
                AndWithIndexFunc<X>(
                    Mapped<X, Func<Int, Boolean>>(
                        FuncOf { item -> FuncOf { input -> func.apply(item, input) } }, src
                    )
                ).iterable()
            )
        }
    }
}
