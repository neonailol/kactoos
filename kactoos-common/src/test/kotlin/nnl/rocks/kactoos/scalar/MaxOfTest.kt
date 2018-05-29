package nnl.rocks.kactoos.scalar

import nnl.rocks.kactoos.iterable.IterableOf
import kotlin.test.Test
import kotlin.test.assertEquals

class MaxOfTest {

    @Test
    fun integers() {
        assertEquals(
            4,
            MaxOf(1, 2, 3, 4).toInt()
        )
    }

    @Test
    fun longs() {
        assertEquals(
            4L,
            MaxOf(1L, 2L, 3L, 4L).toLong()
        )
    }

    @Test
    fun floats() {
        assertEquals(
            4.0f,
            MaxOf(1.0f, 2.0f, 3.0f, 4.0f).toFloat()
        )
    }

    @Test
    fun doubles() {
        assertEquals(
            4.0,
            MaxOf(1.0, 2.0, 3.0, 4.0).toDouble()
        )
    }

    @Test
    fun iterable() {
        assertEquals(
            4.0,
            MaxOf(
                IterableOf(doubleArrayOf(1.0, 2.0, 3.0, 4.0).iterator())
            ).toDouble()
        )
    }
}
