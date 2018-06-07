package nnl.rocks.kactoos.iterable

import kotlin.test.*

class MappedTest {

    @Test
    fun mapsVarargs() {
        val mapped = Mapped(
            { x: Int -> x.toString() },
            1, 2, 3
        ).iterator()
        assertTrue(mapped.hasNext())
        assertEquals("1", mapped.next())
        assertTrue(mapped.hasNext())
        assertEquals("2", mapped.next())
        assertTrue(mapped.hasNext())
        assertEquals("3", mapped.next())
        assertFalse(mapped.hasNext())
        assertFailsWith(NoSuchElementException::class) { mapped.next() }
    }
}
