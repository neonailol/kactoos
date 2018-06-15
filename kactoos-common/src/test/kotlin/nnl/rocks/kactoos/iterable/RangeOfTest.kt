package nnl.rocks.kactoos.iterable

import nnl.rocks.kactoos.test.BehavesAsIterable
import kotlin.test.Test

class RangeOfTest {

    @Test
    fun range() {
        BehavesAsIterable(
            RangeOf(0, 2) { v -> v + 1 },
            arrayOf(0, 1, 2)
        )
    }
}
