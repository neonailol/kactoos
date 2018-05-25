package nnl.rocks.kactoos.text

import nnl.rocks.kactoos.Func
import nnl.rocks.kactoos.KScalar
import nnl.rocks.kactoos.Text
import nnl.rocks.kactoos.func.FuncOf
import nnl.rocks.kactoos.func.IoCheckedFunc
import nnl.rocks.kactoos.scalar.IoCheckedScalar
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
 * @since 0.2
 */
class ReplacedText private constructor(text: KScalar<String>): TextEnvelope(text) {

    /**
     * @param origin The text
     * @param regex The regular expression
     * @param replacement Transforms the resulting matcher object into a replacement string.
     */
    constructor(origin: Text, regex: KScalar<Pattern>, replacement: Func<Matcher, String>) : this(
        {
            val buffer = StringBuffer()
            val matcher = IoCheckedScalar(regex)
                .invoke()
                .matcher(origin.asString())
            val safe = IoCheckedFunc(replacement)
            while (matcher.find()) {
                matcher.appendReplacement(
                    buffer,
                    safe.apply(matcher)
                )
            }
            matcher.appendTail(buffer)
            buffer.toString()
        }
    )

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
    ) : this(text,  { Pattern.compile(find) }, FuncOf { replace })
}
