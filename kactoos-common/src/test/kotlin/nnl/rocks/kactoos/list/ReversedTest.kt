package nnl.rocks.kactoos.list

import nnl.rocks.kactoos.test.BehavesAsList
import kotlin.test.Test

class ReversedTest {

    @Test
    fun reversesNumbers() {
        BehavesAsList(
            Reversed(ListOf(1, 2, 3)),
            arrayOf(3, 2, 1)
        )
    }
}
