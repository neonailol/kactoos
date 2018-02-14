package nnl.rocks.kactoos.iterable

import nnl.rocks.kactoos.iterator.Endless
import nnl.rocks.kactoos.scalar.Constant

/**
 * Endless iterable.
 *
 *
 * If you need to repeat certain amount of time,
 * use [Repeated].
 *
 *
 *
 * @param T Element type
 * @since 0.4
 */
class Endless<out T : Any>(item: T) : IterableEnvelope<T>(Constant { Iterable { Endless<T>(item) } })
