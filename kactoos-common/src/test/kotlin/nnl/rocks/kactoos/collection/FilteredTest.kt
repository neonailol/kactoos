package nnl.rocks.kactoos.collection

import nnl.rocks.kactoos.func.FuncOf
import nnl.rocks.kactoos.test.BehavesAsCollection
import kotlin.test.Test

class FilteredTest {

    @Test
    fun filteredKFuncVarargs() {
        BehavesAsCollection(
            Filtered(
                { it -> it > 3 },
                1, 4, 8
            ),
            arrayOf(4, 8)
        )
    }

    @Test
    fun filteredFuncVarargs() {
        BehavesAsCollection(
            Filtered(
                FuncOf { it -> it > 3 },
                1, 4, 8
            ),
            arrayOf(4, 8)
        )
    }

    @Test
    fun filteredFuncIterable() {
        BehavesAsCollection(
            Filtered(
                FuncOf { it: Int -> it > 3 },
                CollectionOf(1, 4, 8)
            ),
            arrayOf(4, 8)
        )
    }
}
