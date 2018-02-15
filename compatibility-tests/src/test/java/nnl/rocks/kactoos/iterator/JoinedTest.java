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

import java.util.Collections;
import java.util.Iterator;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.Test;

/**
 * Test case for {@link Joined}.
 * @author Yegor Bugayenko (yegor256@gmail.com)
 * @version $Id: 31e85abce93bfed341bc1173b4739761f785b0bd $
 * @since 0.14
 * @checkstyle JavadocMethodCheck (500 lines)
 */
public final class JoinedTest {

    @Test
    public void joinsIterators() {
        MatcherAssert.assertThat(
            "Can't concatenate mapped iterators together",
            new LengthOf(
                new IteratorNoNulls<>(
                    new Joined<Iterator<String>>(
                        new Mapped<>(
                            input -> Collections.singleton(input).iterator(),
                            Collections.singleton("x").iterator()
                        )
                    )
                )
            ).intValue(),
            Matchers.equalTo(1)
        );
    }

}
