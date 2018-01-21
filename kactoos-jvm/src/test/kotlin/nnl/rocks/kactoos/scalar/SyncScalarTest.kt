package nnl.rocks.kactoos.scalar

import nnl.rocks.kactoos.RunsInThreads
import nnl.rocks.kactoos.func.FuncOf
import org.hamcrest.MatcherAssert
import org.hamcrest.Matchers
import org.junit.Test
import java.util.LinkedList

/**
 * Test case for [SyncScalar].
 *
 *
 *
 * @since 0.24
 *
 */
class SyncScalarTest {

    @Test
    fun worksInThreads() {
        val list = LinkedList<Int>()
        val threads = 100
        MatcherAssert.assertThat<FuncOf<SyncScalar<Boolean>, Boolean>>(
            "Can't work well in multiple threads",
            FuncOf { it.value() },
            RunsInThreads(
                SyncScalar(ScalarOf { list.add(1) }), threads
            )
        )
        MatcherAssert.assertThat(list.size, Matchers.equalTo(threads))
    }
}
