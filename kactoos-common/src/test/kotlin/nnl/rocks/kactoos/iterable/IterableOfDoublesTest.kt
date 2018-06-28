package nnl.rocks.kactoos.iterable

import nnl.rocks.kactoos.test.BehavesAsIterable
import kotlin.test.Test

class IterableOfDoublesTest {

    @Test
    fun iterable() {
        BehavesAsIterable(
            IterableOfDoubles(1.0, 2.0, 3.0),
            doubleArrayOf(1.0, 2.0, 3.0).toTypedArray()
        )
    }
}
