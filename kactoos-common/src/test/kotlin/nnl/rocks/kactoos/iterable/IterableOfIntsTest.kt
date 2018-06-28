package nnl.rocks.kactoos.iterable

import nnl.rocks.kactoos.test.BehavesAsIterable
import kotlin.test.Test

class IterableOfIntsTest {

    @Test
    fun iterable() {
        BehavesAsIterable(
            IterableOfInts(1, 2, 3),
            intArrayOf(1, 2, 3).toTypedArray()
        )
    }
}
