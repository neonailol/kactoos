package nnl.rocks.kactoos.map

import kotlin.test.Test
import kotlin.test.assertTrue

class GroupedTest {

    @Test
    fun groupsByChar() {
        val grouped = Grouped(
            listOf('a', 'b', 'c'),
            { c: Char -> c.toUpperCase() },
            { c: Char -> c.toString() }
        )
        assertTrue(grouped['A']?.containsAll(listOf("a")) ?: false)
    }

    @Test
    fun groupsByIntegers() {
        val grouped = Grouped(
            listOf(2, 2, 3, 4, 5),
            { i: Int -> i },
            { i: Int -> i.toString() }
        )
        assertTrue(grouped[2]?.containsAll(listOf("2", "2")) ?: false)
    }
}
