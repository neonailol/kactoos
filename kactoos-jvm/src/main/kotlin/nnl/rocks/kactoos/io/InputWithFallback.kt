package nnl.rocks.kactoos.io

import nnl.rocks.kactoos.Func
import nnl.rocks.kactoos.Input
import nnl.rocks.kactoos.func.FuncOf
import nnl.rocks.kactoos.func.IoCheckedFunc

import java.io.IOException
import java.io.InputStream

/**
 * Input that returns an alternative input if the main one throws
 * [IOException].
 *
 *
 * There is no thread-safety guarantee.
 *
 *
 *
 * @since 0.9
 */
class InputWithFallback(
    private val main: Input,
    private val alternative: IoCheckedFunc<IOException, Input>
) : Input {

    /**
     * @param input Main input
     * @param alt Alternative
     */
    constructor(
        input: Input,
        alt: Input
    ) : this(input, FuncOf { alt })

    constructor(
        input: Input
    ) : this(input, DeadInput())

    /**
     * @param input Main input
     * @param alt Alternative
     */
    constructor(
        input: Input,
        alt: Func<IOException, Input>
    ) : this(input, IoCheckedFunc<IOException, Input>(alt))

    @Throws(IOException::class)
    override fun stream(): InputStream = try {
        this.main.stream()
    } catch (ex: IOException) {
        this.alternative.apply(ex).stream()
    }
}
