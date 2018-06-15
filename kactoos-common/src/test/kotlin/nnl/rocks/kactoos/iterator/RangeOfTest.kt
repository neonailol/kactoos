package nnl.rocks.kactoos.iterator

import nnl.rocks.kactoos.test.BehavesAsIterator
import kotlin.test.Test

class RangeOfTest {

    @Test
    fun range() {
        BehavesAsIterator(
            RangeOf(0, 2) { v -> v + 1 },
            arrayOf(0, 1, 2)
        )
    }
}
