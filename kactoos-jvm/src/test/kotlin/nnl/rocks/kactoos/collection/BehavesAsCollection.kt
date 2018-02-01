package nnl.rocks.kactoos.collection

import nnl.rocks.kactoos.list.ListOf
import org.hamcrest.Description
import org.hamcrest.MatcherAssert
import org.hamcrest.Matchers
import org.hamcrest.TypeSafeMatcher

/**
 * Matcher for collection.
 * @param E Type of source item
 * @since 0.3
 */
class BehavesAsCollection<E : Any>(private val sample: E) : TypeSafeMatcher<Collection<E>>() {

    public override fun matchesSafely(col: Collection<E>): Boolean {
        MatcherAssert.assertThat(col, Matchers.hasItem(this.sample))
        MatcherAssert.assertThat(col, Matchers.not(Matchers.emptyIterable()))
        MatcherAssert.assertThat(col, Matchers.hasSize(Matchers.greaterThan(0)))
        MatcherAssert.assertThat(ListOf(col), Matchers.hasItem(this.sample))
        val array = arrayOfNulls<Any>(col.size)
        MatcherAssert.assertThat(ListOf(array), Matchers.hasItem(this.sample))
        MatcherAssert.assertThat(col.containsAll(ListOf(this.sample)), Matchers.`is`(true))
        return true
    }

    override fun describeTo(desc: Description) {
        desc.appendText("not a valid collection")
    }
}
