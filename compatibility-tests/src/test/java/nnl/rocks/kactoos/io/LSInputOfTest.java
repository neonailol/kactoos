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
package nnl.rocks.kactoos.io;

import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.Test;

/**
 * Test case for {@link LSInputOf}.
 *
 * @author Yegor Bugayenko (yegor256@gmail.com)
 * @version $Id: e87ccf2fdeff804c40e1dff3db32ae4c8aa4de2a $
 * @since 0.12
 * @checkstyle JavadocMethodCheck (500 lines)
 * @checkstyle AbbreviationAsWordInNameCheck (5 lines)
 */
public final class LSInputOfTest {

    @Test
    public void readsSimpleInput() {
        MatcherAssert.assertThat(
            "Can't read simple input",
            new LSInputOf(
                new InputOf("hello, world!")
            ).getStringData(),
            Matchers.endsWith("world!")
        );
    }

    @Test
    public void readsBiggerInput() {
        final int size = 400_000;
        MatcherAssert.assertThat(
            "Can't read bigger input",
            new LSInputOf(
                new InputOf(
                    new SlowInputStream(size)
                )
            ).getStringData().length(),
            Matchers.equalTo(size)
        );
    }

    @Test
    public void countsBytesInBiggerInput() {
        final int size = 300_000;
        MatcherAssert.assertThat(
            "Can't count bytes in a bigger input",
            new LSInputOf(
                new InputOf(
                    new SlowInputStream(size)
                )
            ).getStringData().length(),
            Matchers.equalTo(size)
        );
    }

}
