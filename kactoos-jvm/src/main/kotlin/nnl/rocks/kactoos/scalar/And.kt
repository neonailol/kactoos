package nnl.rocks.kactoos.scalar

import nnl.rocks.kactoos.Func
import nnl.rocks.kactoos.KScalar
import nnl.rocks.kactoos.Proc
import nnl.rocks.kactoos.Scalar
import nnl.rocks.kactoos.iterable.IterableOf

/**
 * Logical conjunction.
 *
 * This class can be effectively used to iterate through
 * a collection, just like `forEach` works:
 *
 * ```
 * And<String>(
 *     ProcOf { println(it) },
 *     IterableOf("Mary", "John", "William", "Napkin")
 * ).value()
 * ```
 *
 * There is no thread-safety guarantee.
 *
 * @param iterable The encapsulated iterable
 * @see IoCheckedScalar
 * @since 0.3
 */
class And(private val iterable: Iterable<KScalar<Boolean>>) : Scalar<Boolean> {

    constructor(vararg src: KScalar<Boolean>) : this(IterableOf(src.asIterable()))

    constructor(vararg src: Scalar<Boolean>) : this(IterableOf(src.map { { it() } }.asIterable()))

    override fun invoke(): Boolean = iterable.all { it() }

    companion object {

        operator fun <X : Any> invoke(
            func: Func<X, Boolean>,
            vararg src: X
        ): And {
            return And(
                AndFunc(func, src.asIterable())
            )
        }

        operator fun <X : Any> invoke(
            func: Func<X, Boolean>,
            src: Iterable<X>
        ): And {
            return And(
                AndFunc(func, src)
            )
        }

        operator fun <X : Any> invoke(
            proc: Proc<X>,
            vararg src: X
        ): And {
            return And(
                AndFunc(proc, src.asIterable())
            )
        }

        operator fun <X : Any> invoke(
            proc: Proc<X>,
            src: Iterable<X>
        ): And {
            return And(
                AndFunc(proc, src)
            )
        }
    }
}
