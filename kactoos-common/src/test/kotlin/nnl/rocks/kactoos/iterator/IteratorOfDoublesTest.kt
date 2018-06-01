package nnl.rocks.kactoos.iterator

import kotlin.test.*

class IteratorOfDoublesTest {

    @Test
    fun iterates() {
        val iterator = IteratorOfDoubles(1.0, 2.0)
        assertTrue(iterator.hasNext())
        assertEquals(1.0, iterator.next())
        assertTrue(iterator.hasNext())
        assertEquals(2.0, iterator.next())
        assertFalse(iterator.hasNext())
        assertFailsWith(NoSuchElementException::class, { iterator.next() })
    }
}
