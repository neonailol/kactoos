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

import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.Test;

import java.util.concurrent.atomic.AtomicBoolean;

/**
 * Test case for {@link FuncOf}.
 *
 * @author Yegor Bugayenko (yegor256@gmail.com)
 * @version $Id: 2f95852a9f8364fcebde018f88171b0a06003fdd $
 * @since 0.20
 * @checkstyle JavadocMethodCheck (500 lines)
 */
public final class FuncOfTest {

    @Test
    public void convertsProcIntoFunc() throws Exception {
        final AtomicBoolean done = new AtomicBoolean(false);
        MatcherAssert.assertThat(
            new FuncOf<String, Boolean>(
                input -> done.set(true),
                true
            ).apply("hello world"),
            Matchers.equalTo(done.get())
        );
    }

    @Test
    public void convertsProcWithNoResultIntoFunc() throws Exception {
        final AtomicBoolean done = new AtomicBoolean(false);
        MatcherAssert.assertThat(
            new FuncOf<String, Boolean>(
                input -> {
                    done.set(true);
                }
            ).apply("hello you"),
            Matchers.notNullValue()
        );
    }

    @Test
    public void convertsRunnableIntoFunc() throws Exception {
        final AtomicBoolean done = new AtomicBoolean(false);
        MatcherAssert.assertThat(
            new FuncOf<String, Boolean>(
                () -> done.set(true)
            ).apply("hello, world"),
            Matchers.notNullValue()
        );
    }

    @Test
    public void convertsValueIntoFunc() throws Exception {
        MatcherAssert.assertThat(
            new FuncOf<String, Boolean>(
                true
            ).apply("hello, dude!"),
            Matchers.equalTo(true)
        );
    }

}
