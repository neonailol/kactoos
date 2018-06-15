package nnl.rocks.kactoos.iterator

import nnl.rocks.kactoos.test.BehavesAsIterator
import kotlin.test.Test

class IteratorOfCharsTest {

    @Test
    fun iterates() {
        BehavesAsIterator(
            IteratorOfChars('a', 'c'),
            arrayOf('a', 'c')
        )
    }
}
