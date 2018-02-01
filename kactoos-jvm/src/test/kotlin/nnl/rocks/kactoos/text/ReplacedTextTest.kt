package nnl.rocks.kactoos.text

import nnl.rocks.kactoos.func.FuncOf
import nnl.rocks.kactoos.matchers.TextHasString
import nnl.rocks.kactoos.scalar.ScalarOf
import org.hamcrest.MatcherAssert
import org.junit.Test

import java.io.IOException
import java.nio.charset.StandardCharsets
import java.util.regex.Pattern
import java.util.regex.PatternSyntaxException

/**
 * Test case for [ReplacedText].
 *
 * @author Mehmet Yildirim (memoyil@gmail.com)
 * @version $Id: d69343a69198571f3bdac71b743c2bf7ee415587 $
 * @since 0.2
 * @checkstyle JavadocMethodCheck (500 lines)
 */
class ReplacedTextTest {

    @Test
    fun replaceText() {
        MatcherAssert.assertThat(
            "Can't replace a text",
            ReplacedText(
                TextOf("Hello!"),
                "ello", "i"
            ),
            TextHasString("Hi!")
        )
    }

    @Test
    fun notReplaceTextWhenSubstringNotFound() {
        val text = "HelloAgain!"
        MatcherAssert.assertThat(
            "Replace a text abnormally",
            ReplacedText(
                TextOf(text),
                "xyz", "i"
            ),
            TextHasString(text)
        )
    }

    @Test
    fun replacesAllOccurrences() {
        MatcherAssert.assertThat(
            "Can't replace a text with multiple needle occurrences",
            ReplacedText(
                TextOf("one cat, two cats, three cats"),
                "cat",
                "dog"
            ),
            TextHasString("one dog, two dogs, three dogs")
        )
    }

    @Test
    fun regexConstantReplace() {
        MatcherAssert.assertThat<ReplacedText>(
            "Cannot do simple replacement with regex",
            ReplacedText(
                TextOf("one cow two cows in the yard"),
                ScalarOf { Pattern.compile("cow") },
                FuncOf { matcher -> "pig" }
            ),
            TextHasString("one pig two pigs in the yard")
        )
    }

    @Test
    fun regexDynamicReplace() {
        MatcherAssert.assertThat<ReplacedText>(
            "Cannot do dynamic string replacement",
            ReplacedText(
                TextOf("one two THREE four FIVE six"),
                ScalarOf { Pattern.compile("[a-z]+") },
                FuncOf { matcher -> matcher.group().length.toString() }
            ),
            TextHasString("3 3 THREE 4 FIVE 3")
        )
    }

    @Test
    fun emptyText() {
        MatcherAssert.assertThat(
            "Substitution in empty text with non-empty regex.",
            ReplacedText(
                TextOf(""),
                "123",
                "WOW"
            ),
            TextHasString("")
        )
    }

    @Test
    fun emptyRegex() {
        MatcherAssert.assertThat(
            "Substitution in text with empty regex.",
            ReplacedText(
                TextOf("abc"),
                "",
                "1"
            ),
            TextHasString("1a1b1c1")
        )
    }

    @Test
    fun emptyTextAndEmptyRegex() {
        MatcherAssert.assertThat(
            "Substitution in empty text with empty regex.",
            ReplacedText(
                TextOf(""),
                "",
                "1"
            ),
            TextHasString("1")
        )
    }

    @Test(expected = PatternSyntaxException::class)
    @Throws(IOException::class)
    fun invalidRegex() {
        ReplacedText(
            TextOf("text"),
            "invalid_regex{0,",
            "error"
        ).asString()
    }

    @Test
    fun nonDefaultCharsetText() {
        MatcherAssert.assertThat<ReplacedText>(
            "Cannot do dynamic string replacement with non-default charset",
            ReplacedText(
                TextOf("abc def GHI JKL", StandardCharsets.UTF_16LE),
                ScalarOf { Pattern.compile("[A-Z]+") },
                FuncOf { matcher -> matcher.group().length.toString() }
            ),
            TextHasString("abc def 3 3")
        )
    }

    @Test
    fun unicodeText() {
        MatcherAssert.assertThat<ReplacedText>(
            "Cannot do dynamic string replacement with unicode characters",
            ReplacedText(
                TextOf("abc def GHI\u2300JKL"),
                ScalarOf { Pattern.compile("[a-z]+|\u2300") },
                FuncOf { matcher -> matcher.group().length.toString() }
            ),
            TextHasString("3 3 GHI1JKL")
        )
    }
}
