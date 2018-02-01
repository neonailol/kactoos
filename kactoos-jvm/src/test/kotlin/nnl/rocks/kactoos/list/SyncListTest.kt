
package nnl.rocks.kactoos.list

import nnl.rocks.kactoos.matchers.RunsInThreads
import org.hamcrest.MatcherAssert
import org.junit.Test

/**
 * Test case for [SyncList].
 * @author Yegor Bugayenko (yegor256@gmail.com)
 * @author Mehmet Yildirim (memoyil@gmail.com)
 * @version $Id: 887804e12f7810f8878a4d1ac556ec81405d3337 $
 * @since 0.24
 * @checkstyle JavadocMethodCheck (500 lines)
 */
class SyncListTest {

    @Test
    @Throws(Exception::class)
    fun behavesAsCollection() {
        MatcherAssert.assertThat(
                "Can't behave as a list",
                SyncList(1, 0, - 1, - 1, 2),
                BehavesAsList(0)
        )
    }

    @Test
    fun worksInThreads() {
        MatcherAssert.assertThat(
                { list -> ! list.iterator().hasNext() },
                RunsInThreads(SyncList<X>(emptyList<Any>()))
        )
        MatcherAssert.assertThat(
                { list ->
                    MatcherAssert.assertThat<T>(list, BehavesAsList(0))
                    true
                },
                RunsInThreads(SyncList<X>(1, 0, - 1, - 1, 2))
        )
    }
}
