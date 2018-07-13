package nnl.rocks.kactoos.text

import nnl.rocks.kactoos.Text
import nnl.rocks.kactoos.bytes.Base64Bytes
import nnl.rocks.kactoos.io.BytesOf

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
    constructor(input: String) : this(JDKTextOf(input))

    override fun asString(): String = JDKTextOf(Base64Bytes(BytesOf(this.origin))).asString()
}
