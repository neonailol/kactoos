package nnl.rocks.kactoos.scalar

import nnl.rocks.kactoos.Scalar
import nnl.rocks.kactoos.iterable.IterableOf
import org.hamcrest.MatcherAssert
import org.hamcrest.Matchers
import org.junit.Test

/**
 * Test case for [AvgOf].
 *
 *
 *
 * @since 0.24
 *
 *
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
    fun withIntegerCollection() {
        MatcherAssert.assertThat(
            AvgOf(
                1, 2, 3, 4
            ).toInt(),
            Matchers.equalTo(2)
        )
        MatcherAssert.assertThat(
            AvgOf(
                1, 2, 3, 4
            ).toLong(),
            Matchers.equalTo(2L)
        )
        MatcherAssert.assertThat(
            AvgOf(
                1, 2, 3, 4
            ).toDouble(),
            Matchers.equalTo(2.5)
        )
        MatcherAssert.assertThat(
            AvgOf(
                1, 2, 3, 4
            ).toFloat(),
            Matchers.equalTo(2.5f)
        )
    }

    @Test
    fun withLongCollection() {
        MatcherAssert.assertThat(
            AvgOf(
                1L, 2L, 3L, 4L
            ).toInt(),
            Matchers.equalTo(2)
        )
        MatcherAssert.assertThat(
            AvgOf(
                1L, 2L, 3L, 4L
            ).toLong(),
            Matchers.equalTo(2L)
        )
        MatcherAssert.assertThat(
            AvgOf(
                1L, 2L, 3L, 4L
            ).toDouble(),
            Matchers.equalTo(2.5)
        )
        MatcherAssert.assertThat(
            AvgOf(
                1L, 2L, 3L, 4L
            ).toFloat(),
            Matchers.equalTo(2.5f)
        )
    }

    @Test
    fun withDoubleCollection() {
        MatcherAssert.assertThat(
            AvgOf(
                1.0, 2.0, 3.0, 4.0
            ).toInt(),
            Matchers.equalTo(2)
        )
        MatcherAssert.assertThat(
            AvgOf(
                1.0, 2.0, 3.0, 4.0
            ).toLong(),
            Matchers.equalTo(2L)
        )
        MatcherAssert.assertThat(
            AvgOf(
                1.0, 2.0, 3.0, 4.0
            ).toDouble(),
            Matchers.equalTo(2.5)
        )
        MatcherAssert.assertThat(
            AvgOf(
                1.0, 2.0, 3.0, 4.0
            ).toFloat(),
            Matchers.equalTo(2.5f)
        )
    }

    @Test
    fun withFloatCollection() {
        MatcherAssert.assertThat(
            AvgOf(
                1.0f, 2.0f, 3.0f, 4.0f
            ).toInt(),
            Matchers.equalTo(2)
        )
        MatcherAssert.assertThat(
            AvgOf(
                1.0f, 2.0f, 3.0f, 4.0f
            ).toLong(),
            Matchers.equalTo(2L)
        )
        MatcherAssert.assertThat(
            AvgOf(
                1.0f, 2.0f, 3.0f, 4.0f
            ).toDouble(),
            Matchers.equalTo(2.5)
        )
        MatcherAssert.assertThat(
            AvgOf(
                1.0f, 2.0f, 3.0f, 4.0f
            ).toFloat(),
            Matchers.equalTo(2.5f)
        )
    }

    @Test
    fun withScalars() {
        MatcherAssert.assertThat(
            AvgOf(
                ScalarOf { 1L }, ScalarOf { 2L }, ScalarOf { 10L }
            ).toLong(),
            Matchers.equalTo(4L)
        )
        MatcherAssert.assertThat(
            AvgOf(
                IterableOf<Scalar<Number>>(ScalarOf { 1L }, ScalarOf { 2L }, ScalarOf { 10L })
            ).toLong(),
            Matchers.equalTo(4L)
        )
    }
}
