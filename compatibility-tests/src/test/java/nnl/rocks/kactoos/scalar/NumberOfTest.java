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
 * Test case for {@link NumberOf}.
 *
 * @author Kirill (g4s8.public@gmail.com)
 * @version $Id: dd48dc2d6083d1c51190f20815cde38d5b91e906 $
 * @since 0.2
 * @checkstyle JavadocMethodCheck (500 lines)
 */
public final class NumberOfTest {

    @Test
    public void parsesFloat() {
        MatcherAssert.assertThat(
            "Can't parse float number",
            new NumberOf("1656.894").floatValue(),
            // @checkstyle MagicNumber (1 line)
            Matchers.equalTo(1656.894F)
        );
    }

    @Test(expected = RuntimeException.class)
    public void failsIfTextDoesNotRepresentAFloat() {
        new NumberOf("abcfds").floatValue();
    }

    @Test
    public void parsesLong() {
        MatcherAssert.assertThat(
            "Can't parse long number",
            new NumberOf("186789235425346").longValue(),
            // @checkstyle MagicNumber (1 line)
            Matchers.equalTo(186789235425346L)
        );
    }

    @Test(expected = RuntimeException.class)
    public void failsIfTextDoesNotRepresentALong() {
        new NumberOf("abcddd").longValue();
    }

    @Test
    public void parsesInteger() {
        MatcherAssert.assertThat(
            "Can't parse integer number",
            new NumberOf("1867892354").intValue(),
            // @checkstyle MagicNumber (1 line)
            Matchers.equalTo(1867892354)
        );
    }

    @Test(expected = RuntimeException.class)
    public void failsIfTextDoesNotRepresentAnInt() {
        new NumberOf("abc fdsf").intValue();
    }

    @Test
    public void parsesDouble() {
        MatcherAssert.assertThat(
            "Can't parse double number",
            new NumberOf("185.65156465123").doubleValue(),
            // @checkstyle MagicNumber (1 line)
            Matchers.equalTo(185.65156465123)
        );
    }

    @Test(expected = RuntimeException.class)
    public void failsIfTextDoesNotRepresentADouble() {
        new NumberOf("abfdsc").doubleValue();
    }
}