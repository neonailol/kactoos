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

import nnl.rocks.kactoos.list.ListOf;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.Test;

/**
 * Test Case for {@link CollectionOf}.
 * @author Yegor Bugayenko (yegor256@gmail.com)
 * @version $Id: 92460dd62bd3ee819ac39a965d3ce14e41ee3a4e $
 * @since 0.23
 * @checkstyle JavadocMethodCheck (500 lines)
 */
public final class CollectionOfTest {

    @Test
    public void behavesAsCollection() {
        MatcherAssert.assertThat(
            "Can't behave as a collection",
            new CollectionOf<>(1, 2, 0, -1),
            new BehavesAsCollection<>(-1)
        );
    }

    @Test
    public void buildsCollection() {
        MatcherAssert.assertThat(
            "Can't build a collection",
            new CollectionOf<Integer>(1, 2, 0, -1),
            Matchers.hasItem(-1)
        );
    }

    @Test
    public void buildsCollectionFromIterator() {
        MatcherAssert.assertThat(
            "Can't build a collection from iterator",
            new CollectionOf<Integer>(new ListOf<>(1, 2, 0, -1).iterator()),
            Matchers.hasItem(-1)
        );
    }

}
