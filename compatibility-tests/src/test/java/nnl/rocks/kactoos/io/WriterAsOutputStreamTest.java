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
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 * Test case for {@link WriterAsOutputStream}.
 *
 * @author Yegor Bugayenko (yegor256@gmail.com)
 * @version $Id: 3f68699a21f1f09712e10531cc0c4f146bdb2be2 $
 * @since 0.13
 * @checkstyle JavadocMethodCheck (500 lines)
 * @checkstyle ClassDataAbstractionCouplingCheck (500 lines)
 */
public final class WriterAsOutputStreamTest {

    @Test
    public void writesToByteArray() {
        final ByteArrayOutputStream baos = new ByteArrayOutputStream();
        final String content = "Hello, товарищ! How are you?";
        MatcherAssert.assertThat(
            "Can't copy Input to Writer",
            new TextOf(
                new TeeInput(
                    new InputOf(content),
                    new OutputTo(
                        new WriterAsOutputStream(
                            new OutputStreamWriter(
                                baos, StandardCharsets.UTF_8
                            ),
                            StandardCharsets.UTF_8,
                            // @checkstyle MagicNumber (1 line)
                            13
                        )
                    )
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
    public void writesLargeContentToFile() throws IOException {
        final Path temp = Files.createTempFile("cactoos-1", "txt-1");
        MatcherAssert.assertThat(
            "Can't copy Input to Output and return Input",
            new TextOf(
                new TeeInput(
                    new ResourceOf("org/cactoos/large-text.txt"),
                    new OutputTo(
                        new WriterAsOutputStream(
                            new OutputStreamWriter(
                                new FileOutputStream(temp.toFile()),
                                StandardCharsets.UTF_8
                            ),
                            StandardCharsets.UTF_8,
                            // @checkstyle MagicNumber (1 line)
                            345
                        )
                    )
                )
            ),
            new TextHasString(
                new MatcherOf<>(
                    str -> {
                        return new TextOf(temp).asString().equals(str);
                    }
                )
            )
        );
    }

}
