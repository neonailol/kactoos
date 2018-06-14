package nnl.rocks.kactoos.iterator

import nnl.rocks.kactoos.iterable.EmptyIterable
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith
import kotlin.test.assertTrue

class CycledTest {

    @Test
    fun cyclesIterable() {
        val cycled = Cycled { listOf(0, 1, 2) }
        for (i in 0 .. 10) {
            assertTrue(cycled.hasNext())
            assertEquals(i % 3, cycled.next())
        }
    }

    @Test
    fun cantCycleEmptyIterator() {
        assertFailsWith(NoSuchElementException::class) {
            Cycled(EmptyIterable<Unit>()).next()
        }
    }

}
