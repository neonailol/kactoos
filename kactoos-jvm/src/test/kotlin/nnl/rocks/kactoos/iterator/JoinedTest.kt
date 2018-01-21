package nnl.rocks.kactoos.iterator

import nnl.rocks.kactoos.func.FuncOf
import org.hamcrest.MatcherAssert
import org.hamcrest.Matchers
import org.junit.Test

/**
 * Test case for [Joined].
 *
 *
 * @since 0.14
 *
 */
class JoinedTest {

    @Test
    fun joinsIterators() {
        MatcherAssert.assertThat(
            "Can't concatenate mapped iterators together",
            LengthOf(
                IteratorNoNulls(
                    Joined(
                        Mapped(
                            FuncOf { input -> setOf(input).iterator() },
                            setOf("x").iterator()
                        )
                    )
                )
            ).toInt(),
            Matchers.equalTo(1)
        )
    }
}
