package nnl.rocks.kactoos.iterator

import kotlin.test.*

class RangeOfTest {

    @Test
    fun range() {
        val rangeOf = RangeOf(0, 2, { v -> v + 1 })
        assertTrue(rangeOf.hasNext())
        assertEquals(0, rangeOf.next())
        assertTrue(rangeOf.hasNext())
        assertEquals(1, rangeOf.next())
        assertTrue(rangeOf.hasNext())
        assertEquals(2, rangeOf.next())
        assertFalse(rangeOf.hasNext())
        assertFailsWith(NoSuchElementException::class, { rangeOf.next() })
    }
}
