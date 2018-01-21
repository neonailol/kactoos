package nnl.rocks.kactoos.scalar

import org.hamcrest.MatcherAssert
import org.hamcrest.Matchers
import org.junit.Test

/**
 * Test case for [Equals].
 *
 *
 *
 * @since 0.9
 *
 */
class EqualsTest {

    @Test
    @Throws(Exception::class)
    fun compareEquals() {
        MatcherAssert.assertThat(
            "Can't compare if two integers are equals",
            Equals(
                ScalarOf { 1 },
                ScalarOf { 1 }
            ).value(),
            Matchers.equalTo(true)
        )
    }

    @Test
    @Throws(Exception::class)
    fun compareNotEquals() {
        MatcherAssert.assertThat(
            "Can't compare if two integers are not equals",
            Equals(
                ScalarOf { 1 },
                ScalarOf { 2 }
            ).value(),
            Matchers.equalTo(false)
        )
    }

    @Test
    @Throws(Exception::class)
    fun compareEqualsText() {
        val str = "hello"
        MatcherAssert.assertThat(
            "Can't compare if two strings are equals",
            Equals(
                ScalarOf { str },
                ScalarOf { str }
            ).value(),
            Matchers.equalTo(true)
        )
    }

    @Test
    @Throws(Exception::class)
    fun compareNotEqualsText() {
        MatcherAssert.assertThat(
            "Can't compare if two strings are not equals",
            Equals(
                ScalarOf { "world" },
                ScalarOf { "worle" }
            ).value(),
            Matchers.equalTo(false)
        )
    }
}
