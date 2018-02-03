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
package nnl.rocks.kactoos.list;

import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.Test;

/**
 * Test Case for {@link Shuffled}.
 * @author Yegor Bugayenko (yegor256@gmail.com)
 * @version $Id: 8314b5f8da13891e57d4fb640dc7c83dbb7b0de5 $
 * @since 0.23
 * @checkstyle JavadocMethodCheck (500 lines)
 */
@SuppressWarnings("PMD.AvoidDuplicateLiterals")
public final class ShuffledTest {

    @Test
    public void behavesAsCollection() {
        MatcherAssert.assertThat(
            "Can't behave as a list",
            new ListNoNulls<>(
                new Shuffled<>(
                    new ListOf<>(1, 0, -1, -1, 2)
                )
            ),
            new BehavesAsList<>(0)
        );
    }

    @Test
    public void shufflesList() {
        MatcherAssert.assertThat(
            "Can't shuffle elements in list",
            new Shuffled<>(
                new ListOf<>(1, 0, -1, -1, 2)
            ),
            Matchers.hasItem(-1)
        );
    }
}
