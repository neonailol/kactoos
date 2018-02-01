
package nnl.rocks.kactoos.scalar

import nnl.rocks.kactoos.Scalar
import nnl.rocks.kactoos.iterable.IterableOf
import org.hamcrest.MatcherAssert
import org.hamcrest.Matchers
import org.junit.Test

/**
 * Test case for [AvgOf].
 *
 * @author Vseslav Sekorin (vssekorin@gmail.com)
 * @version $Id: 9607abcd368617baae8ce41fe9e97ee2de00057b $
 * @since 0.24
 * @checkstyle JavadocMethodCheck (500 lines)
 * @checkstyle MagicNumberCheck (500 lines)
 */
class AvgOfTest {

    @Test
    fun withEmptyCollection() {
        MatcherAssert.assertThat(
                AvgOf(emptyList()).toLong(),
                Matchers.equalTo(0L)
        )
    }

    @Test
    fun withIntCollectionIntValue() {
        MatcherAssert.assertThat(
                AvgOf(
                        1, 2, 3, 4
                ).toInt(),
                Matchers.equalTo(2)
        )
    }

    @Test
    fun withIntCollectionIntValueMaxValues() {
        MatcherAssert.assertThat(
                AvgOf(
                        Integer.MAX_VALUE, Integer.MAX_VALUE
                ).toInt(),
                Matchers.equalTo(Integer.MAX_VALUE)
        )
    }

    @Test
    fun withIntCollectionLongValue() {
        MatcherAssert.assertThat(
                AvgOf(
                        1, 2, 3, 4
                ).toLong(),
                Matchers.equalTo(2L)
        )
    }

    @Test
    fun withIntCollectionDoubleValue() {
        MatcherAssert.assertThat(
                AvgOf(
                        1, 2, 3, 4
                ).toDouble(),
                Matchers.equalTo(2.5)
        )
    }

    @Test
    fun withIntCollectionFloatValue() {
        MatcherAssert.assertThat(
                AvgOf(
                        1, 2, 3, 4
                ).toFloat(),
                Matchers.equalTo(2.5f)
        )
    }

    @Test
    fun withLongCollectionIntValue() {
        MatcherAssert.assertThat(
                AvgOf(
                        1L, 2L, 3L, 4L
                ).toInt(),
                Matchers.equalTo(2)
        )
    }

    @Test
    fun withLongCollectionLongValue() {
        MatcherAssert.assertThat(
                AvgOf(
                        1L, 2L, 3L, 4L
                ).toLong(),
                Matchers.equalTo(2L)
        )
    }

    @Test
    fun withLongCollectionMaxValue() {
        MatcherAssert.assertThat(
                AvgOf(
                        java.lang.Long.MAX_VALUE, java.lang.Long.MAX_VALUE
                ).toLong(),
                Matchers.equalTo(java.lang.Long.MAX_VALUE)
        )
    }

    @Test
    fun withLongCollectionDoubleValue() {
        MatcherAssert.assertThat(
                AvgOf(
                        1L, 2L, 3L, 4L
                ).toDouble(),
                Matchers.equalTo(2.5)
        )
    }

    @Test
    fun withLongCollectionFloatValue() {
        MatcherAssert.assertThat(
                AvgOf(
                        1L, 2L, 3L, 4L
                ).toFloat(),
                Matchers.equalTo(2.5f)
        )
    }

    @Test
    fun withDoubleCollectionIntValue() {
        MatcherAssert.assertThat(
                AvgOf(
                        1.0, 2.0, 3.0, 4.0
                ).toInt(),
                Matchers.equalTo(2)
        )
    }

    @Test
    fun withDoubleCollectionLongValue() {
        MatcherAssert.assertThat(
                AvgOf(
                        1.0, 2.0, 3.0, 4.0
                ).toLong(),
                Matchers.equalTo(2L)
        )
    }

    @Test
    fun withDoubleCollectionDoubleValue() {
        MatcherAssert.assertThat(
                AvgOf(
                        1.0, 2.0, 3.0, 4.0
                ).toDouble(),
                Matchers.equalTo(2.5)
        )
    }

    @Test
    fun withDoubleCollectionMaxValue() {
        MatcherAssert.assertThat(
                AvgOf(
                        java.lang.Double.MAX_VALUE, java.lang.Double.MAX_VALUE
                ).toDouble(),
                Matchers.equalTo(java.lang.Double.MAX_VALUE)
        )
    }

    @Test
    fun withDoubleCollectionMinValue() {
        MatcherAssert.assertThat(
                AvgOf(
                        java.lang.Double.MIN_VALUE, java.lang.Double.MIN_VALUE
                ).toDouble(),
                Matchers.equalTo(java.lang.Double.MIN_VALUE)
        )
    }

