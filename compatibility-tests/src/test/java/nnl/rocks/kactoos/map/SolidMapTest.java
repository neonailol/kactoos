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
package nnl.rocks.kactoos.map;

import java.util.Map;
import nnl.rocks.kactoos.Scalar;
import nnl.rocks.kactoos.matchers.RunsInThreads;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.Test;

/**
 * Test case for {@link SolidMap}.
 *
 * @author Yegor Bugayenko (yegor256@gmail.com)
 * @version $Id: bee77d8833535b697047540d5b90f0d3424c6cb5 $
 * @since 0.24
 * @checkstyle JavadocMethodCheck (500 lines)
 * @checkstyle ClassDataAbstractionCouplingCheck (500 lines)
 */
public final class SolidMapTest {

    @Test
    public void behavesAsMap() {
        MatcherAssert.assertThat(
            "Can't behave as a map",
            new SolidMap<Integer, Integer>(
                new MapEntry<>(0, -1),
                new MapEntry<>(1, 1)
            ),
            new BehavesAsMap<>(0, 1)
        );
    }

    @Test
    public void worksInThreads() {
        MatcherAssert.assertThat(
            "Can't behave as a map in multiple threads",
            map -> {
                MatcherAssert.assertThat(map, new BehavesAsMap<>(0, 1));
                return true;
            },
            new RunsInThreads<>(
                new SolidMap<Integer, Integer>(
                    new MapEntry<>(0, -1),
                    new MapEntry<>(1, 1)
                )
            )
        );
    }

    @Test
    public void mapsToSameObjects() {
        final Map<Integer, Scalar<Integer>> map = SolidMap.Companion.invoke(
            input -> new MapEntry<>(input, () -> input),
            1, -1, 0, 1
        );
        MatcherAssert.assertThat(
            "Can't map only once",
            map.get(0), Matchers.equalTo(map.get(0))
        );
    }
}
