package nnl.rocks.kactoos.iterable

import nnl.rocks.kactoos.func.FuncOf
import org.hamcrest.MatcherAssert
import org.hamcrest.Matchers
import org.junit.Test

/**
 * Test case for [Filtered].
 * @author Yegor Bugayenko (yegor256@gmail.com)
 * @version $Id: c5a2064641fa7afc14baec3a52dba340436db77a $
 * @since 0.1
 * @checkstyle JavadocMethodCheck (500 lines)
 * @checkstyle MagicNumberCheck (500 lines)
 */
class FilteredTest {

    @Test
    fun filtersList() {
        MatcherAssert.assertThat(
            "Can't calculate the length of an iterable",
            LengthOf(
                Filtered<String>(
                    FuncOf { input -> input.length > 4 }, IterableOf(
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
                Filtered<String>(
                    { input -> input.length > 1 },
                    IterableOf<String>()
                )
            ).toInt(),
            Matchers.equalTo(0)
        )
    }

    @Test
    fun filtersIterablesWithSize() {
        val list = Filtered<Int>(
            { i -> i > 0 },
            IterableOf(1, 2, - 1, 0, 1)
        )
        MatcherAssert.assertThat(
            "Can't filter the iterable twice",
            list, Matchers.iterableWithSize<Int>(3)
        )
        MatcherAssert.assertThat(
            "Can't filter the iterable twice, again",
            list, Matchers.iterableWithSize<Int>(3)
        )
    }
}