    @Test(expected = NumberFormatException::class)
    fun withDoubleCollectionPositiveInfinity() {
        AvgOf(
                java.lang.Double.POSITIVE_INFINITY, java.lang.Double.POSITIVE_INFINITY
        ).toDouble()
    }

    @Test(expected = NumberFormatException::class)
    fun withDoubleCollectionNegativeInfinity() {
        AvgOf(
                java.lang.Double.NEGATIVE_INFINITY, java.lang.Double.NEGATIVE_INFINITY
        ).toDouble()
    }

    @Test(expected = NumberFormatException::class)
    fun withDoubleCollectionNaN() {
        AvgOf(
                java.lang.Double.NaN, java.lang.Double.NaN
        ).toDouble()
    }

    @Test
    fun withDoubleCollectionNegativeNumbersDoubleValue() {
        MatcherAssert.assertThat(
                AvgOf(
                        - 1.0, - 2.0, - 3.0, - 4.0
                ).toDouble(),
                Matchers.equalTo(- 2.5)
        )
    }

    @Test
    fun withDecimalCollectionPrecisionProblem() {
        MatcherAssert.assertThat(
                AvgOf(
                        100.0, 100.666, 100.0
                ).toFloat(),
                Matchers.equalTo(100.222f)
        )
    }

    @Test
    fun withDecimalCollectionPrecisionProblemExtraDecimalRange() {
        MatcherAssert.assertThat(
                AvgOf(
                        100.266, 100.267
                ).toFloat(),
                Matchers.equalTo(100.2665f)
        )
    }

    @Test
    fun withFloatCollectionIntValue() {
        MatcherAssert.assertThat(
                AvgOf(
                        1.0f, 2.0f, 3.0f, 4.0f
                ).toInt(),
                Matchers.equalTo(2)
        )
    }

    @Test
    fun withFloatCollectionLongValue() {
        MatcherAssert.assertThat(
                AvgOf(
                        1.0f, 2.0f, 3.0f, 4.0f
                ).toLong(),
                Matchers.equalTo(2L)
        )
    }

    @Test
    fun withFloatCollectionDoubleValue() {
        MatcherAssert.assertThat(
                AvgOf(
                        1.0f, 2.0f, 3.0f, 4.0f
                ).toDouble(),
                Matchers.equalTo(2.5)
        )
    }

    @Test
    fun withFloatCollectionFloatValue() {
        MatcherAssert.assertThat(
                AvgOf(
                        1.0f, 2.0f, 3.0f, 4.0f
                ).toFloat(),
                Matchers.equalTo(2.5f)
        )
    }

    @Test
    fun withFloatCollectionMaxValue() {
        MatcherAssert.assertThat(
                AvgOf(
                        java.lang.Float.MAX_VALUE, java.lang.Float.MAX_VALUE
                ).toFloat(),
                Matchers.equalTo(java.lang.Float.MAX_VALUE)
        )
    }

    @Test
    fun withFloatCollectionMinValue() {
        MatcherAssert.assertThat(
                AvgOf(
                        java.lang.Float.MIN_VALUE, java.lang.Float.MIN_VALUE
                ).toFloat(),
                Matchers.equalTo(java.lang.Float.MIN_VALUE)
        )
    }

    @Test
    fun withIntScalarsIntValue() {
        MatcherAssert.assertThat(
                AvgOf(
                        { 1 }, { 2 }, { 10 }
                ).toInt(),
                Matchers.equalTo(4)
        )
    }

    @Test
    fun withLongScalarsIntValue() {
        MatcherAssert.assertThat(
                AvgOf(
                        { 1L }, { 2L }, { 10L }
                ).toInt(),
                Matchers.equalTo(4)
        )
    }

    @Test
    fun withFloatScalarsIntValue() {
        MatcherAssert.assertThat(
                AvgOf(
                        { 1.0f }, { 2.0f }, { 10.0f }
                ).toLong(),
                Matchers.equalTo(4L)
        )
    }

    @Test
    fun withDoubleScalarsIntValue() {
        MatcherAssert.assertThat(
                AvgOf(
                        { 1.0 }, { 2.0 }, { 10.0 }
                ).toInt(),
                Matchers.equalTo(4)
        )
    }

    @Test
    fun withIterableOfScalars() {
        MatcherAssert.assertThat(
                AvgOf(
                        IterableOf<Scalar<Number>>({ 1L }, { 2L }, { 10L })
                ).toLong(),
                Matchers.equalTo(4L)
        )
    }

    @Test
    fun withCompositionOfScalars() {
        MatcherAssert.assertThat(
                AvgOf(
                        { MinOf(1.0, 2.0) },
                        { MaxOf(2.0, 4.0) },
                        { SumOf(1.0, 2.0, 2.0) },
                        Ternary<Double, Any>(true, 5.0, 1.0)
                ).toInt(),
                Matchers.equalTo(3)
        )
    }
}
