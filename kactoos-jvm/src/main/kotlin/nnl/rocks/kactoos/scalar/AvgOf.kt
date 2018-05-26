package nnl.rocks.kactoos.scalar

import nnl.rocks.kactoos.KScalar
import nnl.rocks.kactoos.Scalar
import nnl.rocks.kactoos.func.FuncOf
import nnl.rocks.kactoos.iterable.LengthOf
import nnl.rocks.kactoos.iterable.Mapped
import java.math.BigDecimal
import java.math.MathContext

/**
 * Average of numbers.
 *
 * Here is how you can use it to fine mathematical average of numbers:
 *
 * ```kotlin
 * val avg = AvgOf(1, 2, 3).toInt()
 * val avg = AvgOf(1L, 2L, 3L).toLong()
 * ```
 *
 * There is no thread-safety guarantee.
 *
 * @param src The iterable
 * @since 0.5
 */
class AvgOf(src: Iterable<KScalar<Number>>) : NumberEnvelope(
    Ternary(
        LengthOf(src).toLong(),
        FuncOf { len -> len > 0 },
        FuncOf { len ->
            src.map { BigDecimal.valueOf(it().toDouble()) }
                .fold(BigDecimal.ZERO) { acc, r -> acc.add(r, MathContext.DECIMAL128) }
                .divide(BigDecimal.valueOf(len), MathContext.DECIMAL128)
                .toDouble()
        },
        FuncOf { 0.0 }
    )
) {

    constructor(vararg src: Int) : this(
        Mapped(
            FuncOf { number: Int -> { number } },
            Iterable { src.iterator() }
        )
    )

    constructor(vararg src: Long) : this(
        Mapped(
            FuncOf { number: Long -> { number } },
            Iterable { src.iterator() }
        )
    )

    constructor(vararg src: Double) : this(
        Mapped(
            FuncOf { number: Double -> { number } },
            Iterable { src.iterator() }
        )
    )

    constructor(vararg src: Float) : this(
        Mapped(
            FuncOf { number: Float -> { number } },
            Iterable { src.iterator() }
        )
    )

    constructor(vararg src: KScalar<Number>) : this(Iterable { src.iterator() })

    constructor(vararg src: Scalar<Number>) : this(Iterable { src.map { { it() } }.iterator() })
}
