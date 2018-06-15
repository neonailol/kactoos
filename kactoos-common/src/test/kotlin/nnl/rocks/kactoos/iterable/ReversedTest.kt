package nnl.rocks.kactoos.iterable

import nnl.rocks.kactoos.test.BehavesAsIterable
import kotlin.test.Test

class ReversedTest {

    @Test
    fun reverses() {
        BehavesAsIterable(
            Reversed(1, 2),
            arrayOf(2, 1)
        )
    }
}
