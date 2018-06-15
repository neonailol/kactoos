package nnl.rocks.kactoos.iterator

import nnl.rocks.kactoos.test.BehavesAsIterator
import kotlin.test.Test

class HeadOfTest {

    @Test
    fun headOfIterator() {
        BehavesAsIterator(
            HeadOf(2, listOf(1, 2, 3).iterator()),
            arrayOf(1, 2)
        )
    }
}
