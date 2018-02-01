
package nnl.rocks.kactoos.io

import org.hamcrest.MatcherAssert
import org.hamcrest.Matchers
import org.junit.Test

import java.io.IOException
import java.nio.file.Files

/**
 * Test case for [Directory].
 * @author Yegor Bugayenko (yegor256@gmail.com)
 * @version $Id: 701bedd72096e08e3fb65d531dcba71ca84745d8 $
 * @since 0.12
 * @checkstyle JavadocMethodCheck (500 lines)
 * @checkstyle ClassDataAbstractionCouplingCheck (500 lines)
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
                // @checkstyle MagicNumber (1 line)
                Matchers.iterableWithSize(4)
        )
    }
}
