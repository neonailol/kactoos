package nnl.rocks.kactoos.iterator

import kotlin.test.*

class MappedTest {

    @Test
    fun maps() {
        val mapped = Mapped(
            { x: Int -> x.toString() },
            IteratorOf(1, 2)
        )
        assertTrue(mapped.hasNext())
        assertEquals("1", mapped.next())
        assertTrue(mapped.hasNext())
        assertEquals("2", mapped.next())
        assertFalse(mapped.hasNext())
        assertFailsWith(NoSuchElementException::class, { mapped.next() })
    }
}
