package nnl.rocks.kactoos.scalar

import org.hamcrest.MatcherAssert
import org.hamcrest.Matchers
import org.junit.Test
import java.io.IOException

/**
 * Test case for [NumberOf].
 *
 *
 *
 * @since 0.2
 *
 */
class NumberOfTest {

    @Test
    @Throws(IOException::class)
    fun parsesFloat() {
        MatcherAssert.assertThat(
            "Can't parse float number",
            NumberOf("1656.894").toFloat(),
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
            Matchers.equalTo(185.65156465123)
        )
    }

    @Test(expected = RuntimeException::class)
    @Throws(IOException::class)
    fun failsIfTextDoesNotRepresentADouble() {
        NumberOf("abfdsc").toDouble()
    }
}
