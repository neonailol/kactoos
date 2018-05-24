package nnl.rocks.kactoos.scalar

/**
 * Find the smallest value among numbers.
 *
 * Here is how you can use it to find minimum among numbers:
 *
 * ```
 * val min = MinOf(1, 2, 3, 4).toInt()
 * val min = MinOf(1L, 2L, 3L).toLong()
 * val min = MinOf(listOf(1, 2, 3)).toInt()
 * ```
 *
 * There is no thread-safety guarantee.
 *
 * @since 0.5
 */
class MinOf : NumberEnvelope {

    /**
     * @param src Numbers
     */
    constructor(vararg src: Int) : super({ src.min()?.toDouble() ?: Double.MAX_VALUE })

    /**
     * @param src Numbers
     */
    constructor(vararg src: Long) : super({ src.min()?.toDouble() ?: Double.MAX_VALUE })

    /**
     * @param src Numbers
     */
    constructor(vararg src: Double) : super({ src.min() ?: Double.MAX_VALUE })

    /**
     * @param src Numbers
     */
    constructor(vararg src: Float) : super({ src.min()?.toDouble() ?: Double.MAX_VALUE })

    /**
     * @param src The iterable
     */
    constructor(src: Iterable<Number>) : super({ src.minBy { it.toDouble() }?.toDouble() ?: Double.MAX_VALUE })
}
