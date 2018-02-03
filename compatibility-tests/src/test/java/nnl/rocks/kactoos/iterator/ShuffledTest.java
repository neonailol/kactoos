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
package nnl.rocks.kactoos.iterator;

import nnl.rocks.kactoos.iterable.IterableOf;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.Test;

/**
 * Test Case for {@link Shuffled}.
 * @author Ivan Shcherbak (alotofall@gmail.com)
 * @version $Id: 908adb0a6a4982c4cd64bca27635ca2342b3b976 $
 * @since 0.20
 * @checkstyle JavadocMethodCheck (500 lines)
 */
public final class ShuffledTest {

    @Test
    @SuppressWarnings("PMD.AvoidDuplicateLiterals")
    public void shuffleIterable() {
        MatcherAssert.assertThat(
            "Can't shuffle elements in iterator",
            () -> new Shuffled<>(
                new IterableOf<>(
                    "a", "b"
                ).iterator()
            ),
            Matchers.containsInAnyOrder(
                "a", "b"
            )
        );
    }

}
