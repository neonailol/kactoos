package nnl.rocks.kactoos.scalar

import nnl.rocks.kactoos.KScalar

/**
 * Envelope for the [Number].
 *
 * There is no thread-safety guarantee.
 *
 * @param value Double scalar
 * @since 0.4
 */
open class NumberEnvelope(private val value: KScalar<Double>) : Number(), KScalar<Double> {

    override fun invoke(): Double = this.value()

    override fun toDouble(): Double = this.value()

    override fun toByte(): Byte = this.value().toByte()

    override fun toChar(): Char = this.value().toChar()

    override fun toFloat(): Float = this.value().toFloat()

    override fun toInt(): Int = this.value().toInt()

    override fun toLong(): Long = this.value().toLong()

    override fun toShort(): Short = this.value().toShort()
}
