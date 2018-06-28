package nnl.rocks.kactoos.text

import nnl.rocks.kactoos.Text
import nnl.rocks.kactoos.bytes.BytesBase64
import nnl.rocks.kactoos.io.BytesOf

/**
 * Encodes the origin text using the Base64 encoding scheme.
 *
 * @since 0.4
 */
class TextBase64 private constructor(origin: Text) : TextEnvelope(origin) {

    /**
     * @param input The String
     */
    constructor(input: String) : this(TextOf(BytesBase64(BytesOf(input))))

}
