package nnl.rocks.kactoos.matchers

import nnl.rocks.kactoos.Func
import nnl.rocks.kactoos.Proc
import nnl.rocks.kactoos.func.FuncOf
import nnl.rocks.kactoos.func.UncheckedFunc
import org.hamcrest.Description
import org.hamcrest.TypeSafeMatcher

/**
 * Func as Matcher.
 *
 * There is no thread-safety guarantee.
 *
 * @param func The func.
 * @param T Type of object to match.
 * @since 0.3
 */
class MatcherOf<T : Any>(private val func: Func<T, Boolean>) : TypeSafeMatcher<T>() {

    /**
     * @param proc The func
     */
    constructor(proc: Proc<T>) : this(FuncOf<T, Boolean>(proc, true))

    public override fun matchesSafely(item: T): Boolean = UncheckedFunc(this.func).apply(item)

    override fun describeTo(description: Description) {
        description.appendText(this.func.toString())
    }
}
