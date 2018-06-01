package nnl.rocks.kactoos.iterator

import nnl.rocks.kactoos.iterable.IterableOf
import kotlin.test.*

class JoinedTest {

    @Test
    fun joinsArrayOfIterators() {
        val joined = Joined(
            intArrayOf(1, 2).iterator(),
            intArrayOf(3, 4).iterator()
        )
        for (i in 1 .. 4) {
            assertTrue(joined.hasNext())
            assertEquals(i, joined.next())
        }
        assertFalse(joined.hasNext())
        assertFailsWith(NoSuchElementException::class, { joined.next() })
    }

    @Test
    fun joinsIterableOfIterators() {
        val joined = Joined(
            IterableOf(
                intArrayOf(1, 2).iterator(),
                intArrayOf(3, 4).iterator()
            )

        )
        for (i in 1 .. 4) {
            assertTrue(joined.hasNext())
            assertEquals(i, joined.next())
        }
        assertFalse(joined.hasNext())
        assertFailsWith(NoSuchElementException::class, { joined.next() })
    }
}
