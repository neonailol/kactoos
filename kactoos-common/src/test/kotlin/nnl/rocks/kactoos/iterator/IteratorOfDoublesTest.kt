package nnl.rocks.kactoos.iterator

import nnl.rocks.kactoos.test.BehavesAsIterator
import kotlin.test.Test

class IteratorOfDoublesTest {

    @Test
    fun iterates() {
        BehavesAsIterator(
            IteratorOfDoubles(1.0, 2.0),
            arrayOf(1.0, 2.0)
        )
    }
}
