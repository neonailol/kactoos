package nnl.rocks.kactoos.iterator

import kotlin.test.*

class TailOfTest {

    @Test
    fun returnsTail() {
        val tailOf = TailOf(2, IteratorOf(1, 2, 3, 4))
        assertTrue(tailOf.hasNext())
        assertEquals(4, tailOf.next())
        assertTrue(tailOf.hasNext())
        assertEquals(3, tailOf.next())
        assertFalse(tailOf.hasNext())
        assertFailsWith(NoSuchElementException::class, { tailOf.next() })
    }
}
