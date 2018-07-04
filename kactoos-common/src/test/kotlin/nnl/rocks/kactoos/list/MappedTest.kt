package nnl.rocks.kactoos.list

import nnl.rocks.kactoos.collection.CollectionOf
import nnl.rocks.kactoos.func.FuncOf
import nnl.rocks.kactoos.iterable.IterableOf
import nnl.rocks.kactoos.test.BehavesAsList
import kotlin.test.Test

class MappedTest {

    @Test
    fun mapsKFuncCollection() {
        BehavesAsList(
            Mapped(
                { value: Int -> value.toString() },
                CollectionOf(1, 2, 3)
            ),
            arrayOf("1", "2", "3")
        )
    }

    @Test
    fun mapsKFuncIterable() {
        BehavesAsList(
            Mapped(
                { value: Int -> value.toString() },
                IterableOf(1, 2, 3)
            ),
            arrayOf("1", "2", "3")
        )
    }

    @Test
    fun mapsKFuncVarargs() {
        BehavesAsList(
            Mapped(
                { value: Int -> value.toString() },
                1, 2, 3
            ),
            arrayOf("1", "2", "3")
        )
    }

    @Test
    fun mapsFuncCollection() {
        BehavesAsList(
            Mapped(
                FuncOf { value: Int -> value.toString() },
                CollectionOf(1, 2, 3)
            ),
            arrayOf("1", "2", "3")
        )
    }

    @Test
    fun mapsFuncIterable() {
        BehavesAsList(
            Mapped(
                FuncOf { value: Int -> value.toString() },
                IterableOf(1, 2, 3)
            ),
            arrayOf("1", "2", "3")
        )
    }

    @Test
    fun mapsFuncVarargs() {
        BehavesAsList(
            Mapped(
                FuncOf { value: Int -> value.toString() },
                1, 2, 3
            ),
            arrayOf("1", "2", "3")
        )
    }
}
