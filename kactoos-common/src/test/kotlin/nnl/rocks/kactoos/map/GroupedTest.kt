package nnl.rocks.kactoos.map

import nnl.rocks.kactoos.test.BehavesAsMap
import kotlin.test.Test

class GroupedTest {

    @Test
    fun groupsByChar() {
        BehavesAsMap(
            Grouped(
                listOf('a', 'b', 'c'),
                { c: Char -> c.toUpperCase() },
                { c: Char -> c.toString() }
            ),
            mapOf(
                'A' to listOf("a"),
                'B' to listOf("b"),
                'C' to listOf("c")
            )
        )
    }

    @Test
    fun groupsByIntegers() {
        BehavesAsMap(
            Grouped(
                listOf(2, 2, 3, 4, 4, 4, 5),
                { i: Int -> i },
                { i: Int -> i.toString() }
            ),
            mapOf(
                2 to listOf("2", "2"),
                3 to listOf("3"),
                4 to listOf("4", "4", "4"),
                5 to listOf("5")
            )
        )
    }
}
