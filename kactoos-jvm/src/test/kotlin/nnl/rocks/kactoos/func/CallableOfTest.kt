package nnl.rocks.kactoos.func

import org.hamcrest.MatcherAssert
import org.hamcrest.Matchers
import org.junit.Test

/**
 * Test case for [CallableOf].
 *
 * @author Yegor Bugayenko (yegor256@gmail.com)
 * @version $Id: fc5655dc539e467f68a3d883b2d78161c75a9a5d $
 * @since 0.2
 * @checkstyle JavadocMethodCheck (500 lines)
 */
class CallableOfTest {

    @Test
    @Throws(Exception::class)
    fun convertsFuncIntoCallable() {
        MatcherAssert.assertThat(
            CallableOf<Any, Int>(
                FuncOf { input -> 1 }
            ).call(),
            Matchers.equalTo(1)
        )
    }
}
