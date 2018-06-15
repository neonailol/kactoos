package nnl.rocks.kactoos.iterator

import nnl.rocks.kactoos.test.BehavesAsIterator
import kotlin.test.Test

class RepeatedTest {

    @Test
    fun repeats() {
        BehavesAsIterator(
            Repeated(2, 1),
            arrayOf(1, 1)
        )
    }
}
