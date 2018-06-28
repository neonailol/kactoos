package nnl.rocks.kactoos.collection

import nnl.rocks.kactoos.iterable.IterableOf
import nnl.rocks.kactoos.test.BehavesAsCollection
import kotlin.test.Test

class SortedTest {

    @Test
    fun sortsNaturalVarargs() {
        BehavesAsCollection(
            Sorted(3, 2, 1),
            arrayOf(1, 2, 3)
        )
    }

    @Test
    fun sortsNaturalIterable() {
        BehavesAsCollection(
            Sorted(IterableOf(3, 2, 1)),
            arrayOf(1, 2, 3)
        )
    }

    @Test
    fun sortsVarargs() {
        BehavesAsCollection(
            Sorted(
                Comparator { a: Int, b: Int -> a.compareTo(b) },
                3, 2, 1
            ),
            arrayOf(1, 2, 3)
        )
    }

    @Test
    fun sortsIterable() {
        BehavesAsCollection(
            Sorted(
                Comparator { a: Int, b: Int -> a.compareTo(b) },
                IterableOf(3, 2, 1)
            ),
            arrayOf(1, 2, 3)
        )
    }
}
