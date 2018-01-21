package nnl.rocks.kactoos.scalar

import nnl.rocks.kactoos.Proc
import nnl.rocks.kactoos.Scalar
import nnl.rocks.kactoos.func.FuncOf
import nnl.rocks.kactoos.func.ProcOf
import nnl.rocks.kactoos.iterable.IterableOf
import nnl.rocks.kactoos.test.ScalarHasValue
import org.hamcrest.MatcherAssert
import org.hamcrest.Matchers
import org.junit.Test
import java.util.LinkedList

/**
 * Test case for [Or].
 *
 *
 *
 * @since 0.8
 *
 *
 */
class OrTest {

    @Test
    @Throws(Exception::class)
    fun allFalse() {
        MatcherAssert.assertThat(
            Or(
                False(),
                False(),
                False(),
                False(),
                False()
            ),
            ScalarHasValue(false)
        )
    }

    @Test
    @Throws(Exception::class)
    fun oneTrue() {
        MatcherAssert.assertThat(
            Or(
                False(),
                True(),
                False(),
                False(),
                False()
            ),
            ScalarHasValue(true)
        )
    }

    @Test
    @Throws(Exception::class)
    fun allTrue() {
        MatcherAssert.assertThat(
            Or(
                IterableOf<Scalar<Boolean>>(
                    True(),
                    True(),
                    True(),
                    True(),
                    True()
                )
            ),
            ScalarHasValue(true)
        )
    }

    @Test
    @Throws(Exception::class)
    fun emptyIterator() {
        MatcherAssert.assertThat(
            Or(emptyList()),
            ScalarHasValue(false)
        )
    }

    @Test
    @Throws(Exception::class)
    fun testProc() {
        val list = LinkedList<Int>()
        Or(
            ProcOf(FuncOf<Int, Unit> { list.add(it) }) as Proc<Int>,
            IterableOf(1, 2, 3, 4)
        ).value()
        MatcherAssert.assertThat(
            list.size,
            Matchers.equalTo(4)
        )
    }

    @Test
    @Throws(Exception::class)
    fun testProcVarargs() {
        val list = LinkedList<Int>()
        Or(
            ProcOf(FuncOf<Int, Unit> { list.add(it) }) as Proc<Int>,
            2, 3, 4
        ).value()
        MatcherAssert.assertThat(
            list.size,
            Matchers.equalTo(3)
        )
    }

    @Test
    @Throws(Exception::class)
    fun testFunc() {
        MatcherAssert.assertThat(
            Or(
                FuncOf<Int, Boolean> { input -> input > 0 },
                IterableOf(- 1, 1, 0)
            ),
            ScalarHasValue(true)
        )
    }

    @Test
    @Throws(Exception::class)
    fun testFuncVarargs() {
        MatcherAssert.assertThat(
            Or(
                FuncOf { input -> input > 0 },
                - 1, - 2, 0
            ),
            ScalarHasValue(false)
        )
    }
}
