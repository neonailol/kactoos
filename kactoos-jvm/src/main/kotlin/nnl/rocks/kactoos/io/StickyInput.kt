package nnl.rocks.kactoos.io

import nnl.rocks.kactoos.Input
import nnl.rocks.kactoos.KScalar
import nnl.rocks.kactoos.Scalar
import nnl.rocks.kactoos.scalar.IoCheckedScalar
import nnl.rocks.kactoos.scalar.StickyScalar
import java.io.ByteArrayInputStream
import java.io.ByteArrayOutputStream
import java.io.InputStream

/**
 * Input that reads only once.
 *
 * Pay attention that this class is not thread-safe. It is highly
 * recommended to always decorate it with [SyncInput].
 *
 * There is no thread-safety guarantee.
 *
 * @since 0.5
 */
class StickyInput private constructor(
    private val cache: KScalar<ByteArray>
) : Input {

    private constructor(cache: Scalar<ByteArray>) : this({ cache() })

    constructor(input: Input) : this(
        StickyScalar<ByteArray>(
            {
                val baos = ByteArrayOutputStream()
                LengthOf(
                    TeeInput(input, OutputTo(baos))
                ).invoke()
                baos.toByteArray()
            }
        )
    )

    override fun stream(): InputStream = ByteArrayInputStream(
        IoCheckedScalar(cache).invoke()
    )
}
