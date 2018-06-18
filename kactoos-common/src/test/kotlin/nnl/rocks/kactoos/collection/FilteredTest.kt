package nnl.rocks.kactoos.collection

import nnl.rocks.kactoos.test.BehavesAsCollection
import kotlin.test.Test

class FilteredTest {

    @Test
    fun filtered() {
        BehavesAsCollection(
            Filtered(
                { it -> it > 3 },
                1, 4, 8
            ),
            arrayOf(4, 8)
        )
    }
}
