package nnl.rocks.kactoos.list

import nnl.rocks.kactoos.test.BehavesAsList
import kotlin.test.Test

class SortedTest {

    @Test
    fun sortsNumbers() {
        BehavesAsList(
            Sorted(7, 6, 5),
            arrayOf(5, 6, 7)
        )
    }

    @Test
    fun sortsUsingComparator() {
        BehavesAsList(
            Sorted(
                Comparator { a: String, b: String -> a.first().compareTo(b.first()) },
                ListOf("the", "red", "fox")
            ),
            arrayOf("fox", "red", "the")
        )
    }

    @Test
    fun sortsVarArgsUsingComparator() {
        BehavesAsList(
            Sorted(
                Comparator { a: String, b: String -> a.first().compareTo(b.first()) },
                "the", "red", "fox"
            ),
            arrayOf("fox", "red", "the")
        )
    }

}
