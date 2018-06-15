package nnl.rocks.kactoos.iterator

import nnl.rocks.kactoos.test.BehavesAsIterator
import kotlin.test.Test

class MappedTest {

    @Test
    fun maps() {
        BehavesAsIterator(
            Mapped(
                { x: Int -> x.toString() },
                IteratorOf(1, 2)
            ),
            arrayOf("1", "2")
        )
    }
}
