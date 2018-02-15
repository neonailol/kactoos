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

import java.util.concurrent.atomic.AtomicInteger;
import nnl.rocks.kactoos.Text;
import nnl.rocks.kactoos.matchers.TextHasString;
import nnl.rocks.kactoos.text.FormattedText;
import nnl.rocks.kactoos.text.JoinedText;
import org.hamcrest.MatcherAssert;
import org.junit.Test;

/**
 * Test case for {@link StickyIterator}.
 *
 * @author Yegor Bugayenko (yegor256@gmail.com)
 * @version $Id: 629943e7098771cb60b5d502e2dfecf7c528cf41 $
 * @since 0.8
 * @checkstyle JavadocMethodCheck (500 lines)
 * @checkstyle ClassDataAbstractionCouplingCheck (500 lines)
 */
public final class StickyTest {

    @Test
    public void ignoresChangesInIterable() throws Exception {
        final AtomicInteger count = new AtomicInteger(2);
        final Text text = new FormattedText(
            "%s",
            new JoinedText(
                ", ",
                () -> new Mapped<>(
                    Object::toString, new StickyIterator<>(
                    new Limited<>(
                        2, new Endless<>(count::incrementAndGet)
                    )
                )
                )
            )
        );
        MatcherAssert.assertThat(
            "Can't ignore the changes in the underlying iterator",
            text,
            new TextHasString(text.asString())
        );
    }

}
