package nnl.rocks.kactoos.io

import java.io.File
import java.io.IOException
import java.nio.file.Files
import java.nio.file.Path
import kotlin.streams.toList

/**
 * Files in a directory.
 *
 *
 * There is no thread-safety guarantee.
 *
 *
 *
 * @since 0.21
 */
class Directory(private val dir: Path) : Iterable<Path> {

    /**
     * @param path Path of the dir
     */
    constructor(path: File) : this(path.toPath())

    override fun iterator(): Iterator<Path> {
        try {
            Files.walk(this.dir).use { files -> return files.toList().iterator() }
        } catch (ex: IOException) {
            throw IllegalStateException(ex)
        }
    }
}
