package nnl.rocks.kactoos.iterator

import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith

class HeadOfTest {

    @Test
    fun headOfIterator() {
        val headOf = HeadOf(2, listOf(1, 2, 3).iterator())
        assertEquals(true, headOf.hasNext())
        assertEquals(1, headOf.next())
        assertEquals(true, headOf.hasNext())
        assertEquals(2, headOf.next())
        assertEquals(false, headOf.hasNext())
        assertFailsWith(NoSuchElementException::class, { headOf.next() })
    }
}
