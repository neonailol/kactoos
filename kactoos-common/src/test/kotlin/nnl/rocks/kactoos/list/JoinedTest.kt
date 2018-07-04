package nnl.rocks.kactoos.list

import nnl.rocks.kactoos.test.BehavesAsList
import kotlin.test.Test

class JoinedTest {

    @Test
    fun joinsLists() {
        BehavesAsList(
            Joined(
                ListOf(1, 2),
                ListOf(3, 4)
            ),
            arrayOf(1, 2, 3, 4)
        )
    }

    @Test
    fun joinsItemToList() {
        BehavesAsList(
            Joined(
                1,
                ListOf(2, 3)
            ),
            arrayOf(1, 2, 3)
        )
    }
}
