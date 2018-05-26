package nnl.rocks.kactoos.text

import nnl.rocks.kactoos.KScalar
import nnl.rocks.kactoos.Scalar
import nnl.rocks.kactoos.Text

/**
 * Text envelope that provides equals and hashCode methods.
 *
 * @param origin String value of the envelope.
 * @since 0.5
 */
abstract class TextEnvelope(
    private val origin: KScalar<String>
) : Text {

    constructor(text: Text) : this({ text.asString() })

    constructor(scalar: Scalar<String>) : this({ scalar() })

    constructor(string: String) : this({ string })

    override fun asString(): String = origin()

    override fun toString(): String = origin()

    override fun hashCode(): Int = origin().hashCode()

    override fun equals(other: Any?): Boolean = origin() == other
}
