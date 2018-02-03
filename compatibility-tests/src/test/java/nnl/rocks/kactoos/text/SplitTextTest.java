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

import nnl.rocks.kactoos.iterable.LengthOf;
import nnl.rocks.kactoos.matchers.TextHasString;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.Test;

/**
 * Test case for {@link SplitText}.
 * @author Alexey Semenyuk (semenyukalexey@gmail.com)
 * @author Mehmet Yildirim (memoyil@gmail.com)
 * @version $Id: 83e96b4a413449a7036790d36ada630a0614dcde $
 * @since 0.9
 * @checkstyle JavadocMethodCheck (500 lines)
 */
public final class SplitTextTest {

    @Test
    @SuppressWarnings("PMD.AvoidDuplicateLiterals")
    public void splitTextLength() {
        MatcherAssert.assertThat(
            "Can't split a text. Incorrect length",
            new LengthOf(
                new SplitText("Hello world!", "\\s+")
            ).intValue(),
            Matchers.equalTo(2)
        );
    }

    @Test
    public void splitTextItem() {
        MatcherAssert.assertThat(
            "Can't split a text. Incorrect item",
            new SplitText("Hello world! [2]", "\\s+").iterator().next(),
            new TextHasString("Hello")
        );
    }

    @Test
    public void splitStringWithTextRegex() {
        MatcherAssert.assertThat(
            "Can't split an string with text regex",
            new SplitText(
                "Cactoos OOP!",
                new TextOf("\\s")
            ).iterator().next(),
            new TextHasString("Cactoos")
        );
    }

    @Test
    public void splitTextWithStringRegex() {
        MatcherAssert.assertThat(
            "Can't split an text with string regex",
            new SplitText(
                new TextOf("Cact4Primitives!"),
                "\\d+"
            ).iterator().next(),
            new TextHasString("Cact")
        );
    }

    @Test
    public void splitTextWithTextRegex() {
        MatcherAssert.assertThat(
            "Can't split an text with text regex",
            new SplitText(
                new TextOf("Split#OOP!"),
                "\\W+"
            ).iterator().next(),
            new TextHasString("Split")
        );
    }
}
