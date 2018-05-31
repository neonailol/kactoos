package nnl.rocks.kactoos.list

import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

class JoinedTest {

    @Test
    fun joinsLists() {
        val joined = Joined(
            ListOf(1, 2),
            ListOf(3, 4)
        )
        assertEquals(4, joined.size, "Result size differ")
        assertTrue(joined.containsAll(listOf(1, 2, 3, 4)), "Result list does not contain all elements")
    }

    @Test
    fun joinsItemToList() {
        val joined = Joined(
            1,
            ListOf(2, 3)
        )
        assertEquals(3, joined.size, "Result size differ")
        assertTrue(joined.containsAll(listOf(1, 2, 3)), "Result list does not contain all elements")
    }
}
