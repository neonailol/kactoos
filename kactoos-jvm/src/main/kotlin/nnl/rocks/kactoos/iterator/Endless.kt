package nnl.rocks.kactoos.iterator

import nnl.rocks.kactoos.KScalar
import nnl.rocks.kactoos.iterable.IterableOf

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
class Endless<T : Any>(private val origin: KScalar<T>) : Iterator<T> {

    /**
     * Ctor.
     * @param element Element to repeat
     */
    constructor(element: T) : this({ element })

    override fun hasNext(): Boolean = true

    override fun next(): T = IterableOf(this.origin()).iterator().next()
}
