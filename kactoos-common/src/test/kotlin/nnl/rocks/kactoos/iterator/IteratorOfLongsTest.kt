package nnl.rocks.kactoos.iterator

import nnl.rocks.kactoos.test.BehavesAsIterator
import kotlin.test.Test

class IteratorOfLongsTest {

    @Test
    fun iterates() {
        BehavesAsIterator(
            IteratorOfLongs(1L, 2L),
            arrayOf(1L, 2L)
        )
    }
}
