package nnl.rocks.kactoos.scalar

import nnl.rocks.kactoos.Func
import nnl.rocks.kactoos.KScalar
import nnl.rocks.kactoos.Proc
import nnl.rocks.kactoos.func.FuncOf
import nnl.rocks.kactoos.iterable.IterableOf
import nnl.rocks.kactoos.iterable.Mapped

/**
 * Logical conjunction.
 *
 * This class can be effectively used to iterate through
 * a collection, just like [java.util.stream.Stream.forEach] works:
 *
 * ```
 * new And(
 *   new IterableOf("Mary", "John", "William", "Napkin"),
 *   name -> System.out.printf("The name: %s\n", name)
 * ).value();
 * ```
 *
 *
 * There is no thread-safety guarantee.
 *
 * @param iterable The iterable
 * @param X Type argument
 * @see IoCheckedScalar
 * @since 0.8
 */
class AndFunc<X : Any>(private val iterable: Iterable<KScalar<Boolean>>) : KScalar<Boolean> {

    /**
     * @param proc Proc to map
     * @param src The iterable
     * @param X Type of items in the iterable
     */
    @SafeVarargs
    constructor (
        proc: Proc<X>,
        vararg src: X
    ) : this(FuncOf(proc, true), src.iterator())

    /**
     * @param func Func to map
     * @param src The iterable
     * @param X Type of items in the iterable
     */
    @SafeVarargs
    constructor(
        func: Func<X, Boolean>,
        vararg src: X
    ) : this(func, IterableOf(src.iterator()))

    /**
     * @param src The iterable
     * @param proc Proc to use
     * @param X Type of items in the iterable
     * @since 0.24
     */
    constructor(
        proc: Proc<X>,
        src: Iterator<X>
    ) : this(FuncOf(proc, true), src)

    /**
     * @param src The iterable
     * @param proc Proc to use
     * @param X Type of items in the iterable
     * @since 0.24
     */
    constructor(
        proc: Proc<X>,
        src: Iterable<X>
    ) : this(FuncOf(proc, true), src)

    /**
     * @param src The iterable
     * @param func Func to map
     * @param X Type of items in the iterable
     * @since 0.24
     */
    constructor(
        func: Func<X, Boolean>,
        src: Iterator<X>
    ) : this(func, IterableOf(src))

    /**
     * @param src The iterable
     * @param func Func to map
     * @param X Type of items in the iterable
     * @since 0.24
     */
    constructor(
        func: Func<X, Boolean>,
        src: Iterable<X>
    ) : this(
        Mapped<X, KScalar<Boolean>>(
            FuncOf { item ->  { func.apply(item) } }, src
        )
    )

    override fun invoke(): Boolean = And(iterable).invoke()
}
