package nnl.rocks.kactoos.iterable

import nnl.rocks.kactoos.test.BehavesAsIterable
import kotlin.test.Test

class TailOfTest {

    @Test
    fun tail() {
        BehavesAsIterable(
            TailOf(2, 1, 2, 3, 4),
            arrayOf(3, 4)
        )
    }
}
