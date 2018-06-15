package nnl.rocks.kactoos.iterator

import nnl.rocks.kactoos.test.BehavesAsIterator
import kotlin.test.Test

class SkippedTest {

    @Test
    fun skips() {
        BehavesAsIterator(
            Skipped(1, IteratorOf(1, 2, 3)),
            arrayOf(2, 3)
        )
    }
}
