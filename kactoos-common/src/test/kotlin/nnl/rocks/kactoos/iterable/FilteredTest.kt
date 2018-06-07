package nnl.rocks.kactoos.iterable

import nnl.rocks.kactoos.Func
import nnl.rocks.kactoos.iterator.IteratorOf
import kotlin.test.*

class FilteredTest {

    @Test
    fun filtersVarargs() {
        val filtered = Filtered(
            { x: String -> x.length < 4 },
            "red", "lazy", "fox"
        ).iterator()

        assertTrue(filtered.hasNext())
        assertEquals("red", filtered.next())
        assertTrue(filtered.hasNext())
        assertEquals("fox", filtered.next())
        assertFalse(filtered.hasNext())
        assertFailsWith(NoSuchElementException::class) { filtered.next() }
    }

    @Test
    fun filtersIterator() {
        val filtered = Filtered(
            { x: String -> x.length < 4 },
            IteratorOf("red", "lazy", "fox")
        ).iterator()

        assertTrue(filtered.hasNext())
        assertEquals("red", filtered.next())
        assertTrue(filtered.hasNext())
        assertEquals("fox", filtered.next())
        assertFalse(filtered.hasNext())
        assertFailsWith(NoSuchElementException::class) { filtered.next() }
    }

    @Test
    fun filtersFunc() {
        val filtered = Filtered(
            object: Func<String, Boolean> {
                override fun apply(input: String): Boolean = input.length < 4
            },
            IterableOf("red", "lazy", "fox")
        ).iterator()

        assertTrue(filtered.hasNext())
        assertEquals("red", filtered.next())
        assertTrue(filtered.hasNext())
        assertEquals("fox", filtered.next())
        assertFalse(filtered.hasNext())
        assertFailsWith(NoSuchElementException::class) { filtered.next() }
    }
}
