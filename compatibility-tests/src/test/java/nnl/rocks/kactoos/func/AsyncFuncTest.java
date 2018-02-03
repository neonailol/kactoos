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

import nnl.rocks.kactoos.Proc;
import nnl.rocks.kactoos.matchers.FuncApplies;
import nnl.rocks.kactoos.matchers.MatcherOf;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.Test;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/**
 * Test case for {@link AsyncFunc}.
 *
 * @author Yegor Bugayenko (yegor256@gmail.com)
 * @version $Id: f4292d1cb8e804b42c6fa22b93334809f566fa3a $
 * @since 0.10
 * @checkstyle JavadocMethodCheck (500 lines)
 */
public final class AsyncFuncTest {

    @Test
    public void runsInBackground() {
        MatcherAssert.assertThat(
            "Can't run in the background",
            new AsyncFunc<>(
                input -> {
                    TimeUnit.DAYS.sleep(1L);
                    return "done!";
                }
            ),
            new FuncApplies<>(
                true,
                new MatcherOf<Future<String>>(
                    future -> !future.isDone()
                )
            )
        );
    }

    @Test
    public void runsAsProcInBackground() {
        MatcherAssert.assertThat(
            "Can't run proc in the background",
            input -> {
                final CountDownLatch latch = new CountDownLatch(1);
                new AsyncFunc<>(
                    (Proc<Boolean>) ipt -> latch.countDown()
                ).exec(input);
                latch.await();
                return true;
            },
            new FuncApplies<>(
                true, Matchers.equalTo(true)
            )
        );
    }

    @Test
    public void runsInBackgroundWithoutFuture() {
        final CountDownLatch latch = new CountDownLatch(1);
        MatcherAssert.assertThat(
            "Can't run in the background without us touching the Future",
            new AsyncFunc<>(
                input -> {
                    latch.countDown();
                }
            ),
            new FuncApplies<>(
                true,
                new MatcherOf<Future<String>>(
                    future -> {
                        return latch.await(1L, TimeUnit.SECONDS);
                    }
                )
            )
        );
    }

}
