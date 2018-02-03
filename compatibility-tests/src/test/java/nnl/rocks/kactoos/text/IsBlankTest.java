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
package nnl.rocks.kactoos.text;

import nnl.rocks.kactoos.matchers.ScalarHasValue;
import org.hamcrest.MatcherAssert;
import org.junit.Test;

/**
 * Test case for {@link IsBlank}.
 * @author Andriy Kryvtsun (kontiky@gmail.com)
 * @version $Id: d3aeb1fb4be5c65adb208eabf97b94c59d3fcdd2 $
 * @since 0.1
 * @checkstyle JavadocMethodCheck (500 lines)
 */
public final class IsBlankTest {

    @Test
    public void determinesEmptyText() {
        MatcherAssert.assertThat(
            "Can't determine an empty text",
            new IsBlank(
                new TextOf("")
            ),
            new ScalarHasValue<>(Boolean.TRUE)
        );
    }

    @Test
    public void determinesBlankText() {
        MatcherAssert.assertThat(
            "Can't determine an empty text with spaces",
            new IsBlank(
                new TextOf("  ")
            ),
            new ScalarHasValue<>(Boolean.TRUE)
        );
    }

    @Test
    public void determinesNotBlankText() {
        MatcherAssert.assertThat(
            "Can't detect a nonempty text",
            new IsBlank(
                new TextOf("not empty")
            ),
            new ScalarHasValue<>(Boolean.FALSE)
        );
    }
}
