package nnl.rocks.kactoos.scalar

import kotlin.test.Test
import kotlin.test.assertTrue

class TrueTest {

    @Test
    fun value() {
        assertTrue(
            True().invoke(),
            "True should return logical truth"
        )
    }
}
