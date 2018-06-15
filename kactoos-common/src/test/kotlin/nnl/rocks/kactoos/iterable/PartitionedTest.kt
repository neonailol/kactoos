package nnl.rocks.kactoos.iterable

import nnl.rocks.kactoos.test.BehavesAsIterable
import kotlin.test.Test

class PartitionedTest {

    @Test
    fun partitionIterable() {
        BehavesAsIterable(
            Partitioned(
                2,
                IterableOf(1, 2, 3, 4)
            ),
            arrayOf(listOf(1, 2), listOf(3, 4))
        )
    }

    @Test
    fun partitionVarargs() {
        BehavesAsIterable(
            Partitioned(
                2,
                1, 2, 3, 4
            ),
            arrayOf(listOf(1, 2), listOf(3, 4))
        )
    }
}
