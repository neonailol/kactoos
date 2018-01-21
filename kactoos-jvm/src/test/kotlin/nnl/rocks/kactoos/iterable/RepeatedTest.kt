package nnl.rocks.kactoos.iterable

import nnl.rocks.kactoos.func.FuncOf
import org.hamcrest.MatcherAssert
import org.hamcrest.Matchers
import org.junit.Test

/**
 * Test case for [Repeated].
 *
 *
 *
 * @since 0.1
 *
 *
 */
class RepeatedTest {

    @Test
    @Throws(Exception::class)
    fun allSameTest() {
        val size = 42
        val element = 11
        MatcherAssert.assertThat(
            "Can't generate an iterable with fixed size",
            LengthOf(
                Filtered(
                    FuncOf<Int, Boolean> { input -> input == element },
                    Repeated(size, element)
                )
            ).toInt(),
            Matchers.equalTo(size)
        )
    }

    @Test
    @Throws(Exception::class)
    fun emptyTest() {
        MatcherAssert.assertThat(
            "Can't generate an empty iterable",
            LengthOf(Repeated(0, 0)).toInt(),
            Matchers.equalTo(0)
        )
    }

    @Test
    @Throws(Exception::class)
    fun repeatsIntegerTwice() {
        val list = Repeated(5, 1)
        MatcherAssert.assertThat<Iterable<Int>>(
            "Can't repeat an integer",
            list, Matchers.iterableWithSize(5)
        )
        MatcherAssert.assertThat<Iterable<Int>>(
            "Can't repeat an integer, again",
            list, Matchers.iterableWithSize(5)
        )
    }
}
