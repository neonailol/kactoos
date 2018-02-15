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
package nnl.rocks.kactoos.func;

import java.io.IOException;
import nnl.rocks.kactoos.Func;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.Test;

/**
 * Test case for {@link IoCheckedFunc}.
 *
 * @author Yegor Bugayenko (yegor256@gmail.com)
 * @version $Id: 2a08a5a6968b8464c77a50c5dc75f915f1d3c2be $
 * @since 0.4
 * @checkstyle JavadocMethodCheck (500 lines)
 */
public final class IoCheckedFuncTest {

    @Test
    public void rethrowsIoException() {
        final IOException exception = new IOException("intended");
        try {
            new IoCheckedFunc<>(
                (Func<Integer, String>) i -> {
                    throw exception;
                }
            ).apply(1);
        } catch (final IOException ex) {
            MatcherAssert.assertThat(
                ex, Matchers.is(exception)
            );
        }
    }

    @Test(expected = IOException.class)
    public void rethrowsCheckedToIoException() throws Exception {
        new IoCheckedFunc<>(
            i -> {
                throw new Exception("intended to fail");
            }
        ).apply(1);
    }

    @Test(expected = IllegalStateException.class)
    public void runtimeExceptionGoesOut() throws IOException {
        new IoCheckedFunc<>(
            i -> {
                throw new IllegalStateException("intended to fail here");
            }
        ).apply(1);
    }

}
