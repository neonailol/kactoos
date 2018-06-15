package nnl.rocks.kactoos.iterable

import nnl.rocks.kactoos.test.BehavesAsIterable
import kotlin.test.Test

class HeadOfTest {

    @Test
    fun headOfVarargs() {
        BehavesAsIterable(
            HeadOf(2, "red", "lazy", "fox"),
            arrayOf("red", "lazy")
        )
    }

    @Test
    fun headOfIterable() {
        BehavesAsIterable(
            HeadOf(2, IterableOf("red", "lazy", "fox")),
            arrayOf("red", "lazy")
        )
    }
}
