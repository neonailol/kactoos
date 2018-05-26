package nnl.rocks.kactoos.scalar

import kotlin.test.Test
import kotlin.test.assertFalse

class FalseTest {

    @Test
    fun value() {
        assertFalse(
            False().invoke(),
            "True should return logical false"
        )
    }
}
