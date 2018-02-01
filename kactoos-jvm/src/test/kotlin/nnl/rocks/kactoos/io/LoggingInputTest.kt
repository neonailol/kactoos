
package nnl.rocks.kactoos.io

import org.hamcrest.MatcherAssert
import org.hamcrest.Matchers
import org.junit.Test

import java.io.IOException
import java.util.logging.Level

/**
 * Test case for [LoggingInput].
 *
 * @author Fabricio Cabral (fabriciofx@gmail.com)
 * @version $Id: dbce7d78aa3afc5db427db4a527e14e24ea3d036 $
 * @since 0.29
 * @checkstyle JavadocMethodCheck (500 lines)
 */
class LoggingInputTest {

    @Test
    @Throws(IOException::class)
    fun logReadFromDeadInput() {
        val logger = FakeLogger()
        LengthOf(
                LoggingInput(
                        DeadInput(),
                        "dead input",
                        logger
                )
        ).toInt()
        MatcherAssert.assertThat(
                "Can't log zero byte read from dead input",
                logger.toString(),
                Matchers.containsString("Read 0 byte(s) from dead input in")
        )
    }

    @Test
    @Throws(IOException::class)
    fun logReadFromOneByte() {
        val logger = FakeLogger()
        LengthOf(
                LoggingInput(
                        InputOf("a"),
                        "memory",
                        logger
                )
        ).toInt()
        MatcherAssert.assertThat(
                "Can't log one byte read from memory",
                logger.toString(),
                Matchers.containsString("Read 1 byte(s) from memory in")
        )
    }

    @Test
    @Throws(IOException::class)
    fun logReadFromText() {
        val logger = FakeLogger()
        LengthOf(
                LoggingInput(
                        InputOf("Hello, товарищ!"),
                        "memory",
                        logger
                )
        ).toInt()
        MatcherAssert.assertThat(
                "Can't log 22 bytes read from memory",
                logger.toString(),
                Matchers.containsString("Read 22 byte(s) from memory in")
        )
    }

    @Test
    @Throws(IOException::class)
    fun logReadFromLargeTextFile() {
        val logger = FakeLogger()
        LengthOf(
                LoggingInput(
                        ResourceOf("org/cactoos/large-text.txt"),
                        "text file",
                        logger
                )
        ).toInt()
        MatcherAssert.assertThat(
                "Can't log 74536 bytes read from text file",
                logger.toString(),
                Matchers.allOf(
                        Matchers.not(
                                Matchers.containsString("Read 16384 byte(s) from text file")
                        ),
                        Matchers.containsString("Read 74536 byte(s) from text file in"),
                        Matchers.containsString("Closed input stream from text file")
                )
        )
    }

    @Test
    @Throws(IOException::class)
    fun logAllFromLargeTextFile() {
        val logger = FakeLogger(Level.WARNING)
        LengthOf(
                LoggingInput(
                        ResourceOf("org/cactoos/large-text.txt"),
                        "text file",
                        logger
                )
        ).toInt()
        MatcherAssert.assertThat(
                "Can't log all read and close operations from text file",
                logger.toString(),
                Matchers.allOf(
                        Matchers.containsString("Read 16384 byte(s) from text file"),
                        Matchers.containsString("Read 32768 byte(s) from text file"),
                        Matchers.containsString("Read 49152 byte(s) from text file"),
                        Matchers.containsString("Read 65536 byte(s) from text file"),
                        Matchers.containsString("Read 74536 byte(s) from text file"),
                        Matchers.containsString("Closed input stream from text file")
                )
        )
    }

    @Test
    @Throws(IOException::class)
    fun logSkipFromLargeTextFile() {
        val logger = FakeLogger()
        LoggingInput(
                ResourceOf("org/cactoos/large-text.txt"),
                "text file",
                logger
                // @checkstyle MagicNumber (1 line)
        ).stream().skip(100)
        MatcherAssert.assertThat(
                "Can't log skip from text file",
                logger.toString(),
                Matchers.containsString("Skipped 100 byte(s) from text file.")
        )
    }

    @Test
    @Throws(IOException::class)
    fun logAvailableFromLargeTextFile() {
        val logger = FakeLogger()
        LoggingInput(
                ResourceOf("org/cactoos/large-text.txt"),
                "text file",
                logger
        ).stream().available()
        MatcherAssert.assertThat(
                "Can't log avaliable byte(s) from text file",
                logger.toString(),
                Matchers.containsString(
                        "There is(are) 74536 byte(s) available from text file"
                )
        )
    }

    @Test
    @Throws(IOException::class)
    fun logResetFromLargeTextFile() {
        val logger = FakeLogger()
        val input = LoggingInput(
                ResourceOf("org/cactoos/large-text.txt"),
                "text file",
                logger
        ).stream()
        // @checkstyle MagicNumber (1 line)
        input.mark(150)
        input.reset()
        MatcherAssert.assertThat(
                "Can't log mark and reset from text file",
                logger.toString(),
                Matchers.allOf(
                        Matchers.containsString("Marked position 150 from text file"),
                        Matchers.containsString("Reset input stream from text file")
                )
        )
    }

    @Test
    @Throws(IOException::class)
    fun logMarkSupportedFromLargeTextFile() {
        val logger = FakeLogger()
        LoggingInput(
                ResourceOf("org/cactoos/large-text.txt"),
                "text file",
                logger
        ).stream().markSupported()
        MatcherAssert.assertThat(
                "Can't log mark and reset are not supported from text file",
                logger.toString(),
                Matchers.containsString(
                        "Mark and reset are supported from text file"
                )
        )
    }
}
