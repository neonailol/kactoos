package nnl.rocks.kactoos.scalar

import nnl.rocks.kactoos.KScalar
import nnl.rocks.kactoos.Scalar
import nnl.rocks.kactoos.func.FuncOf
import nnl.rocks.kactoos.iterable.IterableOf
import nnl.rocks.kactoos.iterable.Mapped

/**
 * Find the lowest item.
 *
 * There is no thread-safety guarantee.
 *
 * @param T Scalar type
 * @since 0.4
 */
class LowestOf<T : Comparable<T>> private constructor(private val result: KScalar<T>) : Scalar<T> {

    constructor(iterable: Iterable<KScalar<T>>) : this(
        iterable.minBy { it() } ?: throw NoSuchElementException()
    )

    constructor(vararg items: T) : this(
        Mapped(
            FuncOf { item: T -> { item } },
            items.asIterable()
        )
    )

    constructor(vararg scalars: KScalar<T>) : this(IterableOf(scalars.asIterable()))

    override fun invoke(): T = result()
}
