package nnl.rocks.kactoos

import nnl.rocks.kactoos.func.FuncOf
import org.junit.Test

/**
 * Test case for [Func].
 *
 *
 * @since 0.10
 *
 */
class FuncTest {

    @Test
    @Throws(Exception::class)
    fun failForNullFunc() {
        FuncOf<Any, Any>(Any()).apply(Any())
    }

    @Test(expected = IllegalArgumentException::class)
    @Throws(Exception::class)
    fun failForNullInput() {
        FuncOf<Any, Any> { input -> input }.apply(dummy())
    }

    @Test
    @Throws(Exception::class)
    fun okForNoNulls() {
        FuncOf<Any, Any> { input -> input }.apply(Any())
    }

    @Test
    @Throws(Exception::class)
    fun failForNullResult() {
        FuncOf<Any, Any> { input -> dummy() }.apply(Any())
    }
}
