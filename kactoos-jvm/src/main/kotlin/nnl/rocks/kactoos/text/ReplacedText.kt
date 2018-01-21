package nnl.rocks.kactoos.text

import nnl.rocks.kactoos.Func
import nnl.rocks.kactoos.Scalar
import nnl.rocks.kactoos.Text
import nnl.rocks.kactoos.func.FuncOf
import nnl.rocks.kactoos.func.IoCheckedFunc
import nnl.rocks.kactoos.scalar.IoCheckedScalar
import nnl.rocks.kactoos.scalar.ScalarOf
import java.io.IOException
import java.util.regex.Matcher
import java.util.regex.Pattern
import java.util.regex.PatternSyntaxException

/**
 * Replace the Text.
 *
 * The given [regex][Pattern] is used to produce a
 * [matcher][Pattern.matcher] that will be
 * transformed by `func` into a replacement string to replace each
 * [matching][Matcher.find] substring.
 *
 * Example usage:
 * ```
 * final String result = new ReplacedText(
 * new TextOf("one two THREE four FIVE six"),
 * () -> Pattern.compile("[a-z]+"),
 * matcher -> String.valueOf(matcher.group().length())
 * ).asString();  //will return the string "3 3 THREE 4 FIVE 3"
 * ```
 *
 * Note: a [PatternSyntaxException] will be thrown if the
 * regular expression's syntax is invalid.
 *
 * @param origin The text
 * @param regex The regular expression
 * @param replacement Transforms the resulting matcher object into a replacement
 * string. Any exceptions will be wrapped in an [IOException].
 * @since 0.2
 */
class ReplacedText(
    private val origin: Text,
    private val regex: Scalar<Pattern>,
    private val replacement: Func<Matcher, String>
) : Text {

    /**
     * Will replace all instances of the substring matched by `find`
     * with `replace`.
     * @param text The text
     * @param find The regular expression
     * @param replace The replacement string
     */
    constructor(
        text: Text,
        find: String,
        replace: String
    ) : this(text, ScalarOf { Pattern.compile(find) }, FuncOf { matcher -> replace })

    @Throws(IOException::class)
    override fun asString(): String {
        val buffer = StringBuffer()
        val matcher = IoCheckedScalar(this.regex)
            .value()
            .matcher(this.origin.asString())
        val safe = IoCheckedFunc(this.replacement)
        while (matcher.find()) {
            matcher.appendReplacement(
                buffer,
                safe.apply(matcher)
            )
        }
        matcher.appendTail(buffer)
        return buffer.toString()
    }

    override fun compareTo(other: Text): Int = origin.compareTo(other)
}
