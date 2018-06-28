package nnl.rocks.kactoos.iterable

import nnl.rocks.kactoos.test.BehavesAsIterable
import kotlin.test.Test

class IterableOfCharsTest {

    @Test
    fun iterable() {
        BehavesAsIterable(
            IterableOfChars('a', 'b', 'c'),
            charArrayOf('a', 'b', 'c').toTypedArray()
        )
    }
}
