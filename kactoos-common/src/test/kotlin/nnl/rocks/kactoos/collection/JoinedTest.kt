package nnl.rocks.kactoos.collection

import nnl.rocks.kactoos.test.BehavesAsCollection
import kotlin.test.Test

class JoinedTest {

    @Test
    fun joinedLists() {
        BehavesAsCollection(
            Joined(listOf(1, 2), listOf(3, 4)),
            arrayOf(1, 2, 3, 4)
        )
    }
}
