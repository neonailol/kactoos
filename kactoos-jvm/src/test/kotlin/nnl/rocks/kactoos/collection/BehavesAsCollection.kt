
package nnl.rocks.kactoos.collection

import nnl.rocks.kactoos.list.ListOf
import org.hamcrest.Description
import org.hamcrest.MatcherAssert
import org.hamcrest.Matchers
import org.hamcrest.TypeSafeMatcher

/**
 * Matcher for collection.
 * @author Yegor Bugayenko (yegor256@gmail.com)
 * @version $Id: 848c3d12a09b501f6a5744ab5966dcf8a9da08e6 $
 * @param <E> Type of source item
 * @since 0.23
 * @checkstyle JavadocMethodCheck (500 lines)
</E> */
class BehavesAsCollection<E>
/**
 * Ctor.
 * @param item Sample item
 */
(
        /**
         * Sample item.
         */
        private val sample: E
) : TypeSafeMatcher<Collection<E>>() {

    public override fun matchesSafely(col: Collection<E>): Boolean {
        MatcherAssert.assertThat(col, Matchers.hasItem(this.sample))
        MatcherAssert.assertThat(col, Matchers.not(Matchers.emptyIterable()))
        MatcherAssert.assertThat(
                col, Matchers.hasSize(Matchers.greaterThan(0))
        )
        MatcherAssert.assertThat(
                ListOf<E>(*col.toTypedArray()),
                Matchers.hasItem(this.sample)
        )
        val array = arrayOfNulls<Any>(col.size) as Array<E>
        col.toTypedArray()
        MatcherAssert.assertThat(
                ListOf<E>(*array), Matchers.hasItem(this.sample)
        )
        MatcherAssert.assertThat(
                col.containsAll(ListOf<E>(this.sample)), Matchers.`is`(true)
        )
        return true
    }

    override fun describeTo(desc: Description) {
        desc.appendText("not a valid collection")
    }
}
