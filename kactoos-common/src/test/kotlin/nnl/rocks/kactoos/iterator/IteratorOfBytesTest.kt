package nnl.rocks.kactoos.iterator

import nnl.rocks.kactoos.test.BehavesAsIterator
import kotlin.test.*

class IteratorOfBytesTest {

    @Test
    fun iterates() {
        BehavesAsIterator(
            IteratorOfBytes(1, 2),
            arrayOf(1.toByte(), 2.toByte())
        )
    }
}
