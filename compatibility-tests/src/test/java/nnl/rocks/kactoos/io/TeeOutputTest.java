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

import nnl.rocks.kactoos.matchers.MatcherOf;
import nnl.rocks.kactoos.matchers.TextHasString;
import nnl.rocks.kactoos.text.TextOf;
import org.hamcrest.MatcherAssert;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.nio.charset.StandardCharsets;

/**
 * Test case for {@link TeeOutput}.
 * @author Yegor Bugayenko (yegor256@gmail.com)
 * @version $Id: 74f34ad8f267876a50d2d9d8b7d9d33e46294370 $
 * @since 0.16
 * @checkstyle JavadocMethodCheck (500 lines)
 * @checkstyle ClassDataAbstractionCouplingCheck (500 lines)
 */
public final class TeeOutputTest {

    @Test
    public void copiesContent() {
        final ByteArrayOutputStream baos = new ByteArrayOutputStream();
        final ByteArrayOutputStream copy = new ByteArrayOutputStream();
        final String content = "Hello, товарищ!";
        MatcherAssert.assertThat(
            "Can't copy Output to Output and return Input",
            new TextOf(
                new TeeInput(
                    new InputOf(content),
                    new TeeOutput(
                        new OutputTo(baos),
                        new OutputTo(copy)
                    )
                )
            ),
            new TextHasString(
                new MatcherOf<>(
                    str -> {
                        return new String(
                            copy.toByteArray(), StandardCharsets.UTF_8
                        ).equals(str);
                    }
                )
            )
        );
    }

}
