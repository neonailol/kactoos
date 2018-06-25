package nnl.rocks.kactoos.list

import kotlin.test.Test
import kotlin.test.assertEquals

class SortedTest {

    @Test
    fun sortsNumbers() {
        val sorted = Sorted(7, 6, 5)
        assertEquals(5, sorted[0])
        assertEquals(6, sorted[1])
        assertEquals(7, sorted[2])
    }

    @Test
    fun sortsUsingComparator() {
        val sorted = Sorted(
            Comparator { a: String, b: String -> a.first().compareTo(b.first()) },
            listOf("the", "red", "fox")
        )
        assertEquals("fox", sorted[0])
        assertEquals("red", sorted[1])
        assertEquals("the", sorted[2])
    }

    @Test
    fun sortsVarArgsUsingComparator() {
        val sorted = Sorted(
            Comparator { a, b -> a.first().compareTo(b.first()) },
            "the", "red", "fox"
        )
        assertEquals("fox", sorted[0])
        assertEquals("red", sorted[1])
        assertEquals("the", sorted[2])
    }

}
