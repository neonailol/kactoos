package nnl.rocks.kactoos.io

import nnl.rocks.kactoos.text.TextOf
import org.hamcrest.MatcherAssert
import org.hamcrest.Matchers
import org.junit.Ignore
import org.junit.Test
import java.io.IOException
import java.util.Arrays

/**
 * Test case for [ResourceOf].
 *
 *
 *
 * @since 0.1
 *
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
                        "nnl/rocks/kactoos/io/ResourceOfTest.class"
                    )
                ).asBytes(),
                0,
                4
            ),
            Matchers.equalTo(
                byteArrayOf(
                    0xCA.toByte(), 0xFE.toByte(), 0xBA.toByte(), 0xBE.toByte()
                )
            )
        )
    }

    @Test
    @Throws(Exception::class)
    @Ignore
    fun readsTextResource() {
        MatcherAssert.assertThat(
            "Can't read a text resource from classpath",
            TextOf(
                ResourceOf(
                    "nnl/rocks/kactoos/large-text.txt"
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
}
