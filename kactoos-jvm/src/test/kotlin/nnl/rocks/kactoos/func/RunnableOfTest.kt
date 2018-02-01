package nnl.rocks.kactoos.func

import nnl.rocks.kactoos.matchers.MatcherOf
import org.hamcrest.MatcherAssert
import org.junit.Test

import java.util.concurrent.atomic.AtomicBoolean

/**
 * Test case for [RunnableOf].
 *
 * @author Yegor Bugayenko (yegor256@gmail.com)
 * @version $Id: 5f739cf6b11676e6ea015e6f6564c159275ec1db $
 * @since 0.2
 * @checkstyle JavadocMethodCheck (500 lines)
 */
class RunnableOfTest {

    @Test
    @Throws(Exception::class)
    fun convertsFuncIntoRunnable() {
        val done = AtomicBoolean()
        MatcherAssert.assertThat<RunnableOf<Any>>(
            "Can't execute Runnable",
            RunnableOf<Any>(
                FuncOf { input ->
                    done.set(true)
                    1
                }
            ),
            MatcherOf<Runnable> { input ->
                input.run()
                done.get()
            }
        )
    }
}
