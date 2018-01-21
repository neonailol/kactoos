package nnl.rocks.kactoos.io

import nnl.rocks.kactoos.Input
import java.io.ByteArrayInputStream
import java.io.IOException
import java.io.InputStream

/**
 * Input that returns content in small portions.
 *
 *
 *
 * @since 0.12
 */
class SlowInput
/**
 * Ctor.
 * @param origin Original input to encapsulate and make slower
 */
(
    /**
     * Original input.
     */
    private val origin: Input
) : Input {

    /**
     * Ctor.
     * @param size The size of the array to encapsulate
     */
    constructor(size: Long) : this(size.toInt())

    /**
     * Ctor.
     * @param size The size of the array to encapsulate
     */
    constructor(size: Int) : this(InputOf(ByteArrayInputStream(ByteArray(size))))

    @Throws(IOException::class)
    override fun stream(): InputStream {
        return SlowInputStream(this.origin.stream())
    }
}
