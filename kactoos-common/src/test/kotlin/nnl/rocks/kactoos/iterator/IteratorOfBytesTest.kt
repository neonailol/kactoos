package nnl.rocks.kactoos.iterator

import kotlin.test.*

class IteratorOfBytesTest {

    @Test
    fun iterates() {
        val iterator = IteratorOfBytes(1, 2)
        assertTrue(iterator.hasNext())
        assertEquals(1, iterator.next())
        assertTrue(iterator.hasNext())
        assertEquals(2, iterator.next())
        assertFalse(iterator.hasNext())
        assertFailsWith(NoSuchElementException::class, { iterator.next() })
    }
}
