package nnl.rocks.kactoos.iterator

import kotlin.test.*

class IteratorOfFloatsTest {

    @Test
    fun iterates() {
        val iterator = IteratorOfFloats(1.0f, 2.0f)
        assertTrue(iterator.hasNext())
        assertEquals(1.0f, iterator.next())
        assertTrue(iterator.hasNext())
        assertEquals(2.0f, iterator.next())
        assertFalse(iterator.hasNext())
        assertFailsWith(NoSuchElementException::class, { iterator.next() })
    }
}
