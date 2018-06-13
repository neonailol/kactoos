package nnl.rocks.kactoos.iterable

import kotlin.test.*

class TailOfTest {
    @Test
    fun tail() {
        val tail = TailOf(2, 1, 2, 3, 4)
        for (i in 1 .. 3) {
            val iterator = tail.iterator()
            assertTrue(iterator.hasNext())
            assertEquals(3, iterator.next())
            assertTrue(iterator.hasNext())
            assertEquals(4, iterator.next())
            assertFalse(iterator.hasNext())
            assertFailsWith(NoSuchElementException::class, { iterator.next() })
        }
    }
}
