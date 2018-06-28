package nnl.rocks.kactoos.iterable

import nnl.rocks.kactoos.test.BehavesAsIterable
import kotlin.test.Test

class IterableOfBooleansTest {

    @Test
    fun iterable() {
        BehavesAsIterable(
            IterableOfBooleans(true, false, true),
            arrayOf(true, false, true)
        )
    }
}
