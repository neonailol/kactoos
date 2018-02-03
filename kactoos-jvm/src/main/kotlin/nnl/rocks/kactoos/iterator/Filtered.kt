package nnl.rocks.kactoos.iterator

import nnl.rocks.kactoos.KFunc
import nnl.rocks.kactoos.func.UncheckedFunc
import java.util.LinkedList
import java.util.NoSuchElementException
import java.util.Queue

/**
 * Filtered iterator.
 *
 * You can use it in order to create a declarative/lazy
 * version of a filtered collection/iterable. For example,
 * this code will create a list of two strings "hello" and "world":
 *
 * ```
 * Iterator<String>; list = new Filtered<>(
 *   new ArrayOf<>(
 *     "hey", "hello", "world"
 *   ).iterator(),
 *   input -> input.length() > 4
 * );
 * ```
 *
 * There is no thread-safety guarantee.
 *
 * @param X Type of item
 * @see Filtered
 *
 * @since 0.1
 */
class Filtered<out X : Any>(
    private val func: KFunc<X, Boolean>,
    private val iterator: Iterator<X>,
    private val buffer: Queue<X>
) : Iterator<X> {

    constructor(
        func: KFunc<X, Boolean>,
        iterator: Iterator<X>
    ) : this(func, iterator, LinkedList())

    override fun hasNext(): Boolean {
        val fnc = UncheckedFunc(this.func)
        if (this.buffer.isEmpty()) {
            while (this.iterator.hasNext()) {
                val obj = this.iterator.next()
                if (fnc.apply(obj)) {
                    this.buffer.add(obj)
                    break
                }
            }
        }
        return ! this.buffer.isEmpty()
    }

    override fun next(): X {
        if (! this.hasNext()) {
            throw NoSuchElementException(
                "No more elements that fit the condition"
            )
        }
        return this.buffer.poll()
    }
}
