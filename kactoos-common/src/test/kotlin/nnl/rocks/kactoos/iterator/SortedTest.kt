package nnl.rocks.kactoos.iterator

import kotlin.test.*

class SortedTest {

    @Test
    fun sortedNumbers() {
        val sorted = Sorted(IteratorOf(3, 2, 1))
        assertTrue(sorted.hasNext())
        assertEquals(1, sorted.next())
        assertTrue(sorted.hasNext())
        assertEquals(2, sorted.next())
        assertTrue(sorted.hasNext())
        assertEquals(3, sorted.next())
        assertFalse(sorted.hasNext())
        assertFailsWith(NoSuchElementException::class, { sorted.next() })
    }

    @Test
    fun sortsUsingComparator() {
        val sorted = Sorted(
            Comparator { a, b -> a.first().compareTo(b.first()) },
            IteratorOf("the", "red", "fox")
        )
        assertTrue(sorted.hasNext())
        assertEquals("fox", sorted.next())
        assertTrue(sorted.hasNext())
        assertEquals("red", sorted.next())
        assertTrue(sorted.hasNext())
        assertEquals("the", sorted.next())
        assertFalse(sorted.hasNext())
        assertFailsWith(NoSuchElementException::class, { sorted.next() })
    }

}
