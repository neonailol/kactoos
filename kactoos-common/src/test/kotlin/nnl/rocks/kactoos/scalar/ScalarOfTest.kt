package nnl.rocks.kactoos.scalar

import kotlin.test.Test
import kotlin.test.assertEquals

class ScalarOfTest {

    @Test
    fun okForNoNulls() {
        assertEquals(
            "Hello",
            Constant(
                "Hello"
            ).invoke()
        )
    }
}
