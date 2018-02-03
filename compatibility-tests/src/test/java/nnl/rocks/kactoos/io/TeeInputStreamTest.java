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

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

/**
 * Test case for {@link TeeInputStream}.
 * @author Yegor Bugayenko (yegor256@gmail.com)
 * @version $Id: c199811d890bbe86279ec07ed9dacbbacb59f2d3 $
 * @since 0.1
 * @checkstyle JavadocMethodCheck (500 lines)
 * @checkstyle ClassDataAbstractionCouplingCheck (500 lines)
 */
public final class TeeInputStreamTest {

    @Test
    public void copiesContentByteByByte() throws IOException {
        final ByteArrayOutputStream baos = new ByteArrayOutputStream();
        final String content = "Hello, товарищ!";
        MatcherAssert.assertThat(
            "Can't copy InputStream to OutputStream byte by byte",
            TeeInputStreamTest.asString(
                new TeeInputStream(
                    new ByteArrayInputStream(
                        content.getBytes(StandardCharsets.UTF_8)
                    ),
                    baos
                )
            ),
            Matchers.allOf(
                Matchers.equalTo(content),
                Matchers.equalTo(
                    new String(baos.toByteArray(), StandardCharsets.UTF_8)
                )
            )
        );
    }

    private static String asString(final InputStream input) throws IOException {
        final ByteArrayOutputStream baos = new ByteArrayOutputStream();
        while (true) {
            final int data = input.read();
            if (data < 0) {
                break;
            }
            baos.write(data);
        }
        input.close();
        return new String(baos.toByteArray(), StandardCharsets.UTF_8);
    }

}
