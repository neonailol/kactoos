package nnl.rocks.kactoos.iterable

import nnl.rocks.kactoos.test.BehavesAsIterable
import kotlin.test.Test

class IterableOfShortsTest {

    @Test
    fun iterable() {
        BehavesAsIterable(
            IterableOfShorts(1, 2, 3),
            shortArrayOf(1, 2, 3).toTypedArray()
        )
    }
}
