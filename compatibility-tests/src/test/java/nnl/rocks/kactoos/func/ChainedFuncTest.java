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
package nnl.rocks.kactoos.func;

import nnl.rocks.kactoos.Func;
import nnl.rocks.kactoos.iterable.Filtered;
import nnl.rocks.kactoos.iterable.IterableOf;
import nnl.rocks.kactoos.iterable.LengthOf;
import nnl.rocks.kactoos.iterable.Mapped;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.Test;

/**
 * Test case for {@link ChainedFunc}.
 *
 * @author Vseslav Sekorin (vssekorin@gmail.com)
 * @version $Id: 3e3cee5ce08a8f4010b93c41e6b878a91234f003 $
 * @since 0.7
 * @checkstyle JavadocMethodCheck (500 lines)
 * @checkstyle MagicNumber (500 line)
 */
public final class ChainedFuncTest {

    @Test
    public void withoutIterable() {
        MatcherAssert.assertThat(
            new LengthOf(
                new Filtered<>(
                    input -> input.endsWith("12"), new Mapped<>(
                    new ChainedFunc<String, String, String>(
                        input -> input.concat("1"),
                        input -> input.concat("2")
                    ), new IterableOf<>("public", "final", "class")
                )
                )
            ).intValue(),
            Matchers.equalTo(3)
        );
    }

    @Test
    public void withIterable() {
        MatcherAssert.assertThat(
            new LengthOf(
                new Filtered<>(
                    input -> !input.startsWith("st"), new Mapped<>(
                    new ChainedFunc<>(
                        input -> input.concat("1"),
                        new IterableOf<Func<String, String>>(
                            input -> input.concat("2"),
                            input -> input.replaceAll("a", "b")
                        ),
                        String::trim
                    ), new IterableOf<>("private", "static", "String")
                )
                )
            ).intValue(),
            Matchers.equalTo(2)
        );
    }
}
