package nnl.rocks.kactoos.collection

import kotlin.test.Test
import kotlin.test.assertTrue

class ShuffledTest {

    @Test
    fun shuffles() {
        val shuffled = Shuffled(1, 2, 3)
        assertTrue(shuffled.size == 3)
        assertTrue(shuffled.contains(1))
        assertTrue(shuffled.contains(2))
        assertTrue(shuffled.contains(3))
    }
}
