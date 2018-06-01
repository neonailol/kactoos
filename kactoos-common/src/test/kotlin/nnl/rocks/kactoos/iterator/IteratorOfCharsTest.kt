package nnl.rocks.kactoos.iterator

import kotlin.test.*

class IteratorOfCharsTest {

    @Test
    fun iterates() {
        val iterator = IteratorOfChars('a', 'c')
        assertTrue(iterator.hasNext())
        assertEquals('a', iterator.next())
        assertTrue(iterator.hasNext())
        assertEquals('c', iterator.next())
        assertFalse(iterator.hasNext())
        assertFailsWith(NoSuchElementException::class, { iterator.next() })
    }
}
