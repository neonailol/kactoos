package nnl.rocks.kactoos.iterator

import kotlin.test.*

class SkippedTest {

    @Test
    fun skips() {
        val skipped = Skipped(1, IteratorOf(1, 2, 3))
        assertTrue(skipped.hasNext())
        assertEquals(2, skipped.next())
        assertTrue(skipped.hasNext())
        assertEquals(3, skipped.next())
        assertFalse(skipped.hasNext())
        assertFailsWith(NoSuchElementException::class, { skipped.next() })
    }
}
