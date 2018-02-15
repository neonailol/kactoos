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
package nnl.rocks.kactoos.collection;

import java.util.Collection;
import nnl.rocks.kactoos.Scalar;
import nnl.rocks.kactoos.iterable.IterableOf;
import nnl.rocks.kactoos.matchers.RunsInThreads;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.Test;

/**
 * Test Case for {@link SolidCollection}.
 * @author Yegor Bugayenko (yegor256@gmail.com)
 * @version $Id: 1d949a1ec5e7ea59b797377b16836031e2dcbfdf $
 * @since 0.24
 * @checkstyle JavadocMethodCheck (500 lines)
 * @checkstyle MagicNumber (500 lines)
 */
public final class SolidCollectionTest {

    @Test
    public void behavesAsCollection() {
        MatcherAssert.assertThat(
            "Can't behave as a collection",
            new SolidCollection<>(1, 2, 0, -1),
            new BehavesAsCollection<>(-1)
        );
    }

    @Test
    public void makesListFromMappedIterable() {
        final Collection<Integer> list = new SolidCollection<>(
            new nnl.rocks.kactoos.list.Mapped<>(
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

    @Test
    public void mapsToSameObjects() {
        final Iterable<Scalar<Integer>> list = new SolidCollection<>(
            new nnl.rocks.kactoos.list.Mapped<>(
                i -> (Scalar<Integer>) () -> i,
                new IterableOf<>(1, -1, 0, 1)
            )
        );
        MatcherAssert.assertThat(
            "Can't map only once",
            list.iterator().next(), Matchers.equalTo(list.iterator().next())
        );
    }

    @Test
    public void worksInThreads() {
        MatcherAssert.assertThat(
            "Can't behave as a collection in multiple threads",
            list -> {
                MatcherAssert.assertThat(list, new BehavesAsCollection<>(0));
                return true;
            },
            new RunsInThreads<>(new SolidCollection<>(1, 0, -1, -1, 2))
        );
    }

}
