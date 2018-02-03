package nnl.rocks.kactoos.io

import nnl.rocks.kactoos.Input
import nnl.rocks.kactoos.Scalar
import nnl.rocks.kactoos.scalar.IoCheckedScalar
import nnl.rocks.kactoos.scalar.ScalarOf
import nnl.rocks.kactoos.scalar.StickyScalar

import java.io.ByteArrayInputStream
import java.io.ByteArrayOutputStream
import java.io.IOException
import java.io.InputStream

/**
 * Input that reads only once.
 *
 *
 * Pay attention that this class is not thread-safe. It is highly
 * recommended to always decorate it with [SyncInput].
 *
 *
 * There is no thread-safety guarantee.
 *
 *
 *
 * @since 0.6
 */
class StickyInput(
    private val cache: Scalar<ByteArray>
) : Input {

    constructor(input: Input) : this(
        StickyScalar<ByteArray>(
            ScalarOf {
                val baos = ByteArrayOutputStream()
                LengthOf(
                    TeeInput(input, OutputTo(baos))
                ).value()
                baos.toByteArray()
            }
        )
    )

    @Throws(IOException::class)
    override fun stream(): InputStream = ByteArrayInputStream(
        IoCheckedScalar(this.cache).value()
    )
}
