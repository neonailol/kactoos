package nnl.rocks.kactoos.iterable

import kotlin.test.Test
import kotlin.test.assertTrue

class ShuffledTest {

    @Test
    fun shuffles() {
        val values = arrayOf(1, 2, 3)
        val shuffled = Shuffled(1, 2, 3)
        for (i in 0 .. 3) {
            for (item in shuffled) {
                assertTrue(values.contains(item), "Source array does not contain this value: $item")
            }
        }
    }
}
