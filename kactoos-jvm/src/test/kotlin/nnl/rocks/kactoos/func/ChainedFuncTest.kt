package nnl.rocks.kactoos.func

import nnl.rocks.kactoos.iterable.Filtered
import nnl.rocks.kactoos.iterable.IterableOf
import nnl.rocks.kactoos.iterable.LengthOf
import nnl.rocks.kactoos.iterable.Mapped
import org.hamcrest.MatcherAssert
import org.hamcrest.Matchers
import org.junit.Test

/**
 * Test case for [ChainedFunc].
 *
 *
 *
 * @since 0.7
 *
 *
 */
class ChainedFuncTest {

    @Test
    @Throws(Exception::class)
    fun withoutIterable() {
        MatcherAssert.assertThat(
            LengthOf(
                Filtered(
                    FuncOf<String, Boolean> { input -> input.endsWith("12") }, Mapped(
                    ChainedFunc<String, String, String>(
                        FuncOf { input -> input + "1" },
                        FuncOf { input -> input + "2" }
                    ), IterableOf("public", "final", "class")
                )
                )
            ).toInt(),
            Matchers.equalTo(3)
        )
    }

    @Test
    @Throws(Exception::class)
    fun withIterable() {
        MatcherAssert.assertThat(
            LengthOf(
                Filtered(
                    FuncOf<String, Boolean> { input -> ! input.startsWith("st") }, Mapped(
                    ChainedFunc<String, String, String>(
                        FuncOf { input -> input + "1" },
                        IterableOf(
                            FuncOf { input -> input + "2" },
                            FuncOf { input -> input.replace("a".toRegex(), "b") }
                        ),
                        FuncOf { it.trim { it <= ' ' } }
                    ), IterableOf("private", "static", "String")
                )
                )
            ).toInt(),
            Matchers.equalTo(2)
        )
    }
}
