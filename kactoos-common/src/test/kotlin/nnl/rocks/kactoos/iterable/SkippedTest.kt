package nnl.rocks.kactoos.iterable

import nnl.rocks.kactoos.test.BehavesAsIterable
import kotlin.test.Test

class SkippedTest {

    @Test
    fun skips() {
        BehavesAsIterable(
            Skipped(1, 1, 2, 3),
            arrayOf(2, 3)
        )
    }
}
