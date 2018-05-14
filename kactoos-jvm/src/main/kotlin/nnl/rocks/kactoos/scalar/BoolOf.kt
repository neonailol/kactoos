package nnl.rocks.kactoos.scalar

import nnl.rocks.kactoos.Scalar
import nnl.rocks.kactoos.Text
import nnl.rocks.kactoos.text.TextOf
import java.io.IOException

/**
 * Text as [Boolean].
 *
 *
 * There is no thread-safety guarantee.
 *
 *
 * This class implements [Scalar], which throws a checked
 * [Exception]. This may not be convenient in many cases. To make
 * it more convenient and get rid of the checked exception you can
 * use [UncheckedScalar] or [IoCheckedScalar] decorators.
 *
 * @param origin True or false text
 *
 *
 * @since 0.2
 */
class BoolOf(private val origin: Text) : Scalar<Boolean> {

    /**
     * @param txt True or false string
     */
    constructor(txt: String) : this(TextOf(txt))

    @Throws(IOException::class)
    override fun invoke(): Boolean = this.origin.asString().toBoolean()
}
