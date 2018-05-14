package nnl.rocks.kactoos.scalar

import nnl.rocks.kactoos.Scalar
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
 * This class implements [Scalar], which throws a checked
 * [Exception]. This may not be convenient in many cases. To make
 * it more convenient and get rid of the checked exception you can
 * use [UncheckedScalar] or [IoCheckedScalar] decorators.
 *
 * There is no thread-safety guarantee.
 *
 * @param src The iterable
 * @since 0.24
 */
class AvgOf(src: Iterable<Scalar<Number>>) : NumberEnvelope(Ternary(
    LengthOf(src).toLong(),
    FuncOf { len -> len > 0 },
    FuncOf { len ->
        Reduced<BigDecimal, BigDecimal>(
            BigDecimal.ZERO,
            BiFuncOf { sum, value -> sum.add(value, MathContext.DECIMAL128) },
            Mapped<Scalar<Number>, BigDecimal>(
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
    FuncOf { len -> 0.0 }
)) {

    /**
     * Ctor.
     * @param src Numbers
     */
    constructor(vararg src: Int) : this(
        Mapped<Int, Scalar<Number>>(
            FuncOf<Int, Scalar<Number>> { number -> Constant { number } },
            Iterable { src.iterator() }
        )
    )

    /**
     * Ctor.
     * @param src Numbers
     */
    constructor(vararg src: Long) : this(
        Mapped<Long, Scalar<Number>>(
            FuncOf { number -> Constant { number } },
            Iterable { src.iterator() }
        )
    )

    /**
     * Ctor.
     * @param src Numbers
     */
    constructor(vararg src: Double) : this(
        Mapped<Double, Scalar<Number>>(
            FuncOf { number -> Constant { number } },
            Iterable { src.iterator() }
        )
    )

    /**
     * Ctor.
     * @param src Numbers
     */
    constructor(vararg src: Float) : this(
        Mapped<Float, Scalar<Number>>(
            FuncOf { number -> Constant { number } },
            Iterable { src.iterator() }
        )
    )

    /**
     * Ctor.
     * @param src Numbers
     */
    @SafeVarargs
    constructor(vararg src: Scalar<Number>) : this(IterableOf<Scalar<Number>>(*src))
}
