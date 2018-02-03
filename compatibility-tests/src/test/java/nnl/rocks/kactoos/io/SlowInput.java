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

import nnl.rocks.kactoos.Input;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * Input that returns content in small portions.
 *
 * @author Yegor Bugayenko (yegor256@gmail.com)
 * @version $Id: 599992e3fe5159b6ad1eb30383fce3e69c8ce2e8 $
 * @since 0.12
 */
final class SlowInput implements Input {

    /**
     * Original input.
     */
    private final Input origin;

    /**
     * Ctor.
     * @param size The size of the array to encapsulate
     */
    SlowInput(final long size) {
        this((int) size);
    }

    /**
     * Ctor.
     * @param size The size of the array to encapsulate
     */
    SlowInput(final int size) {
        this(new InputOf(new ByteArrayInputStream(new byte[size])));
    }

    /**
     * Ctor.
     * @param input Original input to encapsulate and make slower
     */
    SlowInput(final Input input) {
        this.origin = input;
    }

    @Override
    public InputStream stream() throws IOException {
        return new SlowInputStream(this.origin.stream());
    }

}
