
package nnl.rocks.kactoos.collection

import nnl.rocks.kactoos.list.ListOf
import org.hamcrest.MatcherAssert
import org.hamcrest.Matchers
import org.junit.Test

/**
 * Test Case for [CollectionOf].
 * @author Yegor Bugayenko (yegor256@gmail.com)
 * @version $Id: 92460dd62bd3ee819ac39a965d3ce14e41ee3a4e $
 * @since 0.23
 * @checkstyle JavadocMethodCheck (500 lines)
 */
class CollectionOfTest {

    @Test
    @Throws(Exception::class)
    fun behavesAsCollection() {
        MatcherAssert.assertThat(
                "Can't behave as a collection",
                CollectionOf(1, 2, 0, - 1),
                BehavesAsCollection(- 1)
        )
    }

    @Test
    @Throws(Exception::class)
    fun buildsCollection() {
        MatcherAssert.assertThat(
                "Can't build a collection",
                CollectionOf(1, 2, 0, - 1),
                Matchers.hasItem(- 1)
        )
    }

    @Test
    @Throws(Exception::class)
    fun buildsCollectionFromIterator() {
        MatcherAssert.assertThat(
                "Can't build a collection from iterator",
                CollectionOf(ListOf(1, 2, 0, - 1).iterator()),
                Matchers.hasItem(- 1)
        )
    }
}
