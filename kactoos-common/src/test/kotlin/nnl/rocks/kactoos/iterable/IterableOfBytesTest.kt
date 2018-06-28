package nnl.rocks.kactoos.iterable

import nnl.rocks.kactoos.test.BehavesAsIterable
import kotlin.test.Test

class IterableOfBytesTest {

    @Test
    fun iterable() {
        BehavesAsIterable(
            IterableOfBytes(1, 2, 3),
            byteArrayOf(1, 2, 3).toTypedArray()
        )
    }
}
