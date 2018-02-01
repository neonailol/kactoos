package nnl.rocks.kactoos.func

import nnl.rocks.kactoos.matchers.RunsInThreads
import org.hamcrest.MatcherAssert
import org.hamcrest.Matchers
import org.junit.Test
import java.util.LinkedList

/**
 * Test case for [SyncFunc].
 *
 *
 *
 * @since 0.24
 *
 */
class SyncFuncTest {

    @Test
    fun worksInThreads() {
        val list = LinkedList<Int>()
        val threads = 100
        MatcherAssert.assertThat<FuncOf<SyncFunc<Boolean, Boolean>, Boolean>>(
            "Can't work well in multiple threads",
            FuncOf { func -> func.apply(true) },
            RunsInThreads(
                SyncFunc(FuncOf { input -> list.add(1) }),
                threads
            )
        )
        MatcherAssert.assertThat(list.size, Matchers.equalTo(threads))
    }
}
