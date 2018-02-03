package nnl.rocks.kactoos.text

import nnl.rocks.kactoos.Text
import nnl.rocks.kactoos.bytes.Base64Bytes
import nnl.rocks.kactoos.io.BytesOf
import java.io.IOException

/**
 * Decodes the origin text using the Base64 encoding scheme.
 * @param origin Origin text
 *
 *
 * @since 0.20.2
 */
class Base64Text(private val origin: Text) : Text {

    /**
     * @param input The String
     */
    constructor(input: String) : this(TextOf(input))

    @Throws(IOException::class)
    override fun asString(): String = TextOf(Base64Bytes(BytesOf(this.origin))).asString()
}
