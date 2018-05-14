package nnl.rocks.kactoos.scalar

import nnl.rocks.kactoos.Func
import nnl.rocks.kactoos.Scalar
import nnl.rocks.kactoos.func.FuncOf
import nnl.rocks.kactoos.text.FormattedText
import java.io.IOException

/**
 * Element from position in [Iterator]
 * or fallback value if iterator hasn't this position.
 *
 * There is no thread-safety guarantee.
 *
 * @param T Scalar type
 * @since 0.3
 */
class ItemAt<T : Any>(
    private val src: Scalar<Iterator<T>>,
    private val pos: Int,
    private val fbk: Func<Iterable<T>, T>
) : Scalar<T> {

    /**
     * Ctor.
     *
     * @param fallback Fallback value
     * @param source Iterable
     */
    constructor(
        fallback: T,
        source: Iterable<T>
    ) : this(source, FuncOf { itr -> fallback })

    /**
     * Ctor.
     *
     * @param fallback Fallback value
     * @param source Iterable
     */
    @JvmOverloads constructor(
        source: Iterable<T>,
        fallback: Func<Iterable<T>, T> = FuncOf { itr -> throw IOException("The iterable is empty") }
    ) : this(source, 0, fallback)

    /**
     * Ctor.
     *
     * @param position Position
     * @param source Iterable
     */
    constructor(
        position: Int,
        source: Iterable<T>
    ) : this(
        source,
        position,
        FuncOf { itr ->
            throw IOException(
                FormattedText(
                    "The iterable doesn't have the position #%d",
                    position
                ).asString()
            )
        }
    )

    /**
     * Ctor.
     *
     * @param position Position
     * @param source Iterable
     * @since 0.21
     */
    constructor(
        position: Int,
        source: Iterator<T>
    ) : this(position, Iterable { source })

    /**
     * Ctor.
     *
     * @param source Iterable
     * @param position Position
     * @param fallback Fallback value
     */
    constructor(
        source: Iterable<T>,
        position: Int,
        fallback: Func<Iterable<T>, T>
    ) : this(StickyScalar<Iterator<T>>(Constant<Iterator<T>> { source.iterator() }), position, fallback)

    /**
     * Ctor.
     *
     * @param iterator Iterator
     * @param fallback Fallback value
     */
    constructor(
        iterator: Iterator<T>,
        fallback: T
    ) : this(iterator, FuncOf { itr -> fallback })

    /**
     * Ctor.
     *
     * @param iterator Iterator
     * @param fallback Fallback value
     */
    @JvmOverloads constructor(
        iterator: Iterator<T>,
        fallback: Func<Iterable<T>, T> = FuncOf { itr -> throw IOException("Iterator is empty") }
    ) : this(iterator, 0, fallback)

    /**
     * Ctor.
     *
     * @param iterator Iterator
     * @param position Position
     * @param fallback Fallback value
     */
    @JvmOverloads constructor(
        iterator: Iterator<T>,
        position: Int,
        fallback: Func<Iterable<T>, T> = FuncOf { itr ->
            throw IOException(
                FormattedText(
                    "Iterator doesn't have an element at #%d position",
                    position
                ).asString()
            )
        }
    ) : this(StickyScalar<Iterator<T>>(Constant { iterator }), position, fallback)

    @Throws(Exception::class)
    override fun value(): T {
        if (this.pos < 0) {
            throw IOException(
                FormattedText(
                    "The position must be non-negative: %d",
                    this.pos
                ).asString()
            )
        }
        val iterator = this.src()
        var cur: Int
        cur = 0
        while (cur < this.pos && iterator.hasNext()) {
            iterator.next()
            ++ cur
        }
        val ret: T
        if (cur == this.pos && iterator.hasNext()) {
            ret = iterator.next()
        } else {
            ret = this.fbk.apply(Iterable { iterator })
        }
        return ret
    }
}
