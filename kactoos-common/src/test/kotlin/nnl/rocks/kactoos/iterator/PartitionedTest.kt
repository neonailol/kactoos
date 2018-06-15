package nnl.rocks.kactoos.iterator

import nnl.rocks.kactoos.test.BehavesAsIterator
import kotlin.test.Test

class PartitionedTest {

    @Test
    fun partition() {
        BehavesAsIterator(
            Partitioned(
                2,
                IteratorOf(1, 2, 3, 4)
            ),
            arrayOf(listOf(1, 2), listOf(3, 4))
        )
    }
}
