package nnl.rocks.kactoos.iterable

import kotlin.test.*

class ReversedTest {

    @Test
    fun reverses() {
        val reversed = Reversed(1, 2)
        for (i in 1 .. 3) {
            val iterator = reversed.iterator()
            assertTrue(iterator.hasNext())
            assertEquals(2, iterator.next())
            assertTrue(iterator.hasNext())
            assertEquals(1, iterator.next())
            assertFalse(iterator.hasNext())
            assertFailsWith(NoSuchElementException::class, { iterator.next() })
        }
    }
}
