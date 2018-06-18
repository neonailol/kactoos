package nnl.rocks.kactoos.collection

import nnl.rocks.kactoos.test.BehavesAsCollection
import kotlin.test.Test

class HeadOfTest {

    @Test
    fun head() {
        BehavesAsCollection(
            HeadOf(2, listOf(1, 2, 3)),
            arrayOf(1, 2)
        )
    }
}
