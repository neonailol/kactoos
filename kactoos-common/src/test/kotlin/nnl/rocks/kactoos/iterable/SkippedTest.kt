package nnl.rocks.kactoos.iterable

import kotlin.test.*

class SkippedTest {

    @Test
    fun skips() {
        val skipped = Skipped(1, 1, 2, 3)
        for (i in 1 .. 3) {
            val iterator = skipped.iterator()
            assertTrue(iterator.hasNext())
            assertEquals(2, iterator.next())
            assertTrue(iterator.hasNext())
            assertEquals(3, iterator.next())
            assertFalse(iterator.hasNext())
            assertFailsWith(NoSuchElementException::class, { iterator.next() })
        }
    }
}
