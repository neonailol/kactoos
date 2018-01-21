package nnl.rocks.kactoos.iterable

import nnl.rocks.kactoos.list.ListOf
import org.hamcrest.MatcherAssert
import org.hamcrest.Matchers
import org.junit.Test
import java.util.Collections
import java.util.concurrent.atomic.AtomicInteger

/**
 * Test case for [StickyIterable].
 *
 *
 *
 * @since 0.8
 *
 */
class StickyIterableTest {

    @Test
    @Throws(Exception::class)
    fun ignoresChangesInIterable() {
        val size = AtomicInteger(2)
        val list = StickyIterable(
            ListOf<Int>(
                Collections.nCopies(size.incrementAndGet(), 0).iterator()
            )
        )
        MatcherAssert.assertThat(
            "Can't ignore the changes in the underlying iterable",
            LengthOf(list).toInt(),
            Matchers.equalTo(LengthOf(list).toInt())
        )
    }
}
