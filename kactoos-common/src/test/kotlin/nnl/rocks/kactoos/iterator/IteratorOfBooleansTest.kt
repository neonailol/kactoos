package nnl.rocks.kactoos.iterator

import kotlin.test.*

class IteratorOfBooleansTest {

    @Test
    fun iterates() {
        val iterator = IteratorOfBooleans(true, false)
        assertTrue(iterator.hasNext())
        assertEquals(true, iterator.next())
        assertTrue(iterator.hasNext())
        assertEquals(false, iterator.next())
        assertFalse(iterator.hasNext())
        assertFailsWith(NoSuchElementException::class, { iterator.next() })
    }
}
