
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
 * Test case for [And].
 * @author Vseslav Sekorin (vssekorin@gmail.com)
 * @author Mehmet Yildirim (memoyil@gmail.com)
 * @version $Id: 9b2ff9f3af150b49cfd35bf87764e0503e187c50 $
 * @since 0.8
 * @checkstyle JavadocMethodCheck (500 lines)
 * @checkstyle ClassDataAbstractionCouplingCheck (500 lines)
 */
class AndTest {

    @Test
    @Throws(Exception::class)
    fun allTrue() {
        MatcherAssert.assertThat(
                And(
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
                And(
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
                And(
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
                And(emptyList()).value(),
                Matchers.equalTo(true)
        )
    }

    @Test
    fun iteratesList() {
        val list = LinkedList<String>()
        MatcherAssert.assertThat(
                "Can't iterate a list with a procedure",
                And(
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
                And(
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
        And(
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
                And(
                        { input -> input > 0 },
                        1, - 1, 0
                ).value(),
                Matchers.equalTo(false)
        )
    }
}
