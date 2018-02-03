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
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 * Test case for {@link TeeInput}.
 * @author Yegor Bugayenko (yegor256@gmail.com)
 * @version $Id: 5e93a6dea79740dd643ecb6f92f7e4cef1fb58c5 $
 * @since 0.1
 * @checkstyle JavadocMethodCheck (500 lines)
 * @checkstyle ClassDataAbstractionCouplingCheck (500 lines)
 */
public final class TeeInputTest {

    @Test
    public void copiesContent() {
        final ByteArrayOutputStream baos = new ByteArrayOutputStream();
        final String content = "Hello, товарищ!";
        MatcherAssert.assertThat(
            "Can't copy Input to Output and return Input",
            new TextOf(
                new TeeInput(
                    new InputOf(content),
                    new OutputTo(baos)
                )
            ),
            new TextHasString(
                new MatcherOf<>(
                    str -> {
                        return new String(
                            baos.toByteArray(), StandardCharsets.UTF_8
                        ).equals(str);
                    }
                )
            )
        );
    }

    @Test
    public void copiesToFile() throws IOException {
        final Path temp = Files.createTempFile("cactoos", "txt");
        MatcherAssert.assertThat(
            "Can't copy Input to File and return content",
            new TextOf(
                new BytesOf(
                    new TeeInput("Hello, друг!", temp)
                )
            ),
            new TextHasString(
                new MatcherOf<>(
                    str -> {
                        return str.equals(
                            new String(
                                Files.readAllBytes(temp),
                                StandardCharsets.UTF_8
                            )
                        );
                    }
                )
            )
        );
    }
}
