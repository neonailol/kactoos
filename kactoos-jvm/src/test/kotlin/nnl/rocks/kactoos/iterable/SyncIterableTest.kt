
package nnl.rocks.kactoos.iterable

import nnl.rocks.kactoos.matchers.RunsInThreads
import org.hamcrest.MatcherAssert
import org.hamcrest.Matchers
import org.junit.Test

/**
 * Test Case for [SyncIterable].
 * @author Yegor Bugayenko (yegor256@gmail.com)
 * @version $Id: 476388597e5e3de11e667d382277391a566aaeab $
 * @since 0.24
 * @checkstyle JavadocMethodCheck (500 lines)
 * @checkstyle MagicNumber (500 lines)
 */
class SyncIterableTest {

    @Test
    fun worksInThreads() {
        MatcherAssert.assertThat(
                "Can't behave as an iterable in multiple threads",
                { list ->
                    MatcherAssert.assertThat(
                            list.iterator().next(),
                            Matchers.equalTo(list.iterator().next())
                    )
                    true
                },
                RunsInThreads(SyncIterable<X>(1, 0, - 1, - 1, 2))
        )
    }
}
