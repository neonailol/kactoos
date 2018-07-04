package nnl.rocks.kactoos.list

import nnl.rocks.kactoos.test.BehavesAsList
import kotlin.test.Test

class ListNoNullsTest {

    @Test
    fun behaves() {
        BehavesAsList(
            ListNoNulls(ListOf(1, 2, 3)),
            arrayOf(1, 2, 3)
        )
    }
}
