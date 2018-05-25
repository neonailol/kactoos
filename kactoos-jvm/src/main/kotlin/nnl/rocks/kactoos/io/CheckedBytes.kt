package nnl.rocks.kactoos.io

import nnl.rocks.kactoos.Bytes
import nnl.rocks.kactoos.KFunc
import nnl.rocks.kactoos.scalar.CheckedScalar

/**
 * Bytes that throws exception of specified type.
 *
 * @param E Exception's type.
 * @param origin Origin bytes.
 * @param func Function that wraps exceptions.
 * @since 0.5
 */
class CheckedBytes<E : Exception>(
    private val origin: Bytes,
    private val func: KFunc<Exception, E>
) : Bytes {

    override fun asBytes(): ByteArray {
        return CheckedScalar(
            { origin.asBytes() },
            func
        ).invoke()
    }
}
