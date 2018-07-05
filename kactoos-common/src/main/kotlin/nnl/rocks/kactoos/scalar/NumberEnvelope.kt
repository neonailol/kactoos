package nnl.rocks.kactoos.scalar

import nnl.rocks.kactoos.KScalar
import nnl.rocks.kactoos.Scalar

/**
 * Envelope for the [Number].
 *
 * There is no thread-safety guarantee.
 *
 * @param value Double scalar
 * @since 0.4
 */
abstract class NumberEnvelope(private val value: KScalar<Double>) : Scalar<Double> {
// TODO: This class should extend number but blocked by KT-17345

    constructor(value: Scalar<Double>) : this({ value() })

    override fun invoke(): Double = value()

    fun toDouble(): Double = value()

    fun toByte(): Byte = value().toByte()

    fun toChar(): Char = value().toChar()

    fun toFloat(): Float = value().toFloat()

    fun toInt(): Int = value().toInt()

    fun toLong(): Long = value().toLong()

    fun toShort(): Short = value().toShort()
}
