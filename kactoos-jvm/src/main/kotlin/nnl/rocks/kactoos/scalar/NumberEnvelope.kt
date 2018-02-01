package nnl.rocks.kactoos.scalar

import nnl.rocks.kactoos.KScalar
import nnl.rocks.kactoos.Scalar

/**
 * Envelope for the [Number].
 *
 * There is no thread-safety guarantee.
 *
 * @param dnum Double scalar
 * @since 0.3
 */
open class NumberEnvelope(private val dnum: KScalar<Double>) : Number(), Scalar<Double> {

    @Throws(Exception::class)
    override fun value(): Double = this.dnum.invoke()

    override fun toDouble(): Double = UncheckedScalar(this.dnum).value()

    override fun toByte(): Byte = UncheckedScalar({ this.dnum.invoke().toByte() }).value()

    override fun toChar(): Char = UncheckedScalar({ this.dnum.invoke().toChar() }).value()

    override fun toFloat(): Float = UncheckedScalar({ this.dnum.invoke().toFloat() }).value()

    override fun toInt(): Int = UncheckedScalar({ this.dnum.invoke().toInt() }).value()

    override fun toLong(): Long = UncheckedScalar({ this.dnum.invoke().toLong() }).value()

    override fun toShort(): Short = UncheckedScalar({ this.dnum.invoke().toShort() }).value()
}
