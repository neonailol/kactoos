/**
 * The MIT License (MIT)
 *
 * Copyright (c) 2017-2018 Yegor Bugayenko
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included
 * in all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NON-INFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
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
 * @version $Id$
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
