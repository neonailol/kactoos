package nnl.rocks.kactoos.io

import nnl.rocks.kactoos.Input
import nnl.rocks.kactoos.text.TextOf
import nnl.rocks.kactoos.text.UncheckedText
import org.w3c.dom.ls.LSInput

import java.io.InputStream
import java.io.Reader

/**
 * Input as LSInput.
 *
 *
 * There is no thread-safety guarantee.
 *
 *
 *
 * @since 0.6
 *
 */
@Suppress("TooManyFunctions")
class LSInputOf(
    private val input: Input,
    private val pid: String,
    private val sid: String,
    private val base: String
) : LSInput {

    constructor(input: Input) : this(
        input = input,
        pid = "#public",
        sid = "#system",
        base = "#base"
    )

    override fun getCharacterStream(): Reader {
        return ReaderOf(this.byteStream)
    }

    override fun setCharacterStream(stream: Reader) {
        throw UnsupportedOperationException(
            "#setCharacterStream() is not supported"
        )
    }

    override fun getByteStream(): InputStream {
        return UncheckedInput(this.input).stream()
    }

    override fun setByteStream(stream: InputStream) {
        throw UnsupportedOperationException(
            "#setByteStream() is not supported"
        )
    }

    override fun getStringData(): String {
        return UncheckedText(
            TextOf(this.input)
        ).asString()
    }

    override fun setStringData(data: String) {
        throw UnsupportedOperationException(
            "#setStringData() is not supported"
        )
    }

    override fun getSystemId(): String {
        return this.sid
    }

    override fun setSystemId(sysid: String) {
        throw UnsupportedOperationException(
            "#setSystemId() is not supported"
        )
    }

    override fun getPublicId(): String {
        return this.pid
    }

    override fun setPublicId(pubid: String) {
        throw UnsupportedOperationException(
            "#setPublicId() is not supported"
        )
    }

    override fun getBaseURI(): String {
        return this.base
    }

    override fun setBaseURI(uri: String) {
        throw UnsupportedOperationException(
            "#setBaseURI() is not supported"
        )
    }

    override fun getEncoding(): String {
        return Charsets.UTF_8.displayName()
    }

    override fun setEncoding(encoding: String) {
        throw UnsupportedOperationException(
            "#setEncoding() is not supported"
        )
    }

    override fun getCertifiedText(): Boolean {
        return true
    }

    override fun setCertifiedText(text: Boolean) {
        throw UnsupportedOperationException(
            "#setCertifiedText() is not supported"
        )
    }
}
