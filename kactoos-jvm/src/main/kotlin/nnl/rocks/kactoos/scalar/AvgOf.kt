package nnl.rocks.kactoos.scalar

import nnl.rocks.kactoos.KScalar
import nnl.rocks.kactoos.func.BiFuncOf
import nnl.rocks.kactoos.func.FuncOf
import nnl.rocks.kactoos.iterable.IterableOf
import nnl.rocks.kactoos.iterable.LengthOf
import nnl.rocks.kactoos.iterable.Mapped
import java.math.BigDecimal
import java.math.MathContext

/**
 * Average of numbers.
 *
 * Here is how you can use it to fine mathematical average of numbers:
 *
 * ```java
 * int sum = new AvgOf(1, 2, 3, 4).intValue();
 * long sum = new AvgOf(1L, 2L, 3L).longValue();
 * int sum = new AvgOf(numbers.toArray(new Integer[numbers.size()])).intValue();
 * ```
 *
 * There is no thread-safety guarantee.
 *
 * @param src The iterable
 * @since 0.24
 */
class AvgOf(src: Iterable<KScalar<Number>>) : NumberEnvelope(Ternary(
    LengthOf(src).toLong(),
    FuncOf { len -> len > 0 },
    FuncOf { len ->
        Folded<BigDecimal, BigDecimal>(
            BigDecimal.ZERO,
            BiFuncOf { sum, value -> sum.add(value, MathContext.DECIMAL128) },
            Mapped<KScalar<Number>, BigDecimal>(
                FuncOf { number ->
                    BigDecimal.valueOf(
                        number().toDouble()
                    )
                },
                src
            )
        ).invoke().divide(
            BigDecimal.valueOf(len),
            MathContext.DECIMAL128
        ).toDouble()
    },
    FuncOf { 0.0 }
)) {

    /**
     * Ctor.
     * @param src Numbers
     */
    constructor(vararg src: Int) : this(
        Mapped<Int, KScalar<Number>>(
            FuncOf<Int, KScalar<Number>> { number ->  { number } },
            Iterable { src.iterator() }
        )
    )

    /**
     * Ctor.
     * @param src Numbers
     */
    constructor(vararg src: Long) : this(
        Mapped<Long, KScalar<Number>>(
            FuncOf { number ->  { number } },
            Iterable { src.iterator() }
        )
    )

    /**
     * Ctor.
     * @param src Numbers
     */
    constructor(vararg src: Double) : this(
        Mapped<Double, KScalar<Number>>(
            FuncOf { number ->  { number } },
            Iterable { src.iterator() }
        )
    )

    /**
     * Ctor.
     * @param src Numbers
     */
    constructor(vararg src: Float) : this(
        Mapped<Float, KScalar<Number>>(
            FuncOf { number ->  { number } },
            Iterable { src.iterator() }
        )
    )

    /**
     * Ctor.
     * @param src Numbers
     */
    @SafeVarargs
    constructor(vararg src: KScalar<Number>) : this(IterableOf<KScalar<Number>>(*src))
}
