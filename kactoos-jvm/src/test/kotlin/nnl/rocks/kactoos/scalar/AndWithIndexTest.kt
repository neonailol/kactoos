
package nnl.rocks.kactoos.scalar

import nnl.rocks.kactoos.func.BiFuncOf
import nnl.rocks.kactoos.matchers.MatcherOf
import nnl.rocks.kactoos.matchers.ScalarHasValue
import org.hamcrest.MatcherAssert
import org.hamcrest.Matchers
import org.junit.Test

import java.util.LinkedList

/**
 * Test case for [AndWithIndex].
 *
 * @author Yegor Bugayenko (yegor256@gmail.com)
 * @version $Id: 0adfbdbda4f7a2c0c1e35a710c15851c44064a3f $
 * @since 0.8
 * @checkstyle JavadocMethodCheck (500 lines)
 * @checkstyle ClassDataAbstractionCouplingCheck (500 lines)
 */
class AndWithIndexTest {

    @Test
    fun iteratesListWithIndex() {
        val list = LinkedList<String>()
        MatcherAssert.assertThat(
                "Can't iterate a list with a procedure",
                AndWithIndex(
                        BiFuncOf<Any, Any, Boolean>(
                                { text, index -> list.add(index.toInt(), text) },
                                true
                        ),
                        "hello", "world"
                ),
                ScalarHasValue(
                        Matchers.allOf(
                                Matchers.equalTo<T>(true),
                                MatcherOf { value -> list.size == 2 }
                        )
                )
        )
    }
}
