package nnl.rocks.kactoos.iterator

import nnl.rocks.kactoos.test.BehavesAsIterator
import kotlin.test.Test

class SyncIteratorTest {

    @Test
    fun iterator() {
        BehavesAsIterator(
            SyncIterator(IteratorOf(1, 2, 3)),
            arrayOf(1, 2, 3)
        )
    }
}
