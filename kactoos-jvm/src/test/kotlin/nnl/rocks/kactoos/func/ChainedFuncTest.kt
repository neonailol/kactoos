
package nnl.rocks.kactoos.func

import nnl.rocks.kactoos.Func
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
 * @author Vseslav Sekorin (vssekorin@gmail.com)
 * @version $Id: 3e3cee5ce08a8f4010b93c41e6b878a91234f003 $
 * @since 0.7
 * @checkstyle JavadocMethodCheck (500 lines)
 * @checkstyle MagicNumber (500 line)
 */
class ChainedFuncTest {

    @Test
    @Throws(Exception::class)
    fun withoutIterable() {
        MatcherAssert.assertThat(
                LengthOf(
                        Filtered<String>(
                                { input -> input.endsWith("12") }, Mapped(
                                ChainedFunc<String, String, String>(
                                        { input -> input + "1" },
                                        { input -> input + "2" }
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
                        Filtered<String>(
                                { input -> ! input.startsWith("st") }, Mapped(
                                ChainedFunc<String, String, String>(
                                        { input -> input + "1" },
                                        IterableOf(
                                                { input -> input + "2" },
                                                { input -> input.replace("a".toRegex(), "b") }
                                        ),
                                        Func<String, String> { it.trim({ it <= ' ' }) }
                                ), IterableOf("private", "static", "String")
                        )
                        )
                ).toInt(),
                Matchers.equalTo(2)
        )
    }
}
