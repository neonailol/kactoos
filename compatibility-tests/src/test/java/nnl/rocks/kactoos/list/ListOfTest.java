/**
 * The MIT License (MIT)
 * <p>
 * Copyright (c) 2017-2018 Yegor Bugayenko
 * <p>
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * <p>
 * The above copyright notice and this permission notice shall be included
 * in all copies or substantial portions of the Software.
 * <p>
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NON-INFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package nnl.rocks.kactoos.list;

import nnl.rocks.kactoos.iterable.IterableOf;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.Ignore;
import org.junit.Test;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Test case for {@link ListOf}.
 *
 * @author Kirill (g4s8.public@gmail.com)
 * @version $Id: 0a8bd3454891f99e33ebed8b4f74e2bdc385ae5d $
 * @since 0.1
 * @checkstyle JavadocMethodCheck (500 lines)
 * @checkstyle MagicNumberCheck (500 lines)
 */
public final class ListOfTest {

    @Test
    public void behavesAsCollection() {
        MatcherAssert.assertThat(
            "Can't behave as a list",
            new ListOf<>(1, 2),
            new BehavesAsList<>(2)
        );
    }

    @Test
    public void elementAtIndexTest() {
        final int num = 345;
        MatcherAssert.assertThat(
            "Can't convert an iterable to a list",
            new ListOf<>(-1, num, 0, 1).get(1),
            Matchers.equalTo(num)
        );
    }

    @Test
    public void sizeTest() {
        final int size = 42;
        MatcherAssert.assertThat(
            "Can't build a list with a certain size",
            new ListOf<>(
                Collections.nCopies(size, 0)
            ),
            Matchers.hasSize(size)
        );
    }

    @Test
    public void emptyTest() {
        MatcherAssert.assertThat(
            "Can't convert an empty iterable to an empty list",
            new ListOf<>(
                Collections.emptyList()
            ).size(),
            Matchers.equalTo(0)
        );
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void lowBoundTest() {
        // @checkstyle MagicNumber (1 line)
        new ListOf<>(Collections.nCopies(10, 0)).get(-1);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void highBoundTest() {
        // @checkstyle MagicNumber (1 line)
        new ListOf<>(Collections.nCopies(10, 0)).get(11);
    }

    @Test
    @Ignore
    public void sensesChangesInIterable() {
        final AtomicInteger size = new AtomicInteger(2);
        final List<Integer> list = new ListOf<>(
            () -> Collections.nCopies(size.incrementAndGet(), 0).iterator()
        );
        MatcherAssert.assertThat(
            "Can't sense the changes in the underlying iterable",
            list.size(),
            Matchers.not(Matchers.equalTo(list.size()))
        );
    }

    @Test
    public void makesListFromMappedIterable() {
        final List<Integer> list = new ListOf<>(
            new Mapped<>(
                i -> i + 1,
                new IterableOf<>(1, -1, 0, 1)
            )
        );
        MatcherAssert.assertThat(
            "Can't turn a mapped iterable into a list",
            list, Matchers.iterableWithSize(4)
        );
        MatcherAssert.assertThat(
            "Can't turn a mapped iterable into a list, again",
            list, Matchers.iterableWithSize(4)
        );
    }

}
