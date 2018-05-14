package nnl.rocks.kactoos.scalar

import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertSame

class ConstantTest {

    @Test
    fun returnsGivenValue() {
        val value = "Hello, World!"
        assertEquals(
            expected = value,
            actual = Constant(value).invoke(),
            message = "Returned value differ from expected"
        )
    }

    @Test
    fun alwaysReturnsSameValue() {
        val value = "Hello, World!"
        assertSame(
            expected = value,
            actual = Constant(value).invoke(),
            message = "Returned value not same as expected"
        )
    }
}
