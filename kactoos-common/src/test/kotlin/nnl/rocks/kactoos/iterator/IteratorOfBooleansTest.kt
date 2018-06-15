package nnl.rocks.kactoos.iterator

import nnl.rocks.kactoos.test.BehavesAsIterator
import kotlin.test.Test

class IteratorOfBooleansTest {

    @Test
    fun iterates() {
        BehavesAsIterator(
            IteratorOfBooleans(true, false),
            arrayOf(true, false)
        )
    }
}
