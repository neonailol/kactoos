package nnl.rocks.kactoos.iterable

import nnl.rocks.kactoos.list.ListOf
import nnl.rocks.kactoos.test.BehavesAsIterable
import kotlin.test.Test

class IterableNoNullsTest {

    @Test
    fun fromEnvelope() {
        BehavesAsIterable(
            IterableNoNulls(IterableOf(1, 2, 3)),
            arrayOf(1, 2, 3)
        )
    }

    @Test
    fun fromIterable() {
        BehavesAsIterable(
            IterableNoNulls(ListOf(1, 2, 3)),
            arrayOf(1, 2, 3)
        )
    }
}
