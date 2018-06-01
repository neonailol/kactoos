package nnl.rocks.kactoos.iterator

import kotlin.test.*

class RepeatedTest {

    @Test
    fun repeats() {
        val repeated = Repeated(2, 1)
        assertTrue(repeated.hasNext())
        assertEquals(1, repeated.next())
        assertTrue(repeated.hasNext())
        assertEquals(1, repeated.next())
        assertFalse(repeated.hasNext())
        assertFailsWith(NoSuchElementException::class, { repeated.next() })
    }
}
