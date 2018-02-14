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

import nnl.rocks.kactoos.Scalar;
import nnl.rocks.kactoos.matchers.RunsInThreads;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.Test;

import java.util.LinkedList;
import java.util.List;

/**
 * Test case for {@link SyncScalar}.
 *
 * @author Yegor Bugayenko (yegor256@gmail.com)
 * @version $Id: 4b8c22e9ad3a2c3eb1e732ae9a3ff2e8fe6858ed $
 * @since 0.24
 * @checkstyle JavadocMethodCheck (500 lines)
 */
public final class SyncScalarTest {

    @Test
    public void worksInThreads() {
        final List<Integer> list = new LinkedList<>();
        final int threads = 100;
        MatcherAssert.assertThat(
            "Can't work well in multiple threads",
            Scalar::value,
            new RunsInThreads<>(
                new SyncScalar<>(() -> list.add(1)), threads
            )
        );
        MatcherAssert.assertThat(list.size(), Matchers.equalTo(threads));
    }

}