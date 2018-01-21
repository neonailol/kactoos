package nnl.rocks.kactoos.list

import nnl.rocks.kactoos.RunsInThreads
import nnl.rocks.kactoos.func.FuncOf
import org.hamcrest.MatcherAssert
import org.junit.Test

/**
 * Test case for [SyncList].
 *
 *
 *
 * @since 0.24
 *
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
        MatcherAssert.assertThat<FuncOf<SyncList<Any>, Boolean>>(
            FuncOf { list -> ! list.iterator().hasNext() },
            RunsInThreads(SyncList<Any>(emptyList()))
        )
        MatcherAssert.assertThat<FuncOf<SyncList<Int>, Boolean>>(
            FuncOf { list ->
                MatcherAssert.assertThat<SyncList<Int>>(list, BehavesAsList(0))
                true
            },
            RunsInThreads(SyncList(1, 0, - 1, - 1, 2))
        )
    }
}
