package nnl.rocks.kactoos.collection

import nnl.rocks.kactoos.func.FuncOf
import nnl.rocks.kactoos.iterable.IterableOf
import nnl.rocks.kactoos.test.BehavesAsCollection
import kotlin.test.Test

class MappedTest {

    @Test
    fun mappedKFuncVarargs() {
        BehavesAsCollection(
            Mapped(
                { x -> x.toString() },
                1, 2, 3
            ),
            arrayOf("1", "2", "3")
        )
    }

    @Test
    fun mappedKFuncIterable() {
        BehavesAsCollection(
            Mapped(
                { x: Int -> x.toString() },
                IterableOf(1, 2, 3)
            ),
            arrayOf("1", "2", "3")
        )
    }

    @Test
    fun mappedFuncVarargs() {
        BehavesAsCollection(
            Mapped(
                FuncOf { x -> x.toString() },
                1, 2, 3
            ),
            arrayOf("1", "2", "3")
        )
    }

    @Test
    fun mappedFuncIterable() {
        BehavesAsCollection(
            Mapped(
                FuncOf { x: Int -> x.toString() },
                IterableOf(1, 2, 3)
            ),
            arrayOf("1", "2", "3")
        )
    }

    @Test
    fun mappedFuncCollection() {
        BehavesAsCollection(
            Mapped(
                FuncOf { x: Int -> x.toString() },
                CollectionOf(1, 2, 3)
            ),
            arrayOf("1", "2", "3")
        )
    }
}
