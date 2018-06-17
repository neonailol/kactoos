package nnl.rocks.kactoos.iterator

import nnl.rocks.kactoos.test.BehavesAsIterator
import kotlin.test.Test

class ImmutableTest {

    @Test
    fun iterator() {
        BehavesAsIterator(
            Immutable(
                IteratorOf(1, 2, 3)
            ),
            arrayOf(1, 2, 3)
        )
    }
}
