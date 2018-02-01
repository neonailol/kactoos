
package nnl.rocks.kactoos.scalar

import org.hamcrest.MatcherAssert
import org.hamcrest.Matchers
import org.junit.Test

import java.io.IOException

/**
 * Test case for [NumberOf].
 *
 * @author Kirill (g4s8.public@gmail.com)
 * @version $Id: dd48dc2d6083d1c51190f20815cde38d5b91e906 $
 * @since 0.2
 * @checkstyle JavadocMethodCheck (500 lines)
 */
class NumberOfTest {

    @Test
    @Throws(IOException::class)
    fun parsesFloat() {
        MatcherAssert.assertThat(
                "Can't parse float number",
                NumberOf("1656.894").toFloat(),
                // @checkstyle MagicNumber (1 line)
                Matchers.equalTo(1656.894f)
        )
    }

    @Test(expected = RuntimeException::class)
    @Throws(IOException::class)
    fun failsIfTextDoesNotRepresentAFloat() {
        NumberOf("abcfds").toFloat()
    }

    @Test
    @Throws(IOException::class)
    fun parsesLong() {
        MatcherAssert.assertThat(
                "Can't parse long number",
                NumberOf("186789235425346").toLong(),
                // @checkstyle MagicNumber (1 line)
                Matchers.equalTo(186789235425346L)
        )
    }

    @Test(expected = RuntimeException::class)
    @Throws(IOException::class)
    fun failsIfTextDoesNotRepresentALong() {
        NumberOf("abcddd").toLong()
    }

    @Test
    @Throws(IOException::class)
    fun parsesInteger() {
        MatcherAssert.assertThat(
                "Can't parse integer number",
                NumberOf("1867892354").toInt(),
                // @checkstyle MagicNumber (1 line)
                Matchers.equalTo(1867892354)
        )
    }

    @Test(expected = RuntimeException::class)
    @Throws(IOException::class)
    fun failsIfTextDoesNotRepresentAnInt() {
        NumberOf("abc fdsf").toInt()
    }

    @Test
    @Throws(IOException::class)
    fun parsesDouble() {
        MatcherAssert.assertThat(
                "Can't parse double number",
                NumberOf("185.65156465123").toDouble(),
                // @checkstyle MagicNumber (1 line)
                Matchers.equalTo(185.65156465123)
        )
    }

    @Test(expected = RuntimeException::class)
    @Throws(IOException::class)
    fun failsIfTextDoesNotRepresentADouble() {
        NumberOf("abfdsc").toDouble()
    }
}
