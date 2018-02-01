
package nnl.rocks.kactoos.scalar

import nnl.rocks.kactoos.matchers.RunsInThreads
import org.hamcrest.MatcherAssert
import org.hamcrest.Matchers
import org.junit.Test

import java.util.LinkedList

/**
 * Test case for [SyncScalar].
 *
 * @author Yegor Bugayenko (yegor256@gmail.com)
 * @version $Id: 4b8c22e9ad3a2c3eb1e732ae9a3ff2e8fe6858ed $
 * @since 0.24
 * @checkstyle JavadocMethodCheck (500 lines)
 */
class SyncScalarTest {

    @Test
    fun worksInThreads() {
        val list = LinkedList<Int>()
        val threads = 100
        MatcherAssert.assertThat(
                "Can't work well in multiple threads",
                T { it.value() },
                RunsInThreads(
                        SyncScalar<T>({ list.add(1) }), threads
                )
        )
        MatcherAssert.assertThat(list.size, Matchers.equalTo(threads))
    }
}
