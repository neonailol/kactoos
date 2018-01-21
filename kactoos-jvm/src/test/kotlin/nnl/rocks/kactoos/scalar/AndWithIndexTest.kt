package nnl.rocks.kactoos.scalar

import nnl.rocks.kactoos.func.BiFuncOf
import nnl.rocks.kactoos.func.BiProcOf
import nnl.rocks.kactoos.test.MatcherOf
import nnl.rocks.kactoos.test.ScalarHasValue
import org.hamcrest.MatcherAssert
import org.hamcrest.Matchers
import org.junit.Test
import java.util.LinkedList

/**
 * Test case for [AndWithIndex].
 *
 *
 *
 * @since 0.8
 *
 *
 */
class AndWithIndexTest {

    @Test
    fun iteratesListWithIndex() {
        val list = LinkedList<String>()
        MatcherAssert.assertThat(
            "Can't iterate a list with a procedure",
            AndWithIndex(
                BiFuncOf(
                    BiProcOf { text, index -> list.add(index, text) },
                    true
                ),
                "hello", "world"
            ),
            ScalarHasValue(
                Matchers.allOf(
                    Matchers.equalTo(true),
                    MatcherOf { value -> list.size == 2 }
                )
            )
        )
    }
}
