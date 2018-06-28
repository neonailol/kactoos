package nnl.rocks.kactoos.scalar

/**
 * Find the greatest value among numbers.
 *
 * Here is how you can use it to find maximum among numbers:
 *
 * ```
 * val max = MaxOf(1, 2, 3, 4).toInt()
 * val max = MaxOf(1L, 2L, 3L).toLong()
 * val max = MaxOf(listOf(1, 2, 3)).toInt()
 * ```
 *
 * There is no thread-safety guarantee.
 *
 * @since 0.4
 */
class MaxOf : NumberEnvelope {

    /**
     * @param src Numbers
     */
    constructor(vararg src: Int) : super({ src.max()?.toDouble() ?: Double.MIN_VALUE })

    /**
     * @param src Numbers
     */
    constructor(vararg src: Long) : super({ src.max()?.toDouble() ?: Double.MIN_VALUE })

    /**
     * @param src Numbers
     */
    constructor(vararg src: Double) : super({ src.max() ?: Double.MIN_VALUE })

    /**
     * @param src Numbers
     */
    constructor(vararg src: Float) : super({ src.max()?.toDouble() ?: Double.MIN_VALUE })

    /**
     * @param src The iterable
     */
    constructor(src: Iterable<Number>) : super({ src.maxBy { it.toDouble() }?.toDouble() ?: Double.MIN_VALUE })
}
