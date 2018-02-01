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
 *
 *
 *
 * @since 0.2
 */
class TextHasString(private val matcher: Matcher<String>) : TypeSafeMatcher<Text>() {

    /**
     * @param text The text to match against
     */
    constructor(text: String) : this(IsEqual<String>(text))

    public override fun matchesSafely(item: Text): Boolean = this.matcher.matches(UncheckedText(item).asString())

    override fun describeTo(description: Description) {
        description.appendText("Text with ")
        description.appendDescriptionOf(this.matcher)
    }
}
