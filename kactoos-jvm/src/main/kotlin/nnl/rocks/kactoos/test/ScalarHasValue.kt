package nnl.rocks.kactoos.test

import nnl.rocks.kactoos.Scalar
import nnl.rocks.kactoos.scalar.UncheckedScalar
import org.hamcrest.Description
import org.hamcrest.Matcher
import org.hamcrest.TypeSafeMatcher
import org.hamcrest.core.IsEqual

/**
 * Matcher for the value.
 *
 * @param matcher The matcher.
 * @param T Type of result.

 *
 *
 * @since 0.2
 */
class ScalarHasValue<T : Any>(private val matcher: Matcher<T>) : TypeSafeMatcher<Scalar<T>>() {

    /**
     * @param value The value to match against
     */
    constructor(value: T) : this(IsEqual<T>(value))

    public override fun matchesSafely(item: Scalar<T>): Boolean = this.matcher.matches(UncheckedScalar(item).value())

    override fun describeTo(description: Description) {
        description.appendText("Scalar with ")
        description.appendDescriptionOf(this.matcher)
    }
}
