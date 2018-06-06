package nnl.rocks.kactoos.iterable

import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

class CycledTest {

    @Test
    fun cyclesVarargs() {
        val cycled = Cycled(0, 1, 2).iterator()
        for (i in 0 .. 10) {
            assertTrue(cycled.hasNext())
            assertEquals(i % 3, cycled.next())
        }
    }
}
