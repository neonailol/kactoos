package nnl.rocks.kactoos.io

import nnl.rocks.kactoos.Bytes
import nnl.rocks.kactoos.Func
import nnl.rocks.kactoos.func.FuncOf
import nnl.rocks.kactoos.func.UncheckedFunc

import java.io.IOException
import java.io.UncheckedIOException

/**
 * Bytes that doesn't throw checked [Exception].
 *
 * There is no thread-safety guarantee.
 *
 * @since 0.3
 */
class UncheckedBytes(
    private val bytes: Bytes,
    private val fallback: Func<IOException, ByteArray>
) : Bytes {

    constructor(bytes: Bytes) : this(bytes, FuncOf { error -> throw UncheckedIOException(error) })

    override fun asBytes(): ByteArray {
        val data: ByteArray
        data = try {
            this.bytes.asBytes()
        } catch (ex: IOException) {
            UncheckedFunc(this.fallback).apply(ex)
        }

        return data
    }
}
