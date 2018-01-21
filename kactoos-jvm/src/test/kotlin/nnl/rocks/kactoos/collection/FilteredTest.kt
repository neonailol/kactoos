package nnl.rocks.kactoos.collection

import nnl.rocks.kactoos.func.FuncOf
import nnl.rocks.kactoos.iterable.IterableOf
import nnl.rocks.kactoos.iterable.LengthOf
import org.hamcrest.MatcherAssert
import org.hamcrest.Matchers
import org.junit.Test

/**
 * Test case for [nnl.rocks.kactoos.collection.Filtered].
 *
 *
 *
 * @since 0.16
 *
 *
 */
class FilteredTest {

    @Test
    @Throws(Exception::class)
    fun behavesAsCollection() {
        MatcherAssert.assertThat(
            "Can't behave as a collection",
            Filtered(FuncOf { it < 2 }, 1, 2, 0, - 1),
            BehavesAsCollection(- 1)
        )
    }

    @Test
    fun filterList() {
        MatcherAssert.assertThat(
            LengthOf(
                Filtered(
                    FuncOf { input: String -> input.length > 4 },
                    IterableOf("hello", "world", "друг")
                )
            ).toInt(),
            Matchers.equalTo(2)
        )
    }

    @Test
    fun filterEmptyList() {
        MatcherAssert.assertThat(
            Filtered(
                FuncOf<String, Boolean> { input -> input.length > 4 },
                emptyList()
            ),
            Matchers.emptyIterable<String>()
        )
    }

    @Test
    @Throws(Exception::class)
    fun size() {
        MatcherAssert.assertThat(
            Filtered(
                FuncOf<String, Boolean> { input -> input.length >= 4 },
                IterableOf("some", "text", "yes")
            ).size,
            Matchers.equalTo(2)
        )
    }

    @Test
    @Throws(Exception::class)
    fun withItemsNotEmpty() {
        MatcherAssert.assertThat(
            Filtered(
                FuncOf<String, Boolean> { input -> input.length > 4 },
                IterableOf("first", "second")
            ).isEmpty(),
            Matchers.equalTo(false)
        )
    }

    @Test
    @Throws(Exception::class)
    fun withoutItemsIsEmpty() {
        MatcherAssert.assertThat(
            Filtered(
                FuncOf<String, Boolean> { input -> input.length > 16 },
                IterableOf("third", "fourth")
            ).isEmpty(),
            Matchers.equalTo(true)
        )
    }
}
