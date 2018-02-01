
package nnl.rocks.kactoos

import nnl.rocks.kactoos.func.BiFuncOf
import org.junit.Test

/**
 * Test case for [BiFunc.NoNulls].
 * @author Fabricio Cabral (fabriciofx@gmail.com)
 * @version $Id: dcdfa26280dd8966ba2a1902c8f58aed8d262d5b $
 * @since 0.11
 * @checkstyle JavadocMethodCheck (500 lines)
 */
class BiFuncTest {

    @Test(expected = IllegalArgumentException::class)
    @Throws(Exception::class)
    fun failForNullFunc() {
        BiFuncOf<Any, Any, Any>(Any()).apply(Any(), Any())
    }

    @Test(expected = IllegalArgumentException::class)
    @Throws(Exception::class)
    fun failForNullFirstArg() {
        BiFuncOf<Any, Any, Any> { first, second -> first }.apply(Any(), Any())
    }

    @Test(expected = IllegalArgumentException::class)
    @Throws(Exception::class)
    fun failForNullSecondArg() {
        BiFuncOf<Any, Any, Any> { first, second -> first }.apply(Any(), Any())
    }

    @Test(expected = IllegalStateException::class)
    @Throws(Exception::class)
    fun failForNullResult() {
        BiFuncOf<Any, Any, Any> { first, second -> Any() }.apply(Any(), Any())
    }

    @Test
    @Throws(Exception::class)
    fun okForNoNulls() {
        BiFuncOf<Any, Any, Any> { first, second -> first }.apply(Any(), Any())
    }
}
