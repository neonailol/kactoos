
package nnl.rocks.kactoos.iterator

import nnl.rocks.kactoos.list.ListOf
import org.hamcrest.MatcherAssert
import org.hamcrest.Matchers
import org.junit.Test

import java.util.ArrayList
import java.util.Arrays
import java.util.Collections
import java.util.NoSuchElementException

/**
 * Test case for [Partitioned].
 *
 * @author Sven Diedrichsen (sven.diedrichsen@gmail.com)
 * @version $Id: 091735851e2d1f9da737384386eb8b0b2a3b5633 $
 * @since 0.29
 * @checkstyle JavadocMethodCheck (500 lines)
 * @checkstyle MagicNumber (500 lines)
 */
class PartitionedTest {

    @Test
    fun emptyPartitioned() {
        MatcherAssert.assertThat(
                "Can't generate an empty Partitioned.",
                LengthOf(
                        Partitioned(1, Collections.emptyIterator())
                ).toInt(),
                Matchers.equalTo(0)
        )
    }

    @Test
    fun partitionedOne() {
        MatcherAssert.assertThat(
                "Can't generate a Partitioned of partition size 1.",
                ArrayList(
                        ListOf(
                                Partitioned(1, Arrays.asList(1, 2, 3).iterator())
                        )
                ),
                Matchers.equalTo(
                        Arrays.asList(
                                listOf(1), listOf(2),
                                listOf(3)
                        )
                )
        )
    }

    @Test
    fun partitionedEqualSize() {
        MatcherAssert.assertThat(
                "Can't generate a Partitioned of partition size 2.",
                ArrayList(
                        ListOf(
                                Partitioned(2, ListOf(1, 2, 3, 4).iterator())
                        )
                ),
                Matchers.equalTo(
                        Arrays.asList(Arrays.asList(1, 2), Arrays.asList(3, 4))
                )
        )
    }

    @Test
    fun partitionedLastPartitionSmaller() {
        MatcherAssert.assertThat(
                "Can't generate a Partitioned of size 2 last partition smaller.",
                ArrayList(
                        ListOf(
                                Partitioned(2, ListOf(1, 2, 3).iterator())
                        )
                ),
                Matchers.equalTo(
                        Arrays.asList(
                                Arrays.asList(1, 2),
                                listOf(3)
                        )
                )
        )
    }

    @Test(expected = IllegalArgumentException::class)
    fun partitionedWithPartitionSizeSmallerOne() {
        Partitioned(0, ListOf(1).iterator()).next()
    }

    @Test(expected = NoSuchElementException::class)
    fun emptyPartitionedNextThrowsException() {
        Partitioned(
                2, emptyList<Any>().iterator()
        ).next()
    }
}
