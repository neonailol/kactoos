
package nnl.rocks.kactoos.scalar

import org.hamcrest.MatcherAssert
import org.hamcrest.Matchers
import org.junit.Test

import java.io.IOException

/**
 * Test case for [BoolOf].
 *
 * @author Kirill (g4s8.public@gmail.com)
 * @version $Id: ee8734fda066d0c31fd4994b0d0b0f006c48eb88 $
 * @since 0.2
 * @checkstyle JavadocMethodCheck (500 lines)
 */
class BoolOfTest {

    @Test
    @Throws(IOException::class)
    fun trueTest() {
        MatcherAssert.assertThat(
                "Can't parse 'true' string",
                BoolOf("true").value(),
                Matchers.equalTo(true)
        )
    }

    @Test
    @Throws(IOException::class)
    fun falseTest() {
        MatcherAssert.assertThat(
                "Can't parse 'false' string",
                BoolOf("false").value(),
                Matchers.equalTo(false)
        )
    }

    @Test
    @Throws(IOException::class)
    fun isFalseIfTextDoesNotRepresentABoolean() {
        MatcherAssert.assertThat(
                "Can't parse a non-boolean string",
                BoolOf("abc").value(),
                Matchers.equalTo(false)
        )
    }
}
