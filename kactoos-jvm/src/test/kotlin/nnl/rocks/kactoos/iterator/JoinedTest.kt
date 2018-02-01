
package nnl.rocks.kactoos.iterator

import org.hamcrest.MatcherAssert
import org.hamcrest.Matchers
import org.junit.Test

/**
 * Test case for [Joined].
 * @author Yegor Bugayenko (yegor256@gmail.com)
 * @version $Id: 31e85abce93bfed341bc1173b4739761f785b0bd $
 * @since 0.14
 * @checkstyle JavadocMethodCheck (500 lines)
 */
class JoinedTest {

    @Test
    fun joinsIterators() {
        MatcherAssert.assertThat(
                "Can't concatenate mapped iterators together",
                LengthOf(
                        IteratorNoNulls(
                                Joined(
                                        Mapped<String, Iterator<String>>(
                                                { input -> setOf<String>(input).iterator() },
                                                setOf("x").iterator()
                                        )
                                )
                        )
                ).toInt(),
                Matchers.equalTo(1)
        )
    }
}
