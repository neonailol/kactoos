package nnl.rocks.kactoos.iterable

import nnl.rocks.kactoos.test.ScalarHasValue
import org.hamcrest.MatcherAssert
import org.hamcrest.Matchers
import org.junit.Test
import java.util.Collections

/**
 * Test Case for [Cycled].
 *
 *
 * @since 0.8
 *
 */
class CycledTest {

    @Test
    @Throws(Exception::class)
    fun repeatIterableTest() {
        val expected = "two"
        MatcherAssert.assertThat(
            "Can't repeat iterable",
            ItemAt(
                7, Cycled(
                IterableOf(
                    "one", expected, "three"
                )
            )
            ),
            ScalarHasValue(
                expected
            )
        )
    }

    @Test
    @Throws(Exception::class)
    fun notCycledEmptyTest() {
        MatcherAssert.assertThat(
            "Can't generate an empty iterable",
            LengthOf(
                Cycled(
                    Iterable<Any> { Collections.emptyIterator() }
                )
            ).toInt(),
            Matchers.equalTo(0)
        )
    }
}
