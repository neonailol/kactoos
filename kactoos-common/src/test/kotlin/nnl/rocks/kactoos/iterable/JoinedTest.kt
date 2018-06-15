package nnl.rocks.kactoos.iterable

import nnl.rocks.kactoos.list.ListOf
import nnl.rocks.kactoos.test.BehavesAsIterable
import kotlin.test.Test

class JoinedTest {

    @Test
    fun joinsLists() {
        BehavesAsIterable(
            Joined(
                ListOf(1),
                ListOf(3)
            ),
            arrayOf(1, 3)
        )
    }

}
