package nnl.rocks.kactoos.collection

import nnl.rocks.kactoos.test.BehavesAsCollection
import kotlin.test.Test

class SkippedTest {

    @Test
    fun skips() {
        BehavesAsCollection(
            Skipped(1, 2, 3, 4),
            arrayOf(3, 4)
        )
    }
}
