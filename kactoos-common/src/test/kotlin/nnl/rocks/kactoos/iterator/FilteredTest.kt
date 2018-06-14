package nnl.rocks.kactoos.iterator

import nnl.rocks.kactoos.test.BehavesAsIterator
import kotlin.test.*

class FilteredTest {

    @Test
    fun filters() {
        BehavesAsIterator(
            Filtered(
                { input -> input.length < 4 },
                IteratorOf("red", "lazy", "fox")
            ),
            arrayOf("red", "fox")
        )
    }
}
