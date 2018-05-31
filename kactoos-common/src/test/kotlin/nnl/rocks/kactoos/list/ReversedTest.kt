package nnl.rocks.kactoos.list

import kotlin.test.Test
import kotlin.test.assertEquals

class ReversedTest {

    @Test
    fun reversesNumbers() {
        val reversed = Reversed(listOf(1, 2, 3))
        assertEquals(3, reversed[0])
        assertEquals(2, reversed[1])
        assertEquals(1, reversed[2])
    }
}
