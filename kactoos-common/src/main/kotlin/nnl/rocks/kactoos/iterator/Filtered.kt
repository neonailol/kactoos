package nnl.rocks.kactoos.iterator

import nnl.rocks.kactoos.Func
import nnl.rocks.kactoos.KFunc
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
 *     { input -> input.length < 4 },
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
    private val predicate: KFunc<X, Boolean>,
    private val buffer: Temporary<X>
) : Iterator<X> {

    constructor(
        predicate: KFunc<X, Boolean>,
        iterator: Iterator<X>
    ) : this(iterator, predicate, Temporary())

    constructor(
        predicate: Func<X, Boolean>,
        iterator: Iterator<X>
    ) : this(iterator, { x -> predicate.apply(x) }, Temporary())

    override fun hasNext(): Boolean {
        if (buffer.isEmpty()) {
            while (iterator.hasNext()) {
                val obj = iterator.next()
                if (predicate(obj)) {
                    buffer.put(obj)
                    break
                }
            }
        }
        return buffer.isNotEmpty()
    }

    override fun next(): X {
        when {
            isEmpty() -> throw NoSuchElementException("No more elements that fit the condition")
            else -> return buffer.poll()
        }
    }
}
