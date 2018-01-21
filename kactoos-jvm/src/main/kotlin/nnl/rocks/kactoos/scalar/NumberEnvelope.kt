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
    override fun value(): Double = this.dnum.value()

    override fun toDouble(): Double = UncheckedScalar(this.dnum).value()

    override fun toByte(): Byte = UncheckedScalar(ScalarOf(this.dnum.value().toByte())).value()

    override fun toChar(): Char = UncheckedScalar(ScalarOf(this.dnum.value().toChar())).value()

    override fun toFloat(): Float = UncheckedScalar(ScalarOf(this.dnum.value().toFloat())).value()

    override fun toInt(): Int = UncheckedScalar(ScalarOf(this.dnum.value().toInt())).value()

    override fun toLong(): Long = UncheckedScalar(ScalarOf(this.dnum.value().toLong())).value()

    override fun toShort(): Short = UncheckedScalar(ScalarOf(this.dnum.value().toShort())).value()
}
