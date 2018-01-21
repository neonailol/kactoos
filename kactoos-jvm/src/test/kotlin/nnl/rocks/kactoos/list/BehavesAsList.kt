package nnl.rocks.kactoos.list

import nnl.rocks.kactoos.collection.BehavesAsCollection
import org.hamcrest.Description
import org.hamcrest.MatcherAssert
import org.hamcrest.Matchers
import org.hamcrest.TypeSafeMatcher

/**
 * Matcher for collection.
 *
 *
 * @param <E> Type of source item
 * @since 0.23
 *
</E> */
class BehavesAsList<E : Any>
/**
 * Ctor.
 * @param sample Sample item
 */
(
    /**
     * Sample item.
     */
    private val sample: E
) : TypeSafeMatcher<List<E>>() {

    public override fun matchesSafely(list: List<E>): Boolean {
        MatcherAssert.assertThat(list[0], Matchers.notNullValue())
        MatcherAssert.assertThat(
            list.indexOf(this.sample),
            Matchers.greaterThanOrEqualTo(0)
        )
        MatcherAssert.assertThat(
            list.lastIndexOf(this.sample),
            Matchers.greaterThanOrEqualTo(0)
        )
        MatcherAssert.assertThat(
            list.listIterator().hasNext(),
            Matchers.`is`(true)
        )
        MatcherAssert.assertThat(
            list.subList(0, 1).iterator().hasNext(),
            Matchers.`is`(true)
        )
        return BehavesAsCollection(this.sample).matchesSafely(list)
    }

    override fun describeTo(desc: Description) {
        desc.appendText("not a valid list")
    }
}
