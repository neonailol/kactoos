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
package nnl.rocks.kactoos;

import java.io.IOException;
import nnl.rocks.kactoos.matchers.TextHasString;
import nnl.rocks.kactoos.text.TextOf;
import org.hamcrest.MatcherAssert;
import org.junit.Test;

/**
 * Test case for {@link Text}.
 * @author Fabricio Cabral (fabriciofx@gmail.com)
 * @version $Id: 38a7e7fccb45ae2216fbba76c6b470046aef7045 $
 * @since 0.11
 * @checkstyle JavadocMethodCheck (500 lines)
 */
public final class TextTest {

    @Test(expected = IllegalArgumentException.class)
    public void failForNullArgument() throws IOException {
        new Text.NoNulls(null).asString();
    }

    @Test(expected = IllegalStateException.class)
    public void failForNullResult() throws IOException {
        new Text.NoNulls(
            () -> null
        ).asString();
    }

    @Test
    public void okForNoNulls() {
        final String message = "Hello";
        MatcherAssert.assertThat(
            "Can't work with null text",
            new Text.NoNulls(
                new TextOf(message)
            ),
            new TextHasString(message)
        );
    }

}
