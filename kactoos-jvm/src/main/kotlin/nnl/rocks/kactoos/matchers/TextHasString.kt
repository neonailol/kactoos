package nnl.rocks.kactoos.matchers

import nnl.rocks.kactoos.Text
import nnl.rocks.kactoos.text.UncheckedText
import org.hamcrest.Description
import org.hamcrest.Matcher
import org.hamcrest.TypeSafeMatcher
import org.hamcrest.core.IsEqual

/**
 * Matcher for the content.

 * @param matcher The matcher.
 * @since 0.3
 */
class TextHasString(private val matcher: Matcher<String>) : TypeSafeMatcher<Text>() {

    /**
     * Actual result for comparison.
     */
    private var result: String? = null

    /**
     * Ctor.
     * @param text The text to match against
     */
    constructor(text: String) : this(IsEqual<String>(text))

    init {
        this.result = ""
    }

    public override fun matchesSafely(item: Text): Boolean {
        this.result = UncheckedText(item).asString()
        return this.matcher.matches(this.result)
    }

    override fun describeTo(description: Description) {
        description.appendText(TextHasString.PREFIX)
        description.appendDescriptionOf(this.matcher)
    }

    public override fun describeMismatchSafely(
        item: Text,
        description: Description
    ) {
        description.appendText(TextHasString.PREFIX)
        description.appendValue(this.result)
    }

    companion object {

        /**
         * Prefix for description.
         */
        private const val PREFIX = "Text with "
    }
}
