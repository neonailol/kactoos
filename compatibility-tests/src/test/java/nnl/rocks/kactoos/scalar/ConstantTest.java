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

import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.Test;

/**
 * Test case for {@link Constant}.
 *
 * @author Aliceice (elena.ihde-simon@posteo.de)
 * @version $Id: ba0a597cda03ac7ef6e5c4b7b6c38e3c67f50128 $
 * @checkstyle JavadocMethodCheck (500 lines)
 * @since 0.30
 */
public final class ConstantTest {

    @Test
    public void returnsGivenValue() {
        final String value = "Hello World";
        MatcherAssert.assertThat(
            "Can't return given value",
            new Constant<>(value).value(),
            Matchers.equalTo(value)
        );
    }

    @Test
    public void alwaysReturnsSameValue() {
        final Constant<String> constant = new Constant<>("Good Bye!");
        MatcherAssert.assertThat(
            "Can't return same value",
            constant.value(),
            Matchers.sameInstance(constant.value())
        );
    }
}
