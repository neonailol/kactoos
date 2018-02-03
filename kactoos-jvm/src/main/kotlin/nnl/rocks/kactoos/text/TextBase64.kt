package nnl.rocks.kactoos.text

import nnl.rocks.kactoos.Text
import nnl.rocks.kactoos.bytes.BytesBase64
import nnl.rocks.kactoos.io.BytesOf
import java.io.IOException

/**
 * Encodes the origin text using the Base64 encoding scheme.
 *
 * @param origin Origin text
 *
 *
 *
 * @since 0.20.2
 */
class TextBase64(private val origin: Text) : Text {

    /**
     * @param input The String
     */
    constructor(input: String) : this(TextOf(input))

    @Throws(IOException::class)
    override fun asString(): String = TextOf(BytesBase64(BytesOf(this.origin))).asString()

}
