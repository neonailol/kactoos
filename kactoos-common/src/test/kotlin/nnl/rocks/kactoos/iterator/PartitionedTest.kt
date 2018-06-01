package nnl.rocks.kactoos.iterator

import kotlin.test.*

class PartitionedTest {

    @Test
    fun partition() {
        val partitioned = Partitioned(
            2,
            IteratorOf(1, 2, 3, 4)
        )
        assertTrue(partitioned.hasNext())
        assertEquals(listOf(1, 2), partitioned.next())
        assertTrue(partitioned.hasNext())
        assertEquals(listOf(3, 4), partitioned.next())
        assertFalse(partitioned.hasNext())
        assertFailsWith(NoSuchElementException::class, { partitioned.next() })
    }
}
