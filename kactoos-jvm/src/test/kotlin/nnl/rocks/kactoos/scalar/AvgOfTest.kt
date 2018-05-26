package nnl.rocks.kactoos.scalar

import nnl.rocks.kactoos.iterable.IterableOf
import org.testng.Assert.assertEquals
import org.testng.annotations.Test

class AvgOfTest {

    @Test
    fun withEmptyCollection() {
        assertEquals(
            AvgOf(emptyList()).toLong(),
            0L
        )
    }

    @Test
    fun withIntCollectionIntValue() {
        assertEquals(
            AvgOf(
                1, 2, 3, 4
            ).toInt(),
            2
        )
    }

    @Test
    fun withIntCollectionIntValueMaxValues() {
        assertEquals(
            AvgOf(
                Integer.MAX_VALUE, Integer.MAX_VALUE
            ).toInt(),
            Integer.MAX_VALUE
        )
    }

    @Test
    fun withIntCollectionLongValue() {
        assertEquals(
            AvgOf(
                1, 2, 3, 4
            ).toLong(),
            2L
        )
    }

    @Test
    fun withIntCollectionDoubleValue() {
        assertEquals(
            AvgOf(
                1, 2, 3, 4
            ).toDouble(),
            2.5
        )
    }

    @Test
    fun withIntCollectionFloatValue() {
        assertEquals(
            AvgOf(
                1, 2, 3, 4
            ).toFloat(),
            2.5f
        )
    }

    @Test
    fun withLongCollectionIntValue() {
        assertEquals(
            AvgOf(
                1L, 2L, 3L, 4L
            ).toInt(),
            2
        )
    }

    @Test
    fun withLongCollectionLongValue() {
        assertEquals(
            AvgOf(
                1L, 2L, 3L, 4L
            ).toLong(),
            2L
        )
    }

    @Test
    fun withLongCollectionMaxValue() {
        assertEquals(
            AvgOf(
                Long.MAX_VALUE, Long.MAX_VALUE
            ).toLong(),
            Long.MAX_VALUE
        )
    }

    @Test
    fun withLongCollectionDoubleValue() {
        assertEquals(
            AvgOf(
                1L, 2L, 3L, 4L
            ).toDouble(),
            2.5
        )
    }

    @Test
    fun withLongCollectionFloatValue() {
        assertEquals(
            AvgOf(
                1L, 2L, 3L, 4L
            ).toFloat(),
            2.5f
        )
    }

    @Test
    fun withDoubleCollectionIntValue() {
        assertEquals(
            AvgOf(
                1.0, 2.0, 3.0, 4.0
            ).toInt(),
            2
        )
    }

    @Test
    fun withDoubleCollectionLongValue() {
        assertEquals(
            AvgOf(
                1.0, 2.0, 3.0, 4.0
            ).toLong(),
            2L
        )
    }

    @Test
    fun withDoubleCollectionDoubleValue() {
        assertEquals(
            AvgOf(
                1.0, 2.0, 3.0, 4.0
            ).toDouble(),
            2.5
        )
    }

    @Test
    fun withDoubleCollectionMaxValue() {
        assertEquals(
            AvgOf(
                Double.MAX_VALUE, Double.MAX_VALUE
            ).toDouble(),
            Double.MAX_VALUE
        )
    }

    @Test
    fun withDoubleCollectionMinValue() {
        assertEquals(
            AvgOf(
                Double.MIN_VALUE, Double.MIN_VALUE
            ).toDouble(),
            Double.MIN_VALUE
        )
    }

    @Test(expectedExceptions = [NumberFormatException::class])
    fun withDoubleCollectionPositiveInfinity() {
        AvgOf(
            Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY
        ).toDouble()
    }

    @Test(expectedExceptions = [NumberFormatException::class])
    fun withDoubleCollectionNegativeInfinity() {
        AvgOf(
            Double.NEGATIVE_INFINITY, Double.NEGATIVE_INFINITY
        ).toDouble()
    }

    @Test(expectedExceptions = [NumberFormatException::class])
    fun withDoubleCollectionNaN() {
        AvgOf(
            Double.NaN, Double.NaN
        ).toDouble()
    }

    @Test
    fun withDoubleCollectionNegativeNumbersDoubleValue() {
        assertEquals(
            AvgOf(
                - 1.0, - 2.0, - 3.0, - 4.0
            ).toDouble(),
            - 2.5
        )
    }

    @Test
    fun withDecimalCollectionPrecisionProblem() {
        assertEquals(
            AvgOf(
                100.0, 100.666, 100.0
            ).toFloat(),
            100.222f
        )
    }

    @Test
    fun withDecimalCollectionPrecisionProblemExtraDecimalRange() {
        assertEquals(
            AvgOf(
                100.266, 100.267
            ).toFloat(),
            100.2665f
        )
    }

    @Test
    fun withFloatCollectionIntValue() {
        assertEquals(
            AvgOf(
                1.0f, 2.0f, 3.0f, 4.0f
            ).toInt(),
            2
        )
    }

    @Test
    fun withFloatCollectionLongValue() {
        assertEquals(
            AvgOf(
                1.0f, 2.0f, 3.0f, 4.0f
            ).toLong(),
            2L
        )
    }

    @Test
    fun withFloatCollectionDoubleValue() {
        assertEquals(
            AvgOf(
                1.0f, 2.0f, 3.0f, 4.0f
            ).toDouble(),
            2.5
        )
    }

    @Test
    fun withFloatCollectionFloatValue() {
        assertEquals(
            AvgOf(
                1.0f, 2.0f, 3.0f, 4.0f
            ).toFloat(),
            2.5f
        )
    }

    @Test
    fun withFloatCollectionMaxValue() {
        assertEquals(
            AvgOf(
                Float.MAX_VALUE, Float.MAX_VALUE
            ).toFloat(),
            Float.MAX_VALUE
        )
    }

    @Test
    fun withFloatCollectionMinValue() {
        assertEquals(
            AvgOf(
                Float.MIN_VALUE, Float.MIN_VALUE
            ).toFloat(),
            Float.MIN_VALUE
        )
    }

    @Test
    fun withIntScalarsIntValue() {
        assertEquals(
            AvgOf(
                { 1 }, { 2 }, { 10 }
            ).toInt(),
            4
        )
    }

    @Test
    fun withLongScalarsIntValue() {
        assertEquals(
            AvgOf(
                { 1L }, { 2L }, { 10L }
            ).toInt(),
            4
        )
    }

    @Test
    fun withFloatScalarsIntValue() {
        assertEquals(
            AvgOf(
                { 1.0f }, { 2.0f }, { 10.0f }
            ).toLong(),
            4L
        )
    }

    @Test
    fun withDoubleScalarsIntValue() {
        assertEquals(
            AvgOf(
                { 1.0 }, { 2.0 }, { 10.0 }
            ).toInt(),
            4
        )
    }

    @Test
    fun withIterableOfScalars() {
        assertEquals(
            AvgOf(
                IterableOf({ 1L }, { 2L }, { 10L })
            ).toLong(),
            4L
        )
    }

    @Test
    fun withCompositionOfScalars() {
        assertEquals(
            AvgOf(
                Constant { MinOf(1.0, 2.0).invoke() },
                Constant { MaxOf(2.0, 4.0).invoke() },
                Constant { SumOf(1.0, 2.0, 2.0).invoke() },
                Constant {
                    Ternary(
                        true,
                        Constant { 5.0 },
                        Constant { 1.0 }
                    ).invoke().invoke()
                }
            ).toInt(),
            3
        )
    }
}
