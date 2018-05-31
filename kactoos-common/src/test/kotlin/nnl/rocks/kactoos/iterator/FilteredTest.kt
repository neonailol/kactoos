package nnl.rocks.kactoos.iterator

import kotlin.test.*

class FilteredTest {

    @Test
    fun filters() {
        val filtered = Filtered(
            { input -> input.length < 4 },
            IteratorOf("red", "lazy", "fox")
        )
        assertTrue(filtered.hasNext())
        assertEquals("red", filtered.next())
        assertTrue(filtered.hasNext())
        assertEquals("fox", filtered.next())
        assertFalse(filtered.hasNext())
        assertFailsWith(NoSuchElementException::class, { filtered.next() })
    }
}
