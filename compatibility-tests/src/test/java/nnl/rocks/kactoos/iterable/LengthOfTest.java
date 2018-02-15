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
package nnl.rocks.kactoos.iterable;

import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.Test;

/**
 * Test case for {@link LengthOf}.
 *
 * @author Nikita Salomatin (nsalomatin@hotmail.com)
 * @version $Id: cc99740709dd9cca427d230e2408f5baa4f43b86 $
 * @checkstyle JavadocMethodCheck (500 lines)
 * @checkstyle MagicNumberCheck (500 lines)
 * @since 0.1
 */
public final class LengthOfTest {

    @Test
    public void lengthOfWithIntegerValue() {
        MatcherAssert.assertThat(
            "Can't calculate length of iterable for integer",
            new LengthOf(
                new IterableOf<>(1, 2, 3, 4)
            ).intValue(),
            Matchers.equalTo(4)
        );
    }

    @Test
    public void lengthOfWithDoubleValue() {
        MatcherAssert.assertThat(
            "Can't calculate length of iterable for double",
            new LengthOf(
                new IterableOf<>(1, 2, 3, 4)
            ).doubleValue(),
            Matchers.equalTo(4.0)
        );
    }

    @Test
    public void lengthOfWithFloatValue() {
        MatcherAssert.assertThat(
            "Can't calculate length of iterable for float",
            new LengthOf(
                new IterableOf<>(1, 2, 3, 4)
            ).floatValue(),
            Matchers.equalTo(4.0f)
        );
    }

    @Test
    public void lengthOfEmptyIterable() {
        MatcherAssert.assertThat(
            "Can't calculate length of empty iterable",
            new LengthOf(
                new IterableOf<>()
            ).intValue(),
            Matchers.equalTo(0)
        );
    }

}
