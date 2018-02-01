package nnl.rocks.kactoos.io

import nnl.rocks.kactoos.matchers.MatcherOf
import org.hamcrest.MatcherAssert
import org.hamcrest.Matchers
import org.junit.Test

import java.nio.file.Files
import java.nio.file.Paths

/**
 * Unit tests for [TempFile].
 *
 * @author George Aristy (george.aristy@gmail.com)
 * @version $Id: 26dc277388af0fdfd197fb1760e4166933e56ffa $
 * @since 1.0
 * @checkstyle JavadocMethodCheck (500 lines)
 */
class TempFileTest {

    @Test
    @Throws(Exception::class)
    fun createFile() {
        TempFile().use { file ->
            MatcherAssert.assertThat(
                "Cannot create a temp file",
                Files.exists(file.value()),
                Matchers.`is`(true)
            )
        }
    }

    @Test
    @Throws(Exception::class)
    fun createFileInCustomPath() {
        val custom = Paths.get(System.getProperty("user.home"))
        TempFile({ custom }, "", "").use({ file ->
                                             MatcherAssert.assertThat(
                                                 "Cannot create a temp file at a custom path",
                                                 file,
                                                 Matchers.allOf(
                                                     MatcherOf { tmp -> Files.exists(tmp.value()) },
                                                     MatcherOf { tmp -> tmp.value().getParent().equals(custom) }
                                                 )
                                             )
                                         })
    }

    @Test
    @Throws(Exception::class)
    fun deleteFile() {
        val file = TempFile()
        file.close()
        MatcherAssert.assertThat(
            "Cannot delete file on close",
            Files.exists(file.value()),
            Matchers.`is`(false)
        )
    }

    @Test
    @Throws(Exception::class)
    fun createFileWithPrefix() {
        val prefix = String.format("randomPrefix%s", System.currentTimeMillis())
        TempFile(prefix, "").use { file ->
            MatcherAssert.assertThat(
                "File not created with the given prefix",
                file.value().fileName.toString(),
                Matchers.startsWith(prefix)
            )
        }
    }

    @Test
    @Throws(Exception::class)
    fun createFileWithSuffix() {
        val suffix = String.format(
            "randomSuffix%s", System.currentTimeMillis()
        )
        TempFile("", suffix).use { file ->
            MatcherAssert.assertThat(
                "File not created with the given suffix",
                file.value().fileName.toString(),
                Matchers.endsWith(suffix)
            )
        }
    }
}
