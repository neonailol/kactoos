package nnl.rocks.kactoos.list

import nnl.rocks.kactoos.iterable.IterableOf
import nnl.rocks.kactoos.test.BehavesAsList
import kotlin.test.Test

class ListOfTest {

    @Test
    fun fromIterable() {
        BehavesAsList(
            ListOf(IterableOf(1, 2, 3)),
            arrayOf(1, 2, 3)
        )
    }

    @Test
    fun fromVarargs() {
        BehavesAsList(
            ListOf(1, 2, 3),
            arrayOf(1, 2, 3)
        )
    }
}
