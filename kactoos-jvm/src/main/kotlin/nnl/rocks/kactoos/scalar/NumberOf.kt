package nnl.rocks.kactoos.scalar

import nnl.rocks.kactoos.Scalar
import nnl.rocks.kactoos.Text
import nnl.rocks.kactoos.text.TextOf
import java.lang.Double.parseDouble

/**
 * Text as [Float].
 *
 *
 * There is no thread-safety guarantee.
 *
 *
 *
 *
 *
 * @since 0.2
 */
class NumberOf(dnum: Scalar<Double>) : NumberEnvelope(dnum), Scalar<Double> {

    /**
     * @param txt Number-string
     */
    constructor(txt: String) : this(TextOf(txt))

    /**
     * @param txt Number-string
     */
    constructor(txt: Text) : this(StickyScalar(Constant { parseDouble(txt.asString()) }))
}
