package nnl.rocks.kactoos.collection

import nnl.rocks.kactoos.RunsInThreads
import nnl.rocks.kactoos.func.FuncOf
import org.hamcrest.MatcherAssert
import org.junit.Test

/**
 * Test Case for [SyncCollection].
 *
 *
 * @since 0.23
 *
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
        MatcherAssert.assertThat<FuncOf<SyncCollection<Int>, Boolean>>(
            "Can't behave as a collection in multiple threads",
            FuncOf { list ->
                MatcherAssert.assertThat<SyncCollection<Int>>(list, BehavesAsCollection(0))
                true
            },
            RunsInThreads(SyncCollection(1, 0, - 1, - 1, 2))
        )
    }
}
