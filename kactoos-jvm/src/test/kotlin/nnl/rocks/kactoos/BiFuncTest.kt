package nnl.rocks.kactoos

import nnl.rocks.kactoos.func.BiFuncOf
import org.junit.Test

/**
 * Test case for [BiFunc].
 * @since 0.11
 */
class BiFuncTest {

    @Test
    @Throws(Exception::class)
    fun failForNullFunc() {
        BiFuncOf<Any, Any, Any>(Any()).apply(Any(), Any())
    }

    @Test(expected = IllegalArgumentException::class)
    @Throws(Exception::class)
    fun failForNullFirstArg() {
        BiFuncOf<Any, Any, Any> { first, second -> first }.apply(dummy(), Any())
    }

    @Test(expected = IllegalArgumentException::class)
    @Throws(Exception::class)
    fun failForNullSecondArg() {
        BiFuncOf<Any, Any, Any> { first, second -> first }.apply(Any(), dummy())
    }

    @Test
    @Throws(Exception::class)
    fun failForNullResult() {
        BiFuncOf<Any, Any, Any> { first, second -> dummy() }.apply(Any(), Any())
    }

    @Test
    @Throws(Exception::class)
    fun okForNoNulls() {
        BiFuncOf<Any, Any, Any> { first, second -> first }.apply(Any(), Any())
    }
}
