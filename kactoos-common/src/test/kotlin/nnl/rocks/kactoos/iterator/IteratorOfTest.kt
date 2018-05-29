package nnl.rocks.kactoos.iterator

import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith

class IteratorOfTest {

    @Test
    fun canIterateOverElements() {
        val iterator = IteratorOf('a', 'b', 'c')
        assertEquals('a', iterator.next())
        assertEquals('b', iterator.next())
        assertEquals('c', iterator.next())
        assertEquals(false, iterator.hasNext())
        assertFailsWith(NoSuchElementException::class, { iterator.next() })
    }
}
