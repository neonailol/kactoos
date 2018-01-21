package nnl.rocks.kactoos.iterable

import nnl.rocks.kactoos.RunsInThreads
import nnl.rocks.kactoos.func.FuncOf
import org.hamcrest.MatcherAssert
import org.hamcrest.Matchers
import org.junit.Test

/**
 * Test Case for [SyncIterable].
 *
 *
 * @since 0.24
 *
 *
 */
class SyncIterableTest {

    @Test
    fun worksInThreads() {
        MatcherAssert.assertThat<FuncOf<SyncIterable<Int>, Boolean>>(
            "Can't behave as an iterable in multiple threads",
            FuncOf { list ->
                MatcherAssert.assertThat(
                    list.iterator().next(),
                    Matchers.equalTo<Int>(list.iterator().next())
                )
                true
            },
            RunsInThreads(SyncIterable(1, 0, - 1, - 1, 2))
        )
    }
}
