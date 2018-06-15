package nnl.rocks.kactoos.iterator

import nnl.rocks.kactoos.test.BehavesAsIterator
import kotlin.test.Test

class IteratorOfIntsTest {

    @Test
    fun iterates() {
        BehavesAsIterator(
            IteratorOfInts(1, 2),
            arrayOf(1, 2)
        )
    }
}
