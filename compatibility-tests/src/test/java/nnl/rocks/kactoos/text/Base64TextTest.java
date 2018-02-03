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

package nnl.rocks.kactoos.text;

import nnl.rocks.kactoos.matchers.TextHasString;
import org.hamcrest.MatcherAssert;
import org.junit.Test;

/**
 * Test Case for {@link Base64Text}.
 *
 * @author Ilia Rogozhin (ilia.rogozhin@gmail.com)
 * @version $Id: e800d03fc47bdabd93bf133d4523c7a59355ea5e $
 * @since 0.20.2
 */
public final class Base64TextTest {

    /**
     * Check text decodes using the Base64 encoding scheme.
     */
    @Test
    public void checkDecode() {
        MatcherAssert.assertThat(
            "Can't decodes text using the Base64 encoding scheme",
            new Base64Text(
                "SGVsbG8h"
            ),
            new TextHasString(
                "Hello!"
            )
        );
    }
}
