package nnl.rocks.kactoos.iterable

import nnl.rocks.kactoos.test.BehavesAsIterable
import kotlin.test.Test

class IterableOfFloatsTest {

    @Test
    fun iterable() {
        BehavesAsIterable(
            IterableOfFloats(1.0f, 2.0f, 3.0f),
            floatArrayOf(1.0f, 2.0f, 3.0f).toTypedArray()
        )
    }
}
