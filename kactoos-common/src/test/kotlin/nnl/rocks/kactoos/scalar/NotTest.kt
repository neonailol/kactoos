package nnl.rocks.kactoos.scalar

import kotlin.test.Test
import kotlin.test.assertEquals

class NotTest {

    @Test
    fun notTrue() {
        assertEquals(
            False().invoke(),
            Not(True()).invoke()
        )
    }

    @Test
    fun notFalse() {
        assertEquals(
            True().invoke(),
            Not(False()).invoke()
        )
    }
}
