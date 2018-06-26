package nnl.rocks.kactoos.iterator

import nnl.rocks.kactoos.func.FuncOf
import nnl.rocks.kactoos.test.BehavesAsIterator
import kotlin.test.Test

class FilteredTest {

    @Test
    fun filtersUsingKFunc() {
        BehavesAsIterator(
            Filtered(
                { input -> input.length < 4 },
                IteratorOf("red", "lazy", "fox")
            ),
            arrayOf("red", "fox")
        )
    }

    @Test
    fun filtersUsingFunc() {
        BehavesAsIterator(
            Filtered(
                FuncOf { input -> input.length < 4 },
                IteratorOf("red", "lazy", "fox")
            ),
            arrayOf("red", "fox")
        )
    }

    @Test
    fun filtersPredicateAlwaysFalse() {
        BehavesAsIterator(
            Filtered(
                { false },
                IteratorOf("red", "lazy", "fox")
            ),
            arrayOf()
        )
    }

    @Test
    fun filtersPredicateAlwaysTrue() {
        BehavesAsIterator(
            Filtered(
                { true },
                IteratorOf("red", "lazy", "fox")
            ),
            arrayOf("red", "lazy", "fox")
        )
    }

    @Test
    fun filtersEmptyIterator() {
        BehavesAsIterator(
            Filtered(
                { true },
                EmptyIterator()
            ),
            arrayOf()
        )
    }
}
