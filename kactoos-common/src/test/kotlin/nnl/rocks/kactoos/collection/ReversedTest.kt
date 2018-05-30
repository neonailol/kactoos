package nnl.rocks.kactoos.collection

import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

class ReversedTest {

    @Test
    fun reversesVarargs() {
        val reversed = Reversed(1, 2, 3)
        assertEquals(
            reversed.first(),
            3
        )
        assertTrue(
            reversed.containsAll(listOf(1, 2, 3))
        )
    }
}
