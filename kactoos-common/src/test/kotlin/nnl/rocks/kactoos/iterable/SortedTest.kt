package nnl.rocks.kactoos.iterable

import nnl.rocks.kactoos.test.BehavesAsIterable
import kotlin.test.Test

class SortedTest {

    @Test
    fun sortsVarargs() {
        BehavesAsIterable(
            Sorted(Comparator { a, b -> a.compareTo(b) }, 2, 1),
            arrayOf(1, 2)
        )
    }

    @Test
    fun sortsVarargsNaturalOrder() {
        BehavesAsIterable(
            Sorted(2, 1),
            arrayOf(1, 2)
        )
    }

    @Test
    fun sortsIterableNaturalOrder() {
        BehavesAsIterable(
            Sorted(IterableOf(1, 2)),
            arrayOf(1, 2)
        )
    }
}
