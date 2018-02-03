package nnl.rocks.kactoos.text

import nnl.rocks.kactoos.Func
import nnl.rocks.kactoos.Text
import nnl.rocks.kactoos.func.FuncOf
import nnl.rocks.kactoos.func.UncheckedFunc

import java.io.IOException
import java.io.UncheckedIOException

/**
 * Text that doesn't throw checked [Exception].
 *
 * There is no thread-safety guarantee.
 *
 * @param text Encapsulated text
 * @param fallback Fallback func if [IOException] happens
 * @since 0.3
 */
class UncheckedText(
    private val text: Text,
    private val fallback: Func<IOException, String>
) : Text {

    constructor(text: Text) : this(text, FuncOf { error -> throw UncheckedIOException(error) })

    /**
     * Ctor.
     * @param txt Encapsulated text
     * @since 0.9
     */
    constructor(txt: String) : this(TextOf(txt))

    override fun asString(): String = try {
        text.asString()
    } catch (ex: IOException) {
        UncheckedFunc(fallback).apply(ex)
    }
}
