package nnl.rocks.kactoos.iterator

import nnl.rocks.kactoos.Scalar
import nnl.rocks.kactoos.iterable.IterableOf
import nnl.rocks.kactoos.scalar.Constant
import nnl.rocks.kactoos.scalar.UncheckedScalar

/**
 * Iterator that never ends.
 *
 * If you need to repeat certain amount of time, use [Repeated].
 *
 *
 *
 * @param T Element type
 * @since 0.4
 */
class Endless<T : Any>(private val origin: UncheckedScalar<T>) : Iterator<T> {

    /**
     * Ctor.
     * @param element Element to repeat
     */
    constructor(element: T) : this(Constant { element })

    /**
     * Ctor.
     * @param scalar Scalar to repeat
     */
    constructor(scalar: Scalar<T>) : this(UncheckedScalar<T>(scalar))

    override fun hasNext(): Boolean = true

    override fun next(): T = IterableOf(this.origin.value()).iterator().next()
}
