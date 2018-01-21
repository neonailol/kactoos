package nnl.rocks.kactoos.func

import nnl.rocks.kactoos.scalar.True
import org.hamcrest.MatcherAssert
import org.hamcrest.Matchers
import org.junit.Test

/**
 * Test case for [CallableOf].
 *
 *
 *
 * @since 0.2
 *
 */
class CallableOfTest {

    @Test
    @Throws(Exception::class)
    fun convertsFuncIntoCallable() {
        MatcherAssert.assertThat(
            CallableOf<Any, Int>(FuncOf { 1 }, True()).call(),
            Matchers.equalTo(1)
        )
    }
}
