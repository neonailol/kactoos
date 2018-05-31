package nnl.rocks.kactoos.iterator

import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith

class CycledTest {

    @Test
    fun cycles() {
        val cycled = Cycled(listOf(0, 1, 2))
        for (i in 0 .. 10) {
            assertEquals(i % 3, cycled.next())
        }
    }

    @Test
    fun empty() {
        assertFailsWith(NoSuchElementException::class, {
            Cycled { EmptyIterator<Unit>() }.next()
        })
    }
}
