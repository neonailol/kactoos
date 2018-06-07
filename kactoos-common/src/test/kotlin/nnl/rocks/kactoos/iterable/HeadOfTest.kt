package nnl.rocks.kactoos.iterable

import kotlin.test.*

class HeadOfTest {

    @Test
    fun headOfVarargs() {
        val headOf = HeadOf(2, "red", "lazy", "fox").iterator()
        assertTrue(headOf.hasNext())
        assertEquals("red", headOf.next())
        assertTrue(headOf.hasNext())
        assertEquals("lazy", headOf.next())
        assertFalse(headOf.hasNext())
        assertFailsWith(NoSuchElementException::class) { headOf.next() }
    }

    @Test
    fun headOfIterable() {
        val headOf = HeadOf(2, IterableOf("red", "lazy", "fox")).iterator()
        assertTrue(headOf.hasNext())
        assertEquals("red", headOf.next())
        assertTrue(headOf.hasNext())
        assertEquals("lazy", headOf.next())
        assertFalse(headOf.hasNext())
        assertFailsWith(NoSuchElementException::class) { headOf.next() }
    }
}
