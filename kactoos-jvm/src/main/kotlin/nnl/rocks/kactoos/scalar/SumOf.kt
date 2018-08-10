package nnl.rocks.kactoos.scalar

import nnl.rocks.kactoos.iterable.IterableOf
import java.math.BigDecimal
import java.math.MathContext

/**
 * Represents total sum of given numbers.
 *
 * Here is how you can use it to summarize numbers:
 *
 * ```
 * val sum = SumOf(1, 2, 3, 4).toInt()
 * val sum = SumOf(1, 2, 3, 4).toLong()
 * ```
 *
 * There is no thread-safety guarantee.
 *
 * @since 0.3
 */
class SumOf(
    numbers: Iterable<Number>
) : NumberEnvelope(
    {
        numbers.fold(
            BigDecimal.ZERO
        ) { acc, number ->
            acc.add(BigDecimal.valueOf(number.toDouble()), MathContext.UNLIMITED)
        }.toDouble()
    }
) {

    /**
     * @param src Integers
     * @since 0.3
     */
    constructor(
        vararg src: Int
    ) : this(IterableOf(src.asIterable()))

    /**
     * @param src Longs
     * @since 0.3
     */
    constructor(
        vararg src: Long
    ) : this(IterableOf(src.asIterable()))

    /**
     * @param src Doubles
     * @since 0.3
     */
    constructor(
        vararg src: Double
    ) : this(IterableOf(src.asIterable()))

    /**
     * @param src Floats
     * @since 0.3
     */
    constructor(
        vararg src: Float
    ) : this(IterableOf(src.asIterable()))
}
