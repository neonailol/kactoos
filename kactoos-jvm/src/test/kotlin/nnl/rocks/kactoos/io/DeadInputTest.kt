
package nnl.rocks.kactoos.io

import nnl.rocks.kactoos.matchers.InputHasContent
import org.hamcrest.MatcherAssert
import org.junit.Test

/**
 * Test case for [DeadInput].
 *
 * @author Yegor Bugayenko (yegor256@gmail.com)
 * @version $Id: 9aafa6cac830040f1a0cc3ea2d0f2194ade95032 $
 * @since 0.16
 * @checkstyle JavadocMethodCheck (500 lines)
 * @checkstyle ClassDataAbstractionCouplingCheck (500 lines)
 */
class DeadInputTest {

    @Test
    fun readsEmptyContent() {
        MatcherAssert.assertThat(
                "Can't read empty content",
                DeadInput(),
                InputHasContent("")
        )
    }
}
