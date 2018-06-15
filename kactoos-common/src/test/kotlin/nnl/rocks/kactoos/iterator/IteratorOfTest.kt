package nnl.rocks.kactoos.iterator

import nnl.rocks.kactoos.test.BehavesAsIterator
import kotlin.test.Test

class IteratorOfTest {

    @Test
    fun canIterateOverElements() {
        BehavesAsIterator(
            IteratorOf('a', 'b', 'c'),
            arrayOf('a', 'b', 'c')
        )
    }
}
