package nnl.rocks.kactoos.collection

import nnl.rocks.kactoos.func.FuncOf
import nnl.rocks.kactoos.matchers.RunsInThreads
import org.hamcrest.MatcherAssert
import org.junit.Test

/**
 * Test Case for [SyncCollection].
 * @author Yegor Bugayenko (yegor256@gmail.com)
 * @version $Id: 61032113b5bb1fbb4e21390f307c22fcde3c189f $
 * @since 0.23
 * @checkstyle JavadocMethodCheck (500 lines)
 */
class SyncCollectionTest {

    @Test
    @Throws(Exception::class)
    fun behavesAsCollection() {
        MatcherAssert.assertThat(
            "Can't behave as a collection",
            SyncCollection(1, 2, 0, - 1),
            BehavesAsCollection(- 1)
        )
    }

    @Test
    fun worksInThreads() {
        MatcherAssert.assertThat(
            "Can't behave as a collection in multiple threads",
            FuncOf { list ->
                MatcherAssert.assertThat(list, BehavesAsCollection(0))
                true
            },
            RunsInThreads(SyncCollection(1, 0, - 1, - 1, 2))
        )
    }
}
