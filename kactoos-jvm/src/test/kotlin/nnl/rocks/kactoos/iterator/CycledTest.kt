package nnl.rocks.kactoos.iterator

import nnl.rocks.kactoos.iterable.IterableNoNulls
import nnl.rocks.kactoos.iterable.IterableOf
import nnl.rocks.kactoos.test.ScalarHasValue
import org.hamcrest.MatcherAssert
import org.junit.Test
import java.util.Collections
import java.util.NoSuchElementException

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
    fun repeatIteratorTest() {
        val expected = "two"
        MatcherAssert.assertThat(
            "Can't repeat iterator",
            ItemAt(
                Cycled(
                    IterableNoNulls(
                        IterableOf(
                            "one", expected, "three"
                        )
                    )
                ),
                7
            ),
            ScalarHasValue(
                expected
            )
        )
    }

    @Test(expected = NoSuchElementException::class)
    @Throws(Exception::class)
    fun notCycledEmptyTest() {
        Cycled(
            Iterable<Any> { Collections.emptyIterator() }
        ).next()
    }
}
