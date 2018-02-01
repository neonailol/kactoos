
package nnl.rocks.kactoos.list

import nnl.rocks.kactoos.collection.BehavesAsCollection
import org.hamcrest.Description
import org.hamcrest.MatcherAssert
import org.hamcrest.Matchers
import org.hamcrest.TypeSafeMatcher

/**
 * Matcher for collection.
 * @author Yegor Bugayenko (yegor256@gmail.com)
 * @version $Id: 7fb63d0f2f77d032e2acd7d3e8e616610ad000d7 $
 * @param <E> Type of source item
 * @since 0.23
 * @checkstyle JavadocMethodCheck (500 lines)
</E> */
class BehavesAsList<E>
/**
 * Ctor.
 * @param item Sample item
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
