package nnl.rocks.kactoos.scalar

import nnl.rocks.kactoos.KScalar
import nnl.rocks.kactoos.Scalar
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
 * ```kotlin
 * val avg = AvgOf(1, 2, 3).toInt()
 * val avg = AvgOf(1L, 2L, 3L).toLong()
 * ```
 *
 * There is no thread-safety guarantee.
 *
 * @since 0.4
 */
class AvgOf private constructor(value: KScalar<Double>) : NumberEnvelope(value) {

    private constructor(value: Scalar<Double>) : this({ value() })

    constructor(
        src: Iterable<KScalar<Number>>
    ) : this(
        Ternary(
            LengthOf(src).toLong(),
            FuncOf { len -> len > 0 },
            FuncOf { len ->
                src
                    .fold(
                        BigDecimal.ZERO
                    ) { accumulator, element ->
                        accumulator.add(BigDecimal.valueOf(element().toDouble()), MathContext.UNLIMITED)
                    }
                    .divide(BigDecimal.valueOf(len), MathContext.UNLIMITED)
                    .toDouble()
            },
            FuncOf { 0.0 }
        )
    )

    constructor(
        vararg src: Int
    ) : this(
        Mapped(
            { number: Int -> { number } },
            src.asIterable()
        )
    )

    constructor(
        vararg src: Long
    ) : this(
        Mapped(
            { number: Long -> { number } },
            src.asIterable()
        )
    )

    constructor(
        vararg src: Double
    ) : this(
        Mapped(
            { number: Double -> { number } },
            src.asIterable()
        )
    )

    constructor(
        vararg src: Float
    ) : this(
        Mapped(
            { number: Float -> { number } },
            src.asIterable()
        )
    )

    constructor(
        vararg src: KScalar<Number>
    ) : this(
        IterableOf(src.asIterable())
    )

    constructor(
        vararg src: Scalar<Number>
    ) : this(
        Mapped(
            { number: Scalar<Number> -> { number() } },
            src.asIterable()
        )
    )

}
