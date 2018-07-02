package nnl.rocks.kactoos.iterator

import nnl.rocks.kactoos.KScalar
import nnl.rocks.kactoos.internal.isEmpty

/**
 * Repeat an element.
 *
 * If you need to repeat endlessly, use [Endless].
 *
 * @param T Element type
 * @param repeat How many times to repeat
 * @param element Element to repeat
 * @since 0.3
 */
class Repeated<out T : Any>(
    private var repeat: Int,
    private val element: KScalar<T>
) : Iterator<T> {

    constructor(
        max: Int,
        element: T
    ) : this(max, { element })

    override fun hasNext(): Boolean = repeat > 0

    override fun next(): T = when {
        isEmpty() -> throw NoSuchElementException("The iterator can't repeat anymore.")

        else -> {
            -- repeat
            element()
        }
    }
}
