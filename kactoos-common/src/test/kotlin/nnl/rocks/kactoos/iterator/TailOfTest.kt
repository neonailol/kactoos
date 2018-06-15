package nnl.rocks.kactoos.iterator

import nnl.rocks.kactoos.test.BehavesAsIterator
import kotlin.test.Test

class TailOfTest {

    @Test
    fun returnsTail() {
        BehavesAsIterator(
            TailOf(2, IteratorOf(1, 2, 3, 4)),
            arrayOf(3, 4)
        )
    }
}
