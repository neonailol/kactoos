package nnl.rocks.kactoos

import java.io.IOException
import java.io.InputStream

/**
 * Input.
 *
 * Here is for example how [Input] can be used
 * in order to read the content of a text file:
 *
 * ```
 * String content = new TextOf(
 *   new InputOf(new File("/tmp/names.txt"))
 * ).asString();
 * ```
 *
 * Here [nnl.rocks.kactoos.io.InputOf] implements
 * [Input] and behaves like
 * one, providing read-only access to
 * the encapsulated [java.io.File].
 *
 * There is no thread-safety guarantee.
 *
 * @see nnl.rocks.kactoos.io.InputOf
 * @since 0.1
 */
@FunctionalInterface
interface Input {

    /**
     * Get read access to it.
     * @return InputStream to read from
     * @throws IOException If something goes wrong
     */
    fun stream(): InputStream

    class NoNulls(private val origin: Input) : Input {

        @Suppress("USELESS_ELVIS")
        override fun stream(): InputStream = origin.stream() ?: throw IOException("NULL instead of a valid result")
    }
}

internal typealias KInput = () -> InputStream
