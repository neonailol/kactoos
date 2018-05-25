package nnl.rocks.kactoos.scalar

import nnl.rocks.kactoos.KScalar
import nnl.rocks.kactoos.Scalar
import nnl.rocks.kactoos.Text
import nnl.rocks.kactoos.text.TextOf

/**
 * Text as [Double].
 *
 * There is no thread-safety guarantee.
 *
 * @since 0.2
 */
class NumberOf(dnum: KScalar<Double>) : NumberEnvelope(dnum), Scalar<Double> {

    constructor(number: Scalar<Double>) : this({ number() })

    /**
     * @param txt Number-string
     */
    constructor(txt: String) : this(TextOf(txt))

    /**
     * @param txt Number-string
     */
    constructor(txt: Text) : this(StickyScalar({ txt.asString().toDouble() }))
}
