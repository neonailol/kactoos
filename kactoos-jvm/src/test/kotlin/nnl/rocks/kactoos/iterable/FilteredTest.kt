package nnl.rocks.kactoos.iterable

import nnl.rocks.kactoos.func.FuncOf
import org.hamcrest.MatcherAssert
import org.hamcrest.Matchers
import org.junit.Test

/**
 * Test case for [Filtered].
 *
 *
 * @since 0.1
 *
 *
 */
class FilteredTest {

    @Test
    fun filtersList() {
        MatcherAssert.assertThat(
            "Can't calculate the length of an iterable",
            LengthOf(
                Filtered(
                    FuncOf<String, Boolean> { input -> input.length > 4 }, IterableOf(
                    "hello", "world", "друг"
                )
                )
            ).toInt(),
            Matchers.equalTo(2)
        )
    }

    @Test
    fun filtersEmptyList() {
        MatcherAssert.assertThat(
            "Can't calculate the length of an empty iterable",
            LengthOf(
                Filtered(
                    FuncOf<String, Boolean> { input -> input.length > 1 },
                    IterableOf()
                )
            ).toInt(),
            Matchers.equalTo(0)
        )
    }

    @Test
    fun filtersIterablesWithSize() {
        val list = Filtered(
            (FuncOf<Int, Boolean> { i -> i > 0 }),
            IterableOf(1, 2, - 1, 0, 1)
        )
        MatcherAssert.assertThat<Iterable<Int>>(
            "Can't filter the iterable twice",
            list, Matchers.iterableWithSize(3)
        )
        MatcherAssert.assertThat<Iterable<Int>>(
            "Can't filter the iterable twice, again",
            list, Matchers.iterableWithSize(3)
        )
    }
}
