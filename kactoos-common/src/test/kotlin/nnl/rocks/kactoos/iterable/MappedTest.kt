package nnl.rocks.kactoos.iterable

import nnl.rocks.kactoos.test.BehavesAsIterable
import kotlin.test.Test

class MappedTest {

    @Test
    fun mapsVarargs() {
        BehavesAsIterable(
            Mapped(
                { x: Int -> x.toString() },
                1, 2, 3
            ),
            arrayOf("1", "2", "3")
        )
    }
}
