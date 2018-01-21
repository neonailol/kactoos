package nnl.rocks.kactoos.iterator

import nnl.rocks.kactoos.Scalar
import nnl.rocks.kactoos.Text
import nnl.rocks.kactoos.func.FuncOf
import nnl.rocks.kactoos.test.TextHasString
import nnl.rocks.kactoos.text.FormattedText
import nnl.rocks.kactoos.text.JoinedText
import org.hamcrest.MatcherAssert
import org.junit.Test
import java.util.concurrent.atomic.AtomicInteger

/**
 * Test case for [StickyIterator].
 *
 *
 *
 * @since 0.8
 *
 *
 */
class StickyTest {

    @Test
    @Throws(Exception::class)
    fun ignoresChangesInIterable() {
        val count = AtomicInteger(2)
        val text = FormattedText(
            "%s",
            JoinedText(
                ", ",
                Iterable {
                    Mapped<Int, String>(
                        FuncOf { it.toString() }, StickyIterator(
                        Limited(
                            2, Endless(
                            object : Scalar<Int> {
                                override fun value(): Int {
                                    return count.incrementAndGet()
                                }
                            }
                        )
                        )
                    )
                    )
                }
            )
        )
        MatcherAssert.assertThat<Text>(
            "Can't ignore the changes in the underlying iterator",
            text,
            TextHasString(text.asString())
        )
    }
}
