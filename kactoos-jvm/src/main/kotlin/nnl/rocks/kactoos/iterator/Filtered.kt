package nnl.rocks.kactoos.iterator

import nnl.rocks.kactoos.Func
import nnl.rocks.kactoos.KFunc
import nnl.rocks.kactoos.func.UncheckedFunc
import nnl.rocks.kactoos.internal.Temporary
import nnl.rocks.kactoos.internal.isEmpty

/**
 * Filtered iterator.
 *
 * You can use it in order to create a declarative/lazy
 * version of a filtered collection/iterable. For example,
 * this code will create a list of two strings "red" and "fox":
 *
 * ```
 * val filtered = Filtered(
 *     { input -> input.length < 4 }
 *     IteratorOf("red", "lazy", "fox")
 * )
 * ```
 *
 * There is no thread-safety guarantee.
 *
 * @param X Type of item
 * @since 0.1
 */
class Filtered<out X : Any> private constructor(
    private val iterator: Iterator<X>,
    private val func: KFunc<X, Boolean>,
    private val buffer: Temporary<X>
) : Iterator<X> {

    constructor(
        func: KFunc<X, Boolean>,
        iterator: Iterator<X>
    ) : this(iterator, func, Temporary())

    constructor(
        func: Func<X, Boolean>,
        iterator: Iterator<X>
    ) : this(iterator, { x -> func.apply(x) }, Temporary())

    override fun hasNext(): Boolean {
        val fnc = UncheckedFunc(func)
        if (buffer.isEmpty()) {
            while (this.iterator.hasNext()) {
                val obj = this.iterator.next()
                if (fnc.apply(obj)) {
                    buffer.put(obj)
                    break
                }
            }
        }
        return buffer.isNotEmpty()
    }

    override fun next(): X {
        if (isEmpty()) {
            throw NoSuchElementException(
                "No more elements that fit the condition"
            )
        }
        return buffer.poll()
    }
}
