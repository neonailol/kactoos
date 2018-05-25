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
 * @since 0.5
 */
class LowestOf<T : Comparable<T>> private constructor(private val result: KScalar<T>) : Scalar<T> {

    constructor(iterable: Iterable<KScalar<T>>) : this(
        iterable.minBy { it() } !!
    )

    constructor(vararg items: T) : this(
        Mapped<T, KScalar<T>>(
            FuncOf { item -> { item } },
            *items
        )
    )

    constructor(vararg scalars: KScalar<T>) : this(IterableOf<KScalar<T>>(*scalars))

    override fun invoke(): T = result.invoke()
}
