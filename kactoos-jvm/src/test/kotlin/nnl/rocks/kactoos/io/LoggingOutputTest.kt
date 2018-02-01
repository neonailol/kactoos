
package nnl.rocks.kactoos.io

import org.hamcrest.MatcherAssert
import org.hamcrest.Matchers
import org.junit.Test

import java.io.ByteArrayOutputStream
import java.io.IOException
import java.nio.file.Files
import java.util.logging.Level

/**
 * Test case for [LoggingOutput].
 *
 * @author Fabricio Cabral (fabriciofx@gmail.com)
 * @version $Id: 968638b4a4fd6a15adb4659eb49c155483534b7a $
 * @since 0.29
 * @checkstyle JavadocMethodCheck (500 lines)
 * @checkstyle ClassDataAbstractionCouplingCheck (500 lines)
 */
class LoggingOutputTest {

    @Test
    @Throws(IOException::class)
    fun logWriteZero() {
        val logger = FakeLogger()
        LengthOf(
                TeeInput(
                        InputOf(""),
                        LoggingOutput(
                                { ByteArrayOutputStream() },
                                "memory",
                                logger
                        )
                )
        ).toInt()
        MatcherAssert.assertThat(
                "Can't log zero byte written to memory",
                logger.toString(),
                Matchers.containsString("Written 0 byte(s) to memory in ")
        )
    }

    @Test
    @Throws(IOException::class)
    fun logWriteOneByte() {
        val logger = FakeLogger()
        LoggingOutput(
                { ByteArrayOutputStream() },
                "memory",
                logger
        ).stream().use { out -> out.write(BytesOf("a").asBytes()) }
        MatcherAssert.assertThat(
                "Can't log one byte written to memory",
                logger.toString(),
                Matchers.containsString("Written 1 byte(s) to memory in")
        )
    }

    @Test
    @Throws(IOException::class)
    fun logWriteText() {
        val logger = FakeLogger()
        LoggingOutput(
                { ByteArrayOutputStream() },
                "memory",
                logger
        ).stream().use { out -> out.write(BytesOf("Hello, товарищ!").asBytes()) }
        MatcherAssert.assertThat(
                "Can't log 22 bytes written to memory",
                logger.toString(),
                Matchers.containsString("Written 22 byte(s) to memory in")
        )
    }

    @Test
    @Throws(Exception::class)
    fun logWriteToLargeTextFile() {
        val logger = FakeLogger()
        val temp = Files.createTempDirectory("ccts-1")
        val path = temp.resolve("x/y/z/file.txt")
        LengthOf(
                TeeInput(
                        ResourceOf("org/kactoos/large-text.txt"),
                        LoggingOutput(
                                OutputTo(path),
                                "text file",
                                logger
                        )
                )
        ).toInt()
        MatcherAssert.assertThat(
                "Can't log write and close operations to text file",
                logger.toString(),
                Matchers.allOf(
                        Matchers.not(
                                Matchers.containsString(
                                        "Written 16384 byte(s) to text file"
                                )
                        ),
                        Matchers.containsString("Written 74536 byte(s) to text file"),
                        Matchers.containsString("Closed output stream from text file")
                )
        )
    }

    @Test
    @Throws(Exception::class)
    fun logAllWriteToLargeTextFile() {
        val logger = FakeLogger(Level.WARNING)
        val temp = Files.createTempDirectory("ccts-2")
        val path = temp.resolve("a/b/c/file.txt")
        LengthOf(
                TeeInput(
                        ResourceOf("org/kactoos/large-text.txt"),
                        LoggingOutput(
                                OutputTo(path),
                                "text file",
                                logger
                        )
                )
        ).toInt()
        MatcherAssert.assertThat(
                "Can't log all write and close operations to text file",
                logger.toString(),
                Matchers.allOf(
                        Matchers.containsString("Written 16384 byte(s) to text file"),
                        Matchers.containsString("Written 32768 byte(s) to text file"),
                        Matchers.containsString("Written 49152 byte(s) to text file"),
                        Matchers.containsString("Written 65536 byte(s) to text file"),
                        Matchers.containsString("Written 74536 byte(s) to text file"),
                        Matchers.containsString("Closed output stream from text file")
                )
        )
    }
}
