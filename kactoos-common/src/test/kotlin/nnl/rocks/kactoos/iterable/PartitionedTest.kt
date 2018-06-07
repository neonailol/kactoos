package nnl.rocks.kactoos.iterable

import kotlin.test.*

class PartitionedTest {

    @Test
    fun partitionIterable() {
        val partitioned = Partitioned(
            2,
            IterableOf(1, 2, 3, 4)
        ).iterator()
        assertTrue(partitioned.hasNext())
        assertEquals(listOf(1, 2), partitioned.next())
        assertTrue(partitioned.hasNext())
        assertEquals(listOf(3, 4), partitioned.next())
        assertFalse(partitioned.hasNext())
        assertFailsWith(NoSuchElementException::class, { partitioned.next() })
    }

    @Test
    fun partitionVarargs() {
        val partitioned = Partitioned(
            2,
            1, 2, 3, 4
        ).iterator()
        assertTrue(partitioned.hasNext())
        assertEquals(listOf(1, 2), partitioned.next())
        assertTrue(partitioned.hasNext())
        assertEquals(listOf(3, 4), partitioned.next())
        assertFalse(partitioned.hasNext())
        assertFailsWith(NoSuchElementException::class, { partitioned.next() })
    }
}
