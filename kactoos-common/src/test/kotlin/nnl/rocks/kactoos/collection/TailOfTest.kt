package nnl.rocks.kactoos.collection

import nnl.rocks.kactoos.test.BehavesAsCollection
import kotlin.test.Test

class TailOfTest {

    @Test
    fun tail() {
        BehavesAsCollection(
            TailOf(2, 1, 2, 3),
            arrayOf(2, 3)
        )
    }
}
