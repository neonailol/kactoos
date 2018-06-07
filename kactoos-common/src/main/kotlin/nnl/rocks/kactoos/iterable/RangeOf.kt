package nnl.rocks.kactoos.iterable

import nnl.rocks.kactoos.KFunc
import nnl.rocks.kactoos.iterator.RangeOf

/**
 * Iterable implementation to model range functionality.
 *
 * @param T Range value type
 * @since 0.4
 */
class RangeOf<T : Comparable<T>>(
    min: T,
    max: T,
    incrementor: KFunc<T, T>
) : IterableEnvelope<T>({ Iterable { RangeOf(min, max, incrementor) } })
