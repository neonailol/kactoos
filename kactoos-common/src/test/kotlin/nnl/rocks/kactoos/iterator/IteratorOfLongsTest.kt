package nnl.rocks.kactoos.iterator

import kotlin.test.*

class IteratorOfLongsTest {

    @Test
    fun iterates() {
        val iterator = IteratorOfLongs(1L, 2L)
        assertTrue(iterator.hasNext())
        assertEquals(1, iterator.next())
        assertTrue(iterator.hasNext())
        assertEquals(2, iterator.next())
        assertFalse(iterator.hasNext())
        assertFailsWith(NoSuchElementException::class, { iterator.next() })
    }
}
