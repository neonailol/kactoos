package nnl.rocks.kactoos.iterator

import nnl.rocks.kactoos.test.BehavesAsIterator
import kotlin.test.Test

class EmptyIteratorTest {

    @Test
    fun iterator() {
        BehavesAsIterator(
            EmptyIterator<Unit>(),
            arrayOf()
        )
    }
}
