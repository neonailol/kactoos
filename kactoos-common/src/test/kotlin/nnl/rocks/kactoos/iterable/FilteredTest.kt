package nnl.rocks.kactoos.iterable

import nnl.rocks.kactoos.Func
import nnl.rocks.kactoos.test.BehavesAsIterable
import kotlin.test.Test

class FilteredTest {

    @Test
    fun filtersVarargs() {
        BehavesAsIterable(
            Filtered(
                { x: String -> x.length < 4 },
                "red", "lazy", "fox"
            ),
            arrayOf("red", "fox")
        )
    }

    @Test
    fun filtersFunc() {
        BehavesAsIterable(
            Filtered(
                object : Func<String, Boolean> {
                    override fun apply(input: String): Boolean = input.length < 4
                },
                IterableOf("red", "lazy", "fox")
            ),
            arrayOf("red", "fox")
        )
    }
}
