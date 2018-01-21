package nnl.rocks.kactoos.iterable

import nnl.rocks.kactoos.Func
import nnl.rocks.kactoos.Scalar
import nnl.rocks.kactoos.func.FuncOf
import nnl.rocks.kactoos.text.FormattedText

import java.io.IOException

/**
 * Element from position in [Iterable]
 * or fallback value if iterable hasn't this position.
 *
 *
 * There is no thread-safety guarantee.
 *
 *
 *
 * @param T Scalar type
 * @since 0.7
 */
class ItemAt<T : Any>
(
    private val src: Iterable<T>,
    private val fbk: Func<Iterable<T>, T>,
    private val pos: Int
) : Scalar<T> {

    /**
     * @param source Iterable
     */
    constructor(source: Iterable<T>) : this(
        FuncOf { itr -> throw IOException("The iterable is empty") },
        source
    )

    /**
     * @param fallback Fallback value
     * @param source Iterable
     */
    constructor(
        fallback: T,
        source: Iterable<T>
    ) : this(FuncOf { itr -> fallback }, source)

    /**
     * @param fallback Fallback value
     * @param source Iterable
     */
    constructor(
        fallback: Func<Iterable<T>, T>,
        source: Iterable<T>
    ) : this(source, fallback, 0)

    /**
     * @param position Position
     * @param source Iterable
     */
    constructor(
        position: Int,
        source: Iterable<T>
    ) : this(
        source,
        FuncOf { itr ->
            throw IOException(
                FormattedText(
                    "The iterable doesn't have the position #%d",
                    position
                ).asString()
            )
        },
        position
    )

    /**
     * @param position Position
     * @param source Iterable
     * @since 0.21
     */
    constructor(
        position: Int,
        source: Iterator<T>
    ) : this(position, Iterable { source })

    constructor(
        position: Int,
        func: Func<Iterable<T>, T>,
        iterable: Iterable<T>
    ) : this(iterable, func, position)

    @Throws(Exception::class)
    override fun value(): T = nnl.rocks.kactoos.iterator.ItemAt(this.src.iterator(), this.pos, this.fbk).value()
}
