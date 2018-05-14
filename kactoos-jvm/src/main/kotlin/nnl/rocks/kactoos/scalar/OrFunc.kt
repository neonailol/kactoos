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
class OrFunc<X : Any>(
    private val origin: Iterable<KScalar<Boolean>>
) : KScalar<Boolean> {

    /**
     * @param proc Proc to map
     * @param src The iterable
     * @param X Type of items in the iterable
     */
    @SafeVarargs
    constructor(
        proc: Proc<X>,
        vararg src: X
    ) : this(FuncOf<X, Boolean>(proc, false), src.iterator())

    /**
     * @param func Func to map
     * @param src The iterable
     * @param X Type of items in the iterable
     */
    @SafeVarargs
    constructor(
        func: Func<X, Boolean>,
        vararg src: X
    ) : this(func, IterableOf<X>(src.iterator()))

    /**
     * @param src The iterable
     * @param proc Proc to use
     * @param X Type of items in the iterable
     * @since 0.24
     */
    constructor(
        proc: Proc<X>,
        src: Iterator<X>
    ) : this(proc, IterableOf<X>(src))

    /**
     * @param src The iterable
     * @param proc Proc to use
     * @param X Type of items in the iterable
     * @since 0.24
     */
    constructor(
        proc: Proc<X>,
        src: Iterable<X>
    ) : this(FuncOf<X, Boolean>(proc, false), src)

    /**
     * @param src The iterable
     * @param func Func to map
     * @param X Type of items in the iterable
     * @since 0.24
     */
    constructor(
        func: Func<X, Boolean>,
        src: Iterator<X>
    ) : this(func, IterableOf<X>(src))

    /**
     * @param src The iterable
     * @param func Func to map
     * @param X Type of items in the iterable
     */
    constructor(
        func: Func<X, Boolean>,
        src: Iterable<X>
    ) : this(
        Mapped<X, KScalar<Boolean>>(
            FuncOf { item -> { func.apply(item) } }, src
        )
    )

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
}
