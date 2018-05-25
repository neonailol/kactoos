package nnl.rocks.kactoos.io

import nnl.rocks.kactoos.KFunc
import nnl.rocks.kactoos.Output
import nnl.rocks.kactoos.scalar.CheckedScalar
import java.io.OutputStream

/**
 * Output that throws exception of specified type.
 *
 * @param E Exception's type.
 * @param origin Origin output.
 * @param func Function that wraps exceptions.
 * @since 0.5
 */
class CheckedOutput<E : Exception>(
    private val origin: Output,
    private val func: KFunc<Exception, E>
) : Output {

    override fun stream(): OutputStream {
        return CheckedScalar(
            { origin.stream() },
            func
        ).invoke()
    }
}
