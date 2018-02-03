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

import nnl.rocks.kactoos.Text;
import nnl.rocks.kactoos.iterable.IterableOf;
import nnl.rocks.kactoos.text.TextOf;
import nnl.rocks.kactoos.text.UpperText;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.Test;

import java.io.IOException;
import java.util.Collections;

/**
 * Test case for {@link Mapped}.
 * @author Yegor Bugayenko (yegor256@gmail.com)
 * @version $Id: fd6bfe58c0de84e2445500359109b61065c06641 $
 * @since 0.14
 * @checkstyle JavadocMethodCheck (500 lines)
 */
public final class MappedTest {

    @Test
    public void behavesAsCollection() {
        MatcherAssert.assertThat(
            "Can't behave as a list",
            new Mapped<Integer, Integer>(
                i -> i + 1,
                new IterableOf<>(-1, 1, 1)
            ),
            new BehavesAsList<>(0)
        );
    }

    @Test
    public void transformsList() throws IOException {
        MatcherAssert.assertThat(
            "Can't transform an iterable",
            new Mapped<String, Text>(
                input -> new UpperText(new TextOf(input)),
                new IterableOf<>("hello", "world", "друг")
            ).iterator().next().asString(),
            Matchers.equalTo("HELLO")
        );
    }

    @Test
    public void transformsEmptyList() {
        MatcherAssert.assertThat(
            "Can't transform an empty iterable",
            new Mapped<String, Text>(
                input -> new UpperText(new TextOf(input)),
                Collections.emptyList()
            ),
            Matchers.emptyIterable()
        );
    }

}
