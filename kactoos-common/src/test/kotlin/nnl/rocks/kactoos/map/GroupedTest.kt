package nnl.rocks.kactoos.map

import kotlin.test.Test
import kotlin.test.assertTrue

class GroupedTest {

    @Test
    fun groups() {
        val grouped = Grouped(
            listOf('a', 'b', 'c'),
            { c: Char -> c.toUpperCase() },
            { x: Char -> x.toString() }
        )
        assertTrue(grouped['A']?.containsAll(listOf("a")) ?: false)
    }
}
