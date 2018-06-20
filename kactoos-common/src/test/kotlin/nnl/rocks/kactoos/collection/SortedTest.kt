package nnl.rocks.kactoos.collection

import nnl.rocks.kactoos.test.BehavesAsCollection
import kotlin.test.Test

class SortedTest {

    @Test
    fun sorts() {
        BehavesAsCollection(
            Sorted(3, 2, 1),
            arrayOf(1, 2, 3)
        )
    }
}
