package nnl.rocks.kactoos.collection

import nnl.rocks.kactoos.test.BehavesAsCollection
import kotlin.test.Test

class ReversedTest {

    @Test
    fun reversesVarargs() {
        BehavesAsCollection(
            Reversed(1, 2, 3),
            arrayOf(3, 2, 1)
        )
    }
}
