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
package nnl.rocks.kactoos.scalar;

import nnl.rocks.kactoos.list.ListOf;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.Test;

/**
 * Test case for {@link MaxOf}.
 *
 * @author Fabricio Cabral (fabriciofx@gmail.com)
 * @version $Id: 0fb053c95b6feeae2ae207bb25e9577fb966d814 $
 * @since 0.10
 * @checkstyle JavadocMethodCheck (500 lines)
 * @checkstyle MagicNumberCheck (500 lines)
 */
public final class MaxOfTest {

    @Test
    public void withIntegerCollection() {
        MatcherAssert.assertThat(
            new MaxOf(
                new ListOf<>(1, 2, 3, 4)
            ).intValue(),
            Matchers.equalTo(4)
        );
        MatcherAssert.assertThat(
            new MaxOf(
                new ListOf<>(1, 2, 3, 4)
            ).longValue(),
            Matchers.equalTo(4L)
        );
        MatcherAssert.assertThat(
            new MaxOf(
                new ListOf<>(1, 2, 3, 4)
            ).doubleValue(),
            Matchers.equalTo(4.0d)
        );
        MatcherAssert.assertThat(
            new MaxOf(
                new ListOf<>(1, 2, 3, 4)
            ).floatValue(),
            Matchers.equalTo(4.0f)
        );
    }

    @Test
    public void withLongCollection() {
        MatcherAssert.assertThat(
            new MaxOf(
                new ListOf<>(1L, 2L, 3L, 4L)
            ).intValue(),
            Matchers.equalTo(4)
        );
        MatcherAssert.assertThat(
            new MaxOf(
                new ListOf<>(1L, 2L, 3L, 4L)
            ).longValue(),
            Matchers.equalTo(4L)
        );
        MatcherAssert.assertThat(
            new MaxOf(
                new ListOf<>(1L, 2L, 3L, 4L)
            ).doubleValue(),
            Matchers.equalTo(4.0d)
        );
        MatcherAssert.assertThat(
            new MaxOf(
                new ListOf<>(1L, 2L, 3L, 4L)
            ).floatValue(),
            Matchers.equalTo(4.0f)
        );
    }

    @Test
    public void withDoubleCollection() {
        MatcherAssert.assertThat(
            new MaxOf(
                new ListOf<>(1.0d, 2.0d, 3.0d, 4.0d)
            ).intValue(),
            Matchers.equalTo(4)
        );
        MatcherAssert.assertThat(
            new MaxOf(
                new ListOf<>(1.0d, 2.0d, 3.0d, 4.0d)
            ).longValue(),
            Matchers.equalTo(4L)
        );
        MatcherAssert.assertThat(
            new MaxOf(
                new ListOf<>(1.0d, 2.0d, 3.0d, 4.0d)
            ).doubleValue(),
            Matchers.equalTo(4.0d)
        );
        MatcherAssert.assertThat(
            new MaxOf(
                new ListOf<>(1.0d, 2.0d, 3.0d, 4.0d)
            ).floatValue(),
            Matchers.equalTo(4.0f)
        );
    }

    @Test
    public void withFloatCollection() {
        MatcherAssert.assertThat(
            new MaxOf(
                new ListOf<>(1.0f, 2.0f, 3.0f, 4.0f)
            ).intValue(),
            Matchers.equalTo(4)
        );
        MatcherAssert.assertThat(
            new MaxOf(
                new ListOf<>(1.0f, 2.0f, 3.0f, 4.0f)
            ).longValue(),
            Matchers.equalTo(4L)
        );
        MatcherAssert.assertThat(
            new MaxOf(
                new ListOf<>(1.0f, 2.0f, 3.0f, 4.0f)
            ).doubleValue(),
            Matchers.equalTo(4.0d)
        );
        MatcherAssert.assertThat(
            new MaxOf(
                new ListOf<>(1.0f, 2.0f, 3.0f, 4.0f)
            ).floatValue(),
            Matchers.equalTo(4.0f)
        );
    }

}
