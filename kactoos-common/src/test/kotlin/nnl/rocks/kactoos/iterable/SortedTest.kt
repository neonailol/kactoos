package nnl.rocks.kactoos.iterable

import kotlin.test.*

class SortedTest {

    @Test
    fun sorts() {
        val sorted = Sorted(Comparator { a, b -> a.compareTo(b) }, 2, 1)
        for (i in 1 .. 3) {
            val iterator = sorted.iterator()
            assertTrue(iterator.hasNext())
            assertEquals(1, iterator.next())
            assertTrue(iterator.hasNext())
            assertEquals(2, iterator.next())
            assertFalse(iterator.hasNext())
            assertFailsWith(NoSuchElementException::class, { iterator.next() })
        }
    }
}
