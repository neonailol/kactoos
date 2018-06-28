package nnl.rocks.kactoos.io

import nnl.rocks.kactoos.Input
import nnl.rocks.kactoos.KFunc
import nnl.rocks.kactoos.scalar.CheckedScalar
import java.io.InputStream

/**
 * Input that throws exception of specified type.
 *
 * @param E Exception's type.
 * @param origin Origin input.
 * @param func Function that wraps exceptions.
 * @since 0.4
 */
class CheckedInput<E : Exception>(
    private val origin: Input,
    private val func: KFunc<Exception, E>
) : Input {

    override fun stream(): InputStream {
        return CheckedScalar(
            { origin.stream() },
            func
        ).invoke()
    }
}
