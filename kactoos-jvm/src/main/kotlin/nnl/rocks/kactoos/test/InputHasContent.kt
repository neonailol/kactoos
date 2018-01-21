package nnl.rocks.kactoos.test

import nnl.rocks.kactoos.Input
import nnl.rocks.kactoos.text.TextOf
import nnl.rocks.kactoos.text.UncheckedText
import org.hamcrest.Description
import org.hamcrest.Matcher
import org.hamcrest.TypeSafeMatcher
import org.hamcrest.core.IsEqual

/**
 * Matcher for the input.
 *
 * @param matcher Matcher of the value.
 *
 *
 *
 * @since 0.11
 */
class InputHasContent(private val matcher: Matcher<String>) : TypeSafeMatcher<Input>() {

    /**
     * @param text The text to match against
     */
    constructor(text: String) : this(IsEqual<String>(text))

    public override fun matchesSafely(item: Input): Boolean = this.matcher.matches(UncheckedText(TextOf(item)).asString())

    override fun describeTo(description: Description) {
        description.appendText("Input with ")
        description.appendDescriptionOf(this.matcher)
    }
}
