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

import nnl.rocks.kactoos.matchers.TextHasString;
import nnl.rocks.kactoos.text.HexOf;
import org.hamcrest.MatcherAssert;
import org.junit.Test;

import java.io.IOException;

/**
 * Test case for {@link Md5DigestOf}.
 *
 * @author Fabricio Cabral (fabriciofx@gmail.com)
 * @version $Id: 53a0d6ea22621a448497f1aa6daf621c8f9ff145 $
 * @since 0.29
 * @checkstyle JavadocMethodCheck (500 lines)
 */
public final class Md5DigestOfTest {

    @Test
    public void checksumOfEmptyString() {
        MatcherAssert.assertThat(
            "Can't calculate the empty string's MD5 checksum",
            new HexOf(
                new Md5DigestOf(
                    new InputOf("")
                )
            ),
            new TextHasString(
                "d41d8cd98f00b204e9800998ecf8427e"
            )
        );
    }

    @Test
    public void checksumOfString() {
        MatcherAssert.assertThat(
            "Can't calculate the string's MD5 checksum",
            new HexOf(
                new Md5DigestOf(
                    new InputOf("Hello World!")
                )
            ),
            new TextHasString(
                "ed076287532e86365e841e92bfc50d8c"
            )
        );
    }

    @Test
    public void checksumFromFile() throws IOException {
        MatcherAssert.assertThat(
            "Can't calculate the file's MD5 checksum",
            new HexOf(
                new Md5DigestOf(
                    new InputOf(
                        new ResourceOf(
                            "org/cactoos/io/DigestEnvelope.class"
                        ).stream()
                    )
                )
            ),
            new TextHasString(
                "842a5e7012d76e1df96c3d92e5c661df"
            )
        );
    }

}
