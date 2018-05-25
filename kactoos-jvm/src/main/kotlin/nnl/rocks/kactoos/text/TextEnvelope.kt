package nnl.rocks.kactoos.text

import nnl.rocks.kactoos.Scalar
import nnl.rocks.kactoos.Text
import nnl.rocks.kactoos.scalar.IoCheckedScalar
import nnl.rocks.kactoos.scalar.UncheckedScalar

/**
 * Text envelope that provides equals and hashCode methods.
 *
 * @param origin String value of the envelope.
 * @since 0.5
 */
abstract class TextEnvelope(
    private val origin: IoCheckedScalar<String>
) : Text {

    /**
     * @param text Text representing the text value.
     */
    constructor(text: Text) : this(IoCheckedScalar { text.asString() })

    /**
     * @param scalar Scalar representing the text value.
     */
    constructor(scalar: Scalar<String>) : this(IoCheckedScalar(scalar))

    override fun asString(): String = origin()

    override fun toString(): String = UncheckedText(this).asString()

    override fun hashCode(): Int = UncheckedScalar(origin).invoke().hashCode()

    override fun equals(other: Any?): Boolean = UncheckedScalar(origin).invoke() == other
}
