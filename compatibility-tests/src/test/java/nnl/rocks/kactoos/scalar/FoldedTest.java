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
package nnl.rocks.kactoos.scalar;

import nnl.rocks.kactoos.Scalar;
import nnl.rocks.kactoos.iterable.IterableOf;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.Test;

import java.util.Collections;
import java.util.NoSuchElementException;

/**
 * Test case for {@link Folded}.
 *
 * @author Eduard Balovnev (bedward70@mail.ru)
 * @version $Id: 0796e8efc08c5e45af5821ad0c79ff4213fe0ac7 $
 * @since 1.0
 * @checkstyle JavadocMethodCheck (500 lines)
 */
public final class FoldedTest {

    @Test(expected = NoSuchElementException.class)
    public void failsForEmptyIterable() throws Exception {
        new Folded<>(
            (first, last) -> first,
            Collections.emptyList()
        )
            .value();
    }

    @Test
    public void singleAtSingleIterable() throws Exception {
        final Integer single = 10;
        MatcherAssert.assertThat(
            "Can't find the single",
            new Folded<>(
                (first, last) -> first,
                new IterableOf<Scalar<Integer>>(() -> single)
            ).value(),
            Matchers.equalTo(single)
        );
    }

    @Test
    public void firstAtIterable() throws Exception {
        final String one = "Apple";
        final String two = "Banana";
        final String three = "Orange";
        MatcherAssert.assertThat(
            "Can't find the first",
            new Folded<>(
                (first, last) -> first,
                new IterableOf<Scalar<String>>(
                    () -> one,
                    () -> two,
                    () -> three
                )
            ).value(),
            Matchers.equalTo(one)
        );
    }

    @Test
    public void lastAtIterable() throws Exception {
        final Character one = 'A';
        final Character two = 'B';
        final Character three = 'O';
        MatcherAssert.assertThat(
            "Can't find the last",
            new Folded<>(
                (first, last) -> last,
                new IterableOf<Scalar<Character>>(
                    () -> one,
                    () -> two,
                    () -> three
                )
            ).value(),
            Matchers.equalTo(three)
        );
    }
}
