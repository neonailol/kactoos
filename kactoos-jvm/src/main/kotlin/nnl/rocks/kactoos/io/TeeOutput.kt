package nnl.rocks.kactoos.io

import nnl.rocks.kactoos.Output

import java.io.File
import java.io.IOException
import java.io.OutputStream
import java.io.Writer
import java.nio.charset.Charset
import java.nio.file.Path

/**
 * Output to Output copying pipe.
 *
 *
 * There is no thread-safety guarantee.
 *
 *
 *
 * @since 0.16
 */
class TeeOutput(
    private val target: Output,
    private val copy: Output
) : Output {

    /**
     * @param tgt The target
     * @param cpy The copy destination
     * @param charset The charset
     */
    constructor(
        tgt: Output,
        cpy: Writer,
        charset: Charset
    ) : this(tgt, OutputTo(cpy, charset))

    /**
     * @param tgt The target
     * @param cpy The copy destination
     */
    constructor(
        tgt: Output,
        cpy: Writer
    ) : this(tgt, OutputTo(cpy))

    /**
     * @param tgt The target
     * @param cpy The copy destination
     */
    constructor(
        tgt: Output,
        cpy: Path
    ) : this(tgt, OutputTo(cpy))

    /**
     * @param tgt The target
     * @param cpy The copy destination
     */
    constructor(
        tgt: Output,
        cpy: File
    ) : this(tgt, OutputTo(cpy))

    /**
     * @param tgt The target
     * @param cpy The copy destination
     */
    constructor(
        tgt: Output,
        cpy: OutputStream
    ) : this(tgt, OutputTo(cpy))

    @Throws(IOException::class)
    override fun stream(): OutputStream {
        return TeeOutputStream(
            this.target.stream(), this.copy.stream()
        )
    }
}
