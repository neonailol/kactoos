package nnl.rocks.kactoos.iterable

import nnl.rocks.kactoos.iterator.IteratorOf
import nnl.rocks.kactoos.list.ListOf
import kotlin.test.*

class JoinedTest {

    @Test
    fun joinsLists() {
        val joined = Joined(
            ListOf(1),
            ListOf(3)
        ).iterator()

        assertTrue(joined.hasNext())
        assertEquals(1, joined.next())
        assertTrue(joined.hasNext())
        assertEquals(3, joined.next())
        assertFalse(joined.hasNext())
        assertFailsWith(NoSuchElementException::class) { joined.next() }
    }

    @Test
    fun joinsIterator() {
        val joined = Joined(
            IteratorOf(ListOf(1), ListOf(3))
        ).iterator()

        assertTrue(joined.hasNext())
        assertEquals(1, joined.next())
        assertTrue(joined.hasNext())
        assertEquals(3, joined.next())
        assertFalse(joined.hasNext())
        assertFailsWith(NoSuchElementException::class) { joined.next() }
    }

}
