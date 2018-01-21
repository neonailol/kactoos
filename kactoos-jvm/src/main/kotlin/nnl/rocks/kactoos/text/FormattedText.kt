package nnl.rocks.kactoos.text

import nnl.rocks.kactoos.Text
import nnl.rocks.kactoos.list.ListOf
import java.io.IOException
import java.util.Collections
import java.util.Formatter
import java.util.Locale

/**
 * Text in Sprinf format.
 *
 * New formatted string with specified locale.
 *
 * @param pattern Pattern
 * @param locale Format locale
 * @param arguments Arguments
 *
 * There is no thread-safety guarantee.
 *
 *
 *
 * @since 0.1
 */
class FormattedText(
    private val pattern: Text,
    private val locale: Locale,
    arguments: Collection<Any>
) : Text {

    /**
     * Arguments.
     */
    private val args: Collection<Any> = Collections.unmodifiableCollection(arguments)

    /**
     * New formatted string with default locale.
     *
     * @param ptn Pattern
     * @param arguments Arguments
     */
    constructor(
        ptn: String,
        vararg arguments: Any
    ) : this(ptn, ListOf<Any>(arguments.iterator()))

    /**
     * New formatted string with default locale.
     *
     * @param ptn Pattern
     * @param arguments Arguments
     */
    constructor(
        ptn: Text,
        vararg arguments: Any
    ) : this(ptn, ListOf<Any>(arguments.iterator()))

    /**
     * New formatted string with specified locale.
     *
     * @param ptn Pattern
     * @param locale Format locale
     * @param arguments Arguments
     */
    constructor(
        ptn: String,
        locale: Locale,
        vararg arguments: Any
    ) : this(ptn, locale, ListOf<Any>(arguments.iterator()))

    /**
     * New formatted string with specified locale.
     *
     * @param ptn Pattern
     * @param locale Format locale
     * @param arguments Arguments
     */
    constructor(
        ptn: Text,
        locale: Locale,
        vararg arguments: Any
    ) : this(ptn, locale, ListOf<Any>(arguments.iterator()))

    /**
     * New formatted string with default locale.
     *
     * @param ptn Pattern
     * @param arguments Arguments
     */
    constructor(
        ptn: String,
        arguments: Collection<Any>
    ) : this(ptn, Locale.getDefault(Locale.Category.FORMAT), arguments)

    /**
     * New formatted string with default locale.
     *
     * @param ptn Pattern
     * @param arguments Arguments
     */
    constructor(
        ptn: Text,
        arguments: Collection<Any>
    ) : this(ptn, Locale.getDefault(Locale.Category.FORMAT), arguments)

    /**
     * New formatted string with specified locale.
     *
     * @param ptn Pattern
     * @param locale Format locale
     * @param arguments Arguments
     */
    constructor(
        ptn: String,
        locale: Locale,
        arguments: Collection<Any>
    ) : this(TextOf(ptn), locale, arguments)

    @Throws(IOException::class)
    @Suppress("SpreadOperator")
    override fun asString(): String {
        val out = StringBuilder(0)
        Formatter(out, this.locale).use { fmt ->
            fmt.format(
                this.pattern.asString(),
                *this.args.toTypedArray()
            )
        }
        return out.toString()
    }

    override fun compareTo(other: Text): Int = UncheckedText(this).compareTo(other)
}
