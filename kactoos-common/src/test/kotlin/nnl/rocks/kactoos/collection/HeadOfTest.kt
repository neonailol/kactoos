package nnl.rocks.kactoos.collection

import nnl.rocks.kactoos.iterable.IterableOf
import nnl.rocks.kactoos.test.BehavesAsCollection
import kotlin.test.Test

class HeadOfTest {

    @Test
    fun headOfCollection() {
        BehavesAsCollection(
            HeadOf(2, listOf(1, 2, 3)),
            arrayOf(1, 2)
        )
    }

    @Test
    fun headOfVarargs() {
        BehavesAsCollection(
            HeadOf(2, 1, 2, 3),
            arrayOf(1, 2)
        )
    }

    @Test
    fun headOfIterable() {
        BehavesAsCollection(
            HeadOf(2, IterableOf(1, 2, 3)),
            arrayOf(1, 2)
        )
    }
}
