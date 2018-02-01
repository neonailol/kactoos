
package nnl.rocks.kactoos.io

import nnl.rocks.kactoos.text.FormattedText
import nnl.rocks.kactoos.text.TextOf
import org.hamcrest.MatcherAssert
import org.hamcrest.Matchers
import org.junit.Test

import java.io.IOException
import java.util.Arrays

/**
 * Test case for [ResourceOf].
 *
 * @author Kirill (g4s8.public@gmail.com)
 * @version $Id: 15eefd07632c29b0097cc1a6721c6dd07aa61d67 $
 * @since 0.1
 * @checkstyle JavadocMethodCheck (500 lines)
 */
class ResourceOfTest {

    @Test
    @Throws(Exception::class)
    fun readsBinaryResource() {
        MatcherAssert.assertThat(
                "Can't read bytes from a classpath resource",
                Arrays.copyOfRange(
                        BytesOf(
                                ResourceOf(
                                        "org/cactoos/io/ResourceOfTest.class"
                                )
                        ).asBytes(),
                        // @checkstyle MagicNumber (2 lines)
                        0,
                        4
                ),
                Matchers.equalTo(
                        byteArrayOf(
                                // @checkstyle MagicNumber (1 line)
                                0xCA.toByte(), 0xFE.toByte(), 0xBA.toByte(), 0xBE.toByte()
                        )
                )
        )
    }

    @Test
    @Throws(Exception::class)
    fun readsTextResource() {
        MatcherAssert.assertThat(
                "Can't read a text resource from classpath",
                TextOf(
                        ResourceOf(
                                "org/cactoos/large-text.txt"
                        )
                ).asString(),
                Matchers.endsWith("est laborum.\n")
        )
    }

    @Test
    @Throws(Exception::class)
    fun readAbsentResourceTest() {
        MatcherAssert.assertThat(
                "Can't replace an absent resource with a text",
                TextOf(
                        BytesOf(
                                ResourceOf(
                                        "foo/this-resource-is-definitely-absent.txt",
                                        "the replacement"
                                )
                        )
                ).asString(),
                Matchers.endsWith("replacement")
        )
    }

    @Test(expected = IOException::class)
    @Throws(Exception::class)
    fun throwsWhenResourceIsAbsent() {
        TextOf(
                ResourceOf(
                        "bar/this-resource-is-definitely-absent.txt"
                )
        ).asString()
    }

    @Test
    @Throws(Exception::class)
    fun acceptsTextAsResourceName() {
        MatcherAssert.assertThat(
                TextOf(
                        ResourceOf(
                                TextOf("org/cactoos/small-text.txt")
                        )
                ).asString(),
                Matchers.endsWith("ex ea commodo")
        )
    }

    @Test
    @Throws(Exception::class)
    fun acceptsTextsAsResourceNameAndFallback() {
        MatcherAssert.assertThat(
                "Can't use Texts as parameters",
                TextOf(
                        ResourceOf(
                                FormattedText("%s/absent.txt", "baz"),
                                TextOf("another replacement")
                        )
                ).asString(),
                Matchers.startsWith("another")
        )
    }
}
