package nnl.rocks.kactoos.iterator

import nnl.rocks.kactoos.test.BehavesAsIterator
import kotlin.test.Test

class IteratorOfShortsTest {

    @Test
    fun iterates() {
        BehavesAsIterator(
            IteratorOfShorts(1, 2),
            arrayOf(1.toShort(), 2.toShort())
        )
    }
}
