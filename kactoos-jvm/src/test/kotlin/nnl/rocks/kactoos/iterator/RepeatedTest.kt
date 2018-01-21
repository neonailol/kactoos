package nnl.rocks.kactoos.iterator

import org.hamcrest.MatcherAssert
import org.hamcrest.Matchers
import org.junit.Test

/**
 * Test case for [Repeated].
 *
 *
 *
 * @since 0.4
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
                Repeated(
                    size, element
                )
            ).toInt(),
            Matchers.equalTo(size)
        )
    }

    @Test
    @Throws(Exception::class)
    fun emptyTest() {
        MatcherAssert.assertThat(
            "Can't generate an empty iterator",
            Iterable { Repeated(0, 0) },
            Matchers.iterableWithSize(0)
        )
    }
}
