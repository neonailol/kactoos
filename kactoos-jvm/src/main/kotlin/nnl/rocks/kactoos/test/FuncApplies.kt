package nnl.rocks.kactoos.test

import nnl.rocks.kactoos.Func
import nnl.rocks.kactoos.func.UncheckedFunc
import org.hamcrest.Description
import org.hamcrest.Matcher
import org.hamcrest.TypeSafeMatcher
import org.hamcrest.core.IsEqual

/**
 * Matcher for the value.
 *
 * @param input Input of the function.
 * @param matcher Matcher of the result.
 *
 * @param X Type of input
 * @param Y Type of output
 *
 *
 *
 * @since 0.2
 */
class FuncApplies<X : Any, Y : Any>(
    private val input: X,
    private val matcher: Matcher<Y>
) : TypeSafeMatcher<Func<X, Y>>() {

    /**
     * @param result The result expected
     * @param input Input for the function
     */
    constructor(
        input: X,
        result: Y
    ) : this(input, IsEqual<Y>(result))

    public override fun matchesSafely(func: Func<X, Y>): Boolean = this.matcher.matches(UncheckedFunc(func).apply(this.input))

    override fun describeTo(description: Description) {
        description.appendText("Scalar with ")
        description.appendDescriptionOf(this.matcher)
    }
}
