package nnl.rocks.kactoos.iterator

import nnl.rocks.kactoos.KScalar
import nnl.rocks.kactoos.Scalar

/**
 * Iterator that never ends.
 *
 * If you need to repeat certain amount of time, use [Repeated].
 *
 * @param T Element type
 * @param element Element to repeat
 * @since 0.3
 */
class Endless<T : Any>(private val element: KScalar<T>) : Iterator<T> {

    constructor(element: T) : this({ element })

    constructor(element: Scalar<T>) : this({ element() })

    override fun hasNext(): Boolean = true

    override fun next(): T = element()
}
