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

import java.io.File;
import java.io.IOException;
import nnl.rocks.kactoos.matchers.TextHasString;
import nnl.rocks.kactoos.text.TextOf;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.Test;

/**
 * Test case for {@link InputWithFallback}.
 *
 * @author Yegor Bugayenko (yegor256@gmail.com)
 * @version $Id: edc88d81e8a9f0cdbb3f75ff16f8b50e2d37c195 $
 * @since 0.9
 * @checkstyle JavadocMethodCheck (500 lines)
 */
public final class InputWithFallbackTest {

    @Test
    public void readsAlternativeInput() {
        MatcherAssert.assertThat(
            "Can't read alternative source",
            new TextOf(
                new InputWithFallback(
                    new InputOf(
                        new File("/this-file-is-absent-for-sure.txt")
                    ),
                    new InputOf("hello, world!")
                )
            ),
            new TextHasString(Matchers.endsWith("world!"))
        );
    }

    @Test
    public void readsAlternativeInputUri() {
        MatcherAssert.assertThat(
            "Can't read alternative source from URI",
            new TextOf(
                new InputWithFallback(
                    () -> {
                        throw new IOException("Always fails!");
                    },
                    new InputOf("it works!")
                )
            ),
            new TextHasString(Matchers.endsWith("works!"))
        );
    }

}
