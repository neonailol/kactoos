package nnl.rocks.kactoos.iterator

import nnl.rocks.kactoos.iterable.IterableOf
import nnl.rocks.kactoos.test.BehavesAsIterator
import kotlin.test.Test

class JoinedTest {

    @Test
    fun joinsArrayOfIterators() {
        BehavesAsIterator(
            Joined(
                intArrayOf(1, 2).iterator(),
                intArrayOf(3, 4).iterator()
            ),
            arrayOf(1, 2, 3, 4)
        )
    }

    @Test
    fun joinsIterableOfIterators() {
        BehavesAsIterator(
            Joined(
                IterableOf(
                    intArrayOf(1, 2).iterator(),
                    intArrayOf(3, 4).iterator()
                )
            ),
            arrayOf(1, 2, 3, 4)
        )
    }
}
