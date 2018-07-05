package nnl.rocks.kactoos.iterator

/**
 * Iterator over variable number of elements.
 *
 * There is no thread-safety guarantee.
 *
 * @param X Type of item
 * @since 0.3
 */
class IteratorOf<out X : Any> private constructor(
    private val origin: Iterator<X>
) : Iterator<X> by origin {

    constructor(vararg items: X) : this(Immutable(items.iterator()))

}
