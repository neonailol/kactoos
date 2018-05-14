package nnl.rocks.kactoos.iterator

import nnl.rocks.kactoos.Scalar
import nnl.rocks.kactoos.iterable.IterableOf
import nnl.rocks.kactoos.scalar.Constant

/**
 * Iterator that never ends.
 *
 * If you need to repeat certain amount of time, use [Repeated].
 *
 *
 *
 * @param T Element type
 * @since 0.3
 */
class Endless<T : Any>(private val origin: Scalar<T>) : Iterator<T> {

    /**
     * Ctor.
     * @param element Element to repeat
     */
    constructor(element: T) : this(Constant { element })

    override fun hasNext(): Boolean = true

    override fun next(): T = IterableOf(this.origin()).iterator().next()
}
