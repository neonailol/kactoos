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

import nnl.rocks.kactoos.io.DeadInput;
import org.junit.Test;

import java.io.IOException;

/**
 * Test case for {@link Input.NoNulls}.
 * @author Fabricio Cabral (fabriciofx@gmail.com)
 * @version $Id: 4f720a10054fd629b3ae63829285ce26e2aa4c11 $
 * @since 0.10
 * @checkstyle JavadocMethodCheck (500 lines)
 */
public final class InputTest {

    @Test(expected = IOException.class)
    public void failForNullInput() throws IOException {
        new Input.NoNulls(null).stream();
    }

    @Test(expected = IOException.class)
    public void failForNullStream() throws IOException {
        new Input.NoNulls(() -> null).stream();
    }

    @Test
    public void okForNoNullInput() throws IOException {
        new Input.NoNulls(new DeadInput()).stream();
    }
}
