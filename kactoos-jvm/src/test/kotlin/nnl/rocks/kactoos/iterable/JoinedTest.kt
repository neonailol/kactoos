package nnl.rocks.kactoos.iterable

import nnl.rocks.kactoos.func.FuncOf
import org.hamcrest.MatcherAssert
import org.hamcrest.Matchers
import org.junit.Test

/**
 * Test case for [Joined].
 *
 *
 * @since 0.1
 *
 *
 */
class JoinedTest {

    @Test
    fun transformsList() {
        MatcherAssert.assertThat(
            "Can't concatenate iterables together",
            LengthOf(
                Joined(
                    IterableOf("hello", "world", "друг"),
                    IterableOf("how", "are", "you"),
                    IterableOf("what's", "up")
                )
            ).toInt(),
            Matchers.equalTo(8)
        )
    }

    @Test
    fun joinsIterables() {
        MatcherAssert.assertThat(
            "Can't concatenate mapped iterables together",
            Joined(
                Mapped(
                    FuncOf<String, Iterable<String>> { IterableOf(it) },
                    IterableOf("x")
                )
            ),
            Matchers.iterableWithSize(1)
        )
    }

    @Test
    fun joinsIterablesWithSize() {
        val list = Joined(
            IterableOf(1, 2, - 1, 0, 1),
            IterableOf(),
            IterableOf(1, - 1, 0, 0),
            IterableOf(1)
        )
        MatcherAssert.assertThat<Iterable<Int>>(
            "Can't concatenate four iterables together",
            list, Matchers.iterableWithSize(10)
        )
        MatcherAssert.assertThat<Iterable<Int>>(
            "Can't concatenate four iterables together, again",
            list, Matchers.iterableWithSize(10)
        )
    }
}
