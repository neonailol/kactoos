package nnl.rocks.kactoos.iterator

import nnl.rocks.kactoos.test.BehavesAsIterator
import kotlin.test.Test

class IteratorOfFloatsTest {

    @Test
    fun iterates() {
        BehavesAsIterator(
            IteratorOfFloats(1.0f, 2.0f),
            arrayOf(1.0f, 2.0f)
        )
    }
}
