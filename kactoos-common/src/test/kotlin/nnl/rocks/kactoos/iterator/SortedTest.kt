package nnl.rocks.kactoos.iterator

import nnl.rocks.kactoos.test.BehavesAsIterator
import kotlin.test.Test

class SortedTest {

    @Test
    fun sortedNumbers() {
        BehavesAsIterator(
            Sorted(IteratorOf(3, 2, 1)),
            arrayOf(1, 2, 3)
        )
    }

    @Test
    fun sortsUsingComparator() {
        BehavesAsIterator(
            Sorted(
                Comparator { a, b -> a.first().compareTo(b.first()) },
                IteratorOf("the", "red", "fox")
            ),
            arrayOf("fox", "red", "the")
        )
    }

}
