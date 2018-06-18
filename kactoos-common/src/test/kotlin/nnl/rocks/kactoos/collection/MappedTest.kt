package nnl.rocks.kactoos.collection

import nnl.rocks.kactoos.iterable.IterableOf
import nnl.rocks.kactoos.test.BehavesAsCollection
import kotlin.test.Test

class MappedTest {

    @Test
    fun mappedVarargs() {
        BehavesAsCollection(
            Mapped(
                { x -> x.toString() },
                1, 2, 3
            ),
            arrayOf("1", "2", "3")
        )
    }

    @Test
    fun mappedIterable() {
        BehavesAsCollection(
            Mapped(
                { x: Int -> x.toString() },
                IterableOf(1, 2, 3)
            ),
            arrayOf("1", "2", "3")
        )
    }
}
