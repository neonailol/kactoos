
package nnl.rocks.kactoos.iterable

import org.hamcrest.MatcherAssert
import org.hamcrest.Matchers
import org.junit.Test

/**
 * Test case for [Partitioned].
 *
 * @author Sven Diedrichsen (sven.diedrichsen@gmail.com)
 * @version $Id: a682d77a8b5fd8f6ff70fe4f4e91a3b64c58bd05 $
 * @since 0.29
 * @checkstyle JavadocMethodCheck (500 lines)
 * @checkstyle MagicNumber (500 lines)
 */
class PartitionedTest {

    @Test
    fun partitionedEmpty() {
        MatcherAssert.assertThat(
                "Can't generate a Partitioned without values.",
                LengthOf(
                        Partitioned<Any>(2)
                ).toInt(),
                Matchers.equalTo(0)
        )
    }

    @Test
    fun partitionedWithPartial() {
        MatcherAssert.assertThat(
                "Can't generate a Partitioned with partition size.",
                LengthOf(
                        Partitioned(2, IterableOf(1, 2, 3))
                ).toInt(),
                Matchers.equalTo(2)
        )
    }
}
