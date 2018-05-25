package nnl.rocks.kactoos.io

import nnl.rocks.kactoos.Input
import java.io.ByteArrayInputStream
import java.io.ByteArrayOutputStream
import java.io.FileInputStream
import java.io.InputStream
import java.util.zip.ZipEntry
import java.util.zip.ZipOutputStream

/**
 * Zip files and directory.
 *
 * There is no thread-safety guarantee.
 *
 * @param origin Origin directory.
 * @since 0.5
 */
class Zip(
    private val origin: Directory
) : Input {

    override fun stream(): InputStream {
        val out = ByteArrayOutputStream()
        ZipOutputStream(out).use { zip ->
            for (path in origin) {
                val file = path.toFile()
                val entry = ZipEntry(
                    file.path
                )
                zip.putNextEntry(entry)
                if (file.isFile) {
                    FileInputStream(file).use { input -> zip.write(BytesOf(InputOf(input)).asBytes()) }
                }
                zip.closeEntry()
            }
        }
        return ByteArrayInputStream(out.toByteArray())
    }
}
