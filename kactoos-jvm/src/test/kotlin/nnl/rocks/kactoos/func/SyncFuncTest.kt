
package nnl.rocks.kactoos.func

import nnl.rocks.kactoos.matchers.RunsInThreads
import org.hamcrest.MatcherAssert
import org.hamcrest.Matchers
import org.junit.Test

import java.util.LinkedList

/**
 * Test case for [SyncFunc].
 *
 * @author Yegor Bugayenko (yegor256@gmail.com)
 * @version $Id: 9b3327de2e151478ab150f84e07c139fa852d584 $
 * @since 0.24
 * @checkstyle JavadocMethodCheck (500 lines)
 */
class SyncFuncTest {

    @Test
    fun worksInThreads() {
        val list = LinkedList<Int>()
        val threads = 100
        MatcherAssert.assertThat(
                "Can't work well in multiple threads",
                { func -> func.apply(true) },
                RunsInThreads(
                        SyncFunc<Boolean, Boolean>(
                                { input -> list.add(1) }
                        ),
                        threads
                )
        )
        MatcherAssert.assertThat(list.size, Matchers.equalTo(threads))
    }
}
