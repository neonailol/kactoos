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

import nnl.rocks.kactoos.Proc;
import nnl.rocks.kactoos.Scalar;
import nnl.rocks.kactoos.func.FuncOf;
import nnl.rocks.kactoos.iterable.IterableOf;
import nnl.rocks.kactoos.iterable.Mapped;
import nnl.rocks.kactoos.matchers.MatcherOf;
import nnl.rocks.kactoos.matchers.ScalarHasValue;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.Test;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * Test case for {@link And}.
 * @author Vseslav Sekorin (vssekorin@gmail.com)
 * @author Mehmet Yildirim (memoyil@gmail.com)
 * @version $Id: 9b2ff9f3af150b49cfd35bf87764e0503e187c50 $
 * @since 0.8
 * @checkstyle JavadocMethodCheck (500 lines)
 * @checkstyle ClassDataAbstractionCouplingCheck (500 lines)
 */
public final class AndTest {

    @Test
    public void allTrue() throws Exception {
        MatcherAssert.assertThat(
            new And(
                new True(),
                new True(),
                new True()
            ).value(),
            Matchers.equalTo(true)
        );
    }

    @Test
    public void oneFalse() throws Exception {
        MatcherAssert.assertThat(
            new And(
                new True(),
                new False(),
                new True()
            ).value(),
            Matchers.equalTo(false)
        );
    }

    @Test
    public void allFalse() throws Exception {
        MatcherAssert.assertThat(
            new And(
                new IterableOf<Scalar<Boolean>>(
                    new False(),
                    new False(),
                    new False()
                )
            ).value(),
            Matchers.equalTo(false)
        );
    }

    @Test
    public void emptyIterator() throws Exception {
        MatcherAssert.assertThat(
            new And(Collections.emptyList()).value(),
            Matchers.equalTo(true)
        );
    }

    @Test
    public void iteratesList() {
        final List<String> list = new LinkedList<>();
        MatcherAssert.assertThat(
            "Can't iterate a list with a procedure",
            new And(
                new Mapped<String, Scalar<Boolean>>(
                    new FuncOf<>(list::add, () -> true),
                    new IterableOf<>("hello", "world")
                )
            ),
            new ScalarHasValue<>(
                Matchers.allOf(
                    Matchers.equalTo(true),
                    new MatcherOf<>(
                        value -> list.size() == 2
                    )
                )
            )
        );
    }

    @Test
    public void iteratesEmptyList() {
        final List<String> list = new LinkedList<>();
        MatcherAssert.assertThat(
            "Can't iterate a list",
            new And(
                new Mapped<String, Scalar<Boolean>>(
                    new FuncOf<>(list::add, () -> true), Collections.emptyList()
                )
            ),
            new ScalarHasValue<>(
                Matchers.allOf(
                    Matchers.equalTo(true),
                    new MatcherOf<>(
                        value -> {
                            return list.isEmpty();
                        }
                    )
                )
            )
        );
    }

    @Test
    public void testProc() throws Exception {
        final List<Integer> list = new LinkedList<>();
        new AndFunc<>(
            (Proc<Integer>) list::add,
            1, 1
        ).value();
        MatcherAssert.assertThat(
            list.size(),
            Matchers.equalTo(2)
        );
    }

    @Test
    public void testFunc() throws Exception {
        MatcherAssert.assertThat(
            new AndFunc<>(
                input -> input > 0,
                1, -1, 0
            ).value(),
            Matchers.equalTo(false)
        );
    }

}
