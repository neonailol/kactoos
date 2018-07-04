package nnl.rocks.kactoos

import nnl.rocks.kactoos.io.OutputTo
import nnl.rocks.kactoos.io.TeeInput

import java.io.IOException
import java.io.OutputStream

/**
 * Output.
 *
 * Here is for example how [Output] can be used
 * together with [Input] in order to modify the content
 * of a text file:
 *
 * ```
 * new LengthOf(
 *   new TeeInput(
 *     new InputOf(new TextOf("Hello, world!")),
 *     new OutputTo(new File("/tmp/names.txt"))
 *   )
 * ).asValue();
 * ```
 *
 * Here [OutputTo] implements [Output] and behaves like
 * one, providing write-only access to the encapsulated
 * [java.io.File]. The [TeeInput] copies the content of the
 * input to the output. The [nnl.rocks.kactoos.io.LengthOf]
 * calculates the size of the copied data.
 *
 * There is no thread-safety guarantee.
 *
 * @see OutputTo
 * @since 0.1
 */
@FunctionalInterface
interface Output {

    /**
     * Get write access to it.
     * @return InputStream to read from
     * @throws IOException If something goes wrong
     */
    fun stream(): OutputStream
}

internal typealias KOutput = () -> OutputStream
