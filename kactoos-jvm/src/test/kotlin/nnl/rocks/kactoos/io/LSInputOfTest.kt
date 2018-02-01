
package nnl.rocks.kactoos.io

import org.hamcrest.MatcherAssert
import org.hamcrest.Matchers
import org.junit.Test

/**
 * Test case for [LSInputOf].
 *
 * @author Yegor Bugayenko (yegor256@gmail.com)
 * @version $Id: e87ccf2fdeff804c40e1dff3db32ae4c8aa4de2a $
 * @since 0.12
 * @checkstyle JavadocMethodCheck (500 lines)
 * @checkstyle AbbreviationAsWordInNameCheck (5 lines)
 */
class LSInputOfTest {

    @Test
    fun readsSimpleInput() {
        MatcherAssert.assertThat(
                "Can't read simple input",
                LSInputOf(
                        InputOf("hello, world!")
                ).stringData,
                Matchers.endsWith("world!")
        )
    }

    @Test
    fun readsBiggerInput() {
        val size = 400000
        MatcherAssert.assertThat(
                "Can't read bigger input",
                LSInputOf(
                        InputOf(
                                SlowInputStream(size)
                        )
                ).stringData.length,
                Matchers.equalTo(size)
        )
    }

    @Test
    fun countsBytesInBiggerInput() {
        val size = 300000
        MatcherAssert.assertThat(
                "Can't count bytes in a bigger input",
                LSInputOf(
                        InputOf(
                                SlowInputStream(size)
                        )
                ).stringData.length,
                Matchers.equalTo(size)
        )
    }
}
