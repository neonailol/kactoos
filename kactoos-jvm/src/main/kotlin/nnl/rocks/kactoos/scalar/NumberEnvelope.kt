package nnl.rocks.kactoos.scalar

import nnl.rocks.kactoos.Scalar

/**
 * Envelope for the [Number].
 *
 * There is no thread-safety guarantee.
 *
 * @param dnum Double scalar
 *
 *
 *
 * @since 0.26
 */
open class NumberEnvelope(private val dnum: Scalar<Double>) : Number(), Scalar<Double> {

    @Throws(Exception::class)
    override fun value(): Double = this.dnum()

    override fun toDouble(): Double = UncheckedScalar(this.dnum).invoke()

    override fun toByte(): Byte = UncheckedScalar(Constant(this.dnum().toByte())).invoke()

    override fun toChar(): Char = UncheckedScalar(Constant(this.dnum().toChar())).invoke()

    override fun toFloat(): Float = UncheckedScalar(Constant(this.dnum().toFloat())).invoke()

    override fun toInt(): Int = UncheckedScalar(Constant(this.dnum().toInt())).invoke()

    override fun toLong(): Long = UncheckedScalar(Constant(this.dnum().toLong())).invoke()

    override fun toShort(): Short = UncheckedScalar(Constant(this.dnum().toShort())).invoke()
}
