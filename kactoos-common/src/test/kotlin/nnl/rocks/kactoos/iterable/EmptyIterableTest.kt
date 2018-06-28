package nnl.rocks.kactoos.iterable

import nnl.rocks.kactoos.test.BehavesAsIterable
import kotlin.test.Test

class EmptyIterableTest {

    @Test
    fun empty() {
        BehavesAsIterable(
            EmptyIterable(),
            arrayOf()
        )
    }
}
