package nnl.rocks.kactoos.io

import org.hamcrest.MatcherAssert
import org.hamcrest.Matchers
import org.junit.Test
import java.io.IOException
import java.nio.file.Files

/**
 * Test case for [Directory].
 *
 *
 * @since 0.12
 *
 *
 */
class DirectoryTest {

    @Test
    @Throws(IOException::class)
    fun listsFilesInDirectory() {
        val dir = Files.createTempDirectory("x1")
        dir.resolve("x/y").toFile().mkdirs()
        Files.write(dir.resolve("x/y/test"), "".toByteArray())
        MatcherAssert.assertThat(
            "Can't list files in a directory",
            Directory(dir),
            Matchers.iterableWithSize(4)
        )
    }
}
