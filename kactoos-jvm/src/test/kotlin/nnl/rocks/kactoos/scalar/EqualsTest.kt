
package nnl.rocks.kactoos.scalar

import org.hamcrest.MatcherAssert
import org.hamcrest.Matchers
import org.junit.Test

/**
 * Test case for [Equals].
 *
 * @author Fabricio Cabral (fabriciofx@gmail.com)
 * @version $Id: 45a0c68d3edf690f14d2a8e795bc5f2c307ad366 $
 * @since 0.9
 * @checkstyle JavadocMethodCheck (500 lines)
 */
class EqualsTest {

    @Test
    @Throws(Exception::class)
    fun compareEquals() {
        MatcherAssert.assertThat(
                "Can't compare if two integers are equals",
                Equals<Int>(
                        { 1 },
                        { 1 }
                ).value(),
                Matchers.equalTo(true)
        )
    }

    @Test
    @Throws(Exception::class)
    fun compareNotEquals() {
        MatcherAssert.assertThat(
                "Can't compare if two integers are not equals",
                Equals<Int>(
                        { 1 },
                        { 2 }
                ).value(),
                Matchers.equalTo(false)
        )
    }

    @Test
    @Throws(Exception::class)
    fun compareEqualsText() {
        val str = "hello"
        MatcherAssert.assertThat(
                "Can't compare if two strings are equals",
                Equals<String>(
                        { str },
                        { str }
                ).value(),
                Matchers.equalTo(true)
        )
    }

    @Test
    @Throws(Exception::class)
    fun compareNotEqualsText() {
        MatcherAssert.assertThat(
                "Can't compare if two strings are not equals",
                Equals<String>(
                        { "world" },
                        { "worle" }
                ).value(),
                Matchers.equalTo(false)
        )
    }
}
