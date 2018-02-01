
package nnl.rocks.kactoos.iterable

import nnl.rocks.kactoos.text.TextOf
import org.hamcrest.MatcherAssert
import org.hamcrest.Matchers
import org.junit.Test

/**
 * Test case for [IterableOf].
 * @author Yegor Bugayenko (yegor256@gmail.com)
 * @author Ix (ixmanuel@yahoo.com)
 * @version $Id: 3417c3485c2c07a8f43bf01f7c00ac1bb5bec54c $
 * @since 0.12
 * @checkstyle JavadocMethodCheck (500 lines)
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
                // @checkstyle MagicNumber (1 line)
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
                // @checkstyle MagicNumber (1 line)
                Matchers.equalTo(3)
        )
    }
}
