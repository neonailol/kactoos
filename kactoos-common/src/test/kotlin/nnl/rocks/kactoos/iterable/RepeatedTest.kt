package nnl.rocks.kactoos.iterable

import nnl.rocks.kactoos.test.BehavesAsIterable
import kotlin.test.Test

class RepeatedTest {

    @Test
    fun repeats() {
        BehavesAsIterable(
            Repeated(2, 1),
            arrayOf(1, 1)
        )
    }
}
