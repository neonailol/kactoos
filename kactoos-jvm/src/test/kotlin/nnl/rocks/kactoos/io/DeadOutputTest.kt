
package nnl.rocks.kactoos.io

import nnl.rocks.kactoos.matchers.InputHasContent
import org.hamcrest.MatcherAssert
import org.hamcrest.Matchers
import org.junit.Test

/**
 * Test case for [DeadOutput].
 *
 * @author Yegor Bugayenko (yegor256@gmail.com)
 * @version $Id: f2a3133c21126d3f61a50b5514b74f58bcad2914 $
 * @since 0.16
 * @checkstyle JavadocMethodCheck (500 lines)
 * @checkstyle ClassDataAbstractionCouplingCheck (500 lines)
 */
class DeadOutputTest {

    @Test
    fun readsEmptyContent() {
        MatcherAssert.assertThat(
                "Can't write empty content",
                TeeInput(
                        InputOf("How are you, мой друг?"),
                        DeadOutput()
                ),
                InputHasContent(Matchers.endsWith("друг?"))
        )
    }
}
