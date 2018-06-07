package nnl.rocks.kactoos.iterable

import nnl.rocks.kactoos.iterator.Endless

/**
 * Endless iterable.
 *
 * If you need to repeat certain amount of time, use [Repeated].
 *
 * @param T Element type
 * @param item Item to repeat
 * @since 0.4
 */
class Endless<out T : Any>(item: T) : IterableEnvelope<T>(IterableOf(Endless(item)))
