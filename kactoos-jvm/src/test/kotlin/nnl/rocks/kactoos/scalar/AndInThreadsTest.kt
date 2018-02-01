
package nnl.rocks.kactoos.scalar

import nnl.rocks.kactoos.Proc
import nnl.rocks.kactoos.Scalar
import nnl.rocks.kactoos.func.FuncOf
import nnl.rocks.kactoos.iterable.IterableOf
import nnl.rocks.kactoos.iterable.Mapped
import nnl.rocks.kactoos.matchers.MatcherOf
import nnl.rocks.kactoos.matchers.ScalarHasValue
import org.hamcrest.MatcherAssert
import org.hamcrest.Matchers
import org.junit.Test

import java.util.LinkedList

/**
 * Test case for [AndInThreads].
 * @author Vseslav Sekorin (vssekorin@gmail.com)
 * @author Mehmet Yildirim (memoyil@gmail.com)
 * @version $Id: 1b9ff38ef67edb7cd041a0eb1f309e02f0d8708d $
 * @since 0.25
 * @checkstyle JavadocMethodCheck (500 lines)
 * @checkstyle ClassDataAbstractionCouplingCheck (500 lines)
 */
class AndInThreadsTest {

    @Test
    @Throws(Exception::class)
    fun allTrue() {
        MatcherAssert.assertThat(
                AndInThreads(
                        True(),
                        True(),
                        True()
                ).value(),
                Matchers.equalTo(true)
        )
    }

    @Test
    @Throws(Exception::class)
    fun oneFalse() {
        MatcherAssert.assertThat(
                AndInThreads(
                        True(),
                        False(),
                        True()
                ).value(),
                Matchers.equalTo(false)
        )
    }

    @Test
    @Throws(Exception::class)
    fun allFalse() {
        MatcherAssert.assertThat(
                AndInThreads(
                        IterableOf<Scalar<Boolean>>(
                                False(),
                                False(),
                                False()
                        )
                ).value(),
                Matchers.equalTo(false)
        )
    }

    @Test
    @Throws(Exception::class)
    fun emptyIterator() {
        MatcherAssert.assertThat(
                AndInThreads(emptyList()).value(),
                Matchers.equalTo(true)
        )
    }

    @Test
    fun iteratesList() {
        val list = LinkedList<String>()
        MatcherAssert.assertThat(
                "Can't iterate a list with a procedure",
                AndInThreads(
                        Mapped(
                                FuncOf<String, Scalar<Boolean>>(Proc<String> { list.add(it) }, { true }),
                                IterableOf("hello", "world")
                        )
                ),
                ScalarHasValue(
                        Matchers.allOf(
                                Matchers.equalTo<T>(true),
                                MatcherOf { value -> list.size == 2 }
                        )
                )
        )
    }

    @Test
    fun iteratesEmptyList() {
        val list = LinkedList<String>()
        MatcherAssert.assertThat(
                "Can't iterate a list",
                AndInThreads(
                        Mapped(
                                FuncOf<String, Scalar<Boolean>>(Proc<String> { list.add(it) }, { true }), emptyList()
                        )
                ),
                ScalarHasValue(
                        Matchers.allOf(
                                Matchers.equalTo<T>(true),
                                MatcherOf { value -> list.isEmpty() }
                        )
                )
        )
    }

    @Test
    @Throws(Exception::class)
    fun testProc() {
        val list = LinkedList<Int>()
        AndInThreads(
                Proc<Int> { list.add(it) } as Proc<Int>,
                1, 1
        ).value()
        MatcherAssert.assertThat(
                list.size,
                Matchers.equalTo(2)
        )
    }

    @Test
    @Throws(Exception::class)
    fun testFunc() {
        MatcherAssert.assertThat(
                AndInThreads(
                        { input -> input > 0 },
                        1, - 1, 0
                ).value(),
                Matchers.equalTo(false)
        )
    }
}
