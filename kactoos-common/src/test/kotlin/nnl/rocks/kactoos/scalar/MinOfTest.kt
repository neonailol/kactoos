package nnl.rocks.kactoos.scalar

import kotlin.test.Test
import kotlin.test.assertEquals

class MinOfTest {

    @Test
    fun integers() {
        assertEquals(
            1,
            MinOf(1, 2, 3, 4).toInt()
        )
    }

    @Test
    fun longs() {
        assertEquals(
            1L,
            MinOf(1L, 2L, 3L, 4L).toLong()
        )
    }

    @Test
    fun floats() {
        assertEquals(
            1.0f,
            MinOf(1.0f, 2.0f, 3.0f, 4.0f).toFloat()
        )
    }

    @Test
    fun doubles() {
        assertEquals(
            1.0,
            MinOf(1.0, 2.0, 3.0, 4.0).toDouble()
        )
    }

    @Test
    fun iterable() {
        assertEquals(
            1.0,
            MinOf(
                Iterable {
                    doubleArrayOf(1.0, 2.0, 3.0, 4.0).iterator()
                }
            ).toDouble()
        )
    }
}
