package nnl.rocks.kactoos.iterator

import nnl.rocks.kactoos.test.BehavesAsIterator
import kotlin.test.Test

class IteratorNoNullsTest {

    @Test
    fun iterator() {
        BehavesAsIterator(
            IteratorNoNulls(
                IteratorOf(1, 2, 3)
            ),
            arrayOf(1, 2, 3)
        )
    }
}
