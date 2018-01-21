package nnl.rocks.kactoos.iterable

import nnl.rocks.kactoos.text.TextOf
import org.hamcrest.MatcherAssert
import org.hamcrest.Matchers
import org.junit.Test

/**
 * Test case for [IterableOf].
 *
 *
 *
 * @since 0.12
 *
 */
class IterableOfTest {

    @Test
    fun convertsScalarsToIterable() {
        MatcherAssert.assertThat(
            "Can't convert scalars to iterable",
            LengthOf(
                IterableOf(
                    "a", "b", "c"
                )
            ).toInt(),
            Matchers.equalTo(3)
        )
    }

    @Test
    fun convertsArrayOfIntsToIterable() {
        MatcherAssert.assertThat(
            "Can't convert int scalars to iterable",
            IterableOf(1, 2, 0, 2),
            Matchers.hasItem(0)
        )
    }

    @Test
    fun convertsObjectsToIterable() {
        MatcherAssert.assertThat(
            "Can't convert objects to iterable",
            LengthOf(
                IterableOf(
                    TextOf("a"), TextOf("b"), TextOf("c")
                )
            ).toInt(),
            Matchers.equalTo(3)
        )
    }
}
