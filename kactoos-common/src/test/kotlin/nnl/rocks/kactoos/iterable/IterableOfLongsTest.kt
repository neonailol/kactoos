package nnl.rocks.kactoos.iterable

import nnl.rocks.kactoos.test.BehavesAsIterable
import kotlin.test.Test

class IterableOfLongsTest {

    @Test
    fun iterable() {
        BehavesAsIterable(
            IterableOfLongs(1L, 2L, 3L),
            longArrayOf(1L, 2L, 3L).toTypedArray()
        )
    }
}
