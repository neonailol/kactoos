
package nnl.rocks.kactoos

import nnl.rocks.kactoos.func.BiFuncOf
import org.junit.Test

/**
 * Test case for [BiFunc].
 * @since 0.3
 */
class BiFuncTest {

    @Test
    @Throws(Exception::class)
    fun okForNoNulls() {
        BiFuncOf<Any, Any, Any> { first, _ -> first }.apply(Any(), Any())
    }
}
