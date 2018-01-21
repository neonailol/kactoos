package nnl.rocks.kactoos.iterator

import nnl.rocks.kactoos.Func
import nnl.rocks.kactoos.Scalar
import nnl.rocks.kactoos.func.FuncOf
import nnl.rocks.kactoos.text.FormattedText

import java.io.IOException

/**
 * Element from position in [Iterator]
 * or fallback value if iterator hasn't this position.
 *
 *
 * There is no thread-safety guarantee.
 *
 *
 *
 * @param T Scalar type
 * @since 0.7
 */
class ItemAt<T : Any>(
    private val src: Iterator<T>,
    private val pos: Int,
    private val fbk: Func<Iterable<T>, T>
) : Scalar<T> {

    constructor(
        src: Iterator<T>,
        pos: Int
    ) : this(
        src,
        pos,
        FuncOf {
            throw IOException(FormattedText("Iterator doesn't have an element at #%d position", pos).asString())
        }
    )

    /**
     * @param iterator Iterator
     * @param fallback Fallback value
     */
    constructor(
        iterator: Iterator<T>,
        fallback: T
    ) : this(iterator, FuncOf { itr -> fallback })

    /**
     * @param iterator Iterator
     * @param fallback Fallback value
     */
    constructor(
        iterator: Iterator<T>,
        fallback: Func<Iterable<T>, T>
    ) : this(iterator, 0, fallback)

    constructor(iterator: Iterator<T>) : this(iterator, FuncOf { itr -> throw IOException("Iterator is empty") })

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
        var cur = 0
        while (cur < this.pos && this.src.hasNext()) {
            this.src.next()
            ++ cur
        }
        val ret: T
        ret = if (cur == this.pos && this.src.hasNext()) {
            this.src.next()
        } else {
            this.fbk.apply(Iterable { this.src })
        }
        return ret
    }
}
