package nnl.rocks.kactoos.list

import nnl.rocks.kactoos.collection.CollectionOf
import nnl.rocks.kactoos.iterable.IterableOf
import kotlin.test.Test
import kotlin.test.assertTrue

class ShuffledTest {

    @Test
    fun shufflesCollection() {
        val shuffled = Shuffled(CollectionOf(1, 2, 3))
        assertTrue(shuffled.size == 3)
        assertTrue(shuffled.contains(1))
        assertTrue(shuffled.contains(2))
        assertTrue(shuffled.contains(3))
    }

    @Test
    fun shufflesIterable() {
        val shuffled = Shuffled(IterableOf(1, 2, 3))
        assertTrue(shuffled.size == 3)
        assertTrue(shuffled.contains(1))
        assertTrue(shuffled.contains(2))
        assertTrue(shuffled.contains(3))
    }

    @Test
    fun shufflesVarargs() {
        val shuffled = Shuffled(1, 2, 3)
        assertTrue(shuffled.size == 3)
        assertTrue(shuffled.contains(1))
        assertTrue(shuffled.contains(2))
        assertTrue(shuffled.contains(3))
    }
}
