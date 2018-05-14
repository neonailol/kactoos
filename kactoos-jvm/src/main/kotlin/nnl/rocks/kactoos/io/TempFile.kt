package nnl.rocks.kactoos.io

import nnl.rocks.kactoos.Scalar
import nnl.rocks.kactoos.Text
import nnl.rocks.kactoos.scalar.Constant
import nnl.rocks.kactoos.scalar.IoCheckedScalar
import nnl.rocks.kactoos.scalar.StickyScalar
import nnl.rocks.kactoos.text.TextOf
import java.io.Closeable
import java.nio.file.Files
import java.nio.file.Path
import java.nio.file.Paths

/**
 * A temporary file.
 *
 *
 * These are ephemeral files to be used in small scopes.
 * Typical use looks like this:
 * ```
 * try (final TempFile file = new TempFile()) {
 *     //write to the file
 * }
 * ```
 *
 * The physical file is deleted from the filesystem when the temp file is
 * closed.
 *
 * @param file Creates the file and returns the path to it
 * @since 0.3
 */
class TempFile private constructor(
    private val file: Scalar<Path>
) : Scalar<Path>, Closeable {

    /**
     * The temporary file will be created inside the filesystem's
     * temporary folder (system property: `java.io.tmpdir`).
     * @param prefix The temp filename's prefix
     * @param suffix The temp filename's suffix
     */
    constructor(
        prefix: String = "",
        suffix: String = ""
    ) : this(
        Constant { Paths.get(System.getProperty("java.io.tmpdir")) },
        prefix,
        suffix
    )

    /**
     * @param dir The directory in which to create the temp file
     * @param prefix The temp filename's prefix
     * @param suffix The temp filename's suffix
     */
    constructor(
        dir: Scalar<Path>,
        prefix: String,
        suffix: String
    ) : this(
        dir,
        TextOf(prefix),
        TextOf(suffix)
    )

    /**
     * @param dir The directory in which to create the temp file
     * @param prefix The temp filename's prefix
     * @param suffix The temp filename's suffix
     */
    constructor(
        dir: Scalar<Path>,
        prefix: Text,
        suffix: Text
    ) : this(
        StickyScalar<Path>(
            Constant {
                Files.createTempFile(
                    dir(),
                    prefix.asString(),
                    suffix.asString()
                )
            }
        )
    )

    @Throws(Exception::class)
    override fun invoke(): Path {
        return this.file()
    }

    /**
     * Deletes the file from the filesystem.
     */
    override fun close() {
        Files.delete(IoCheckedScalar(this.file).invoke())
    }
}
