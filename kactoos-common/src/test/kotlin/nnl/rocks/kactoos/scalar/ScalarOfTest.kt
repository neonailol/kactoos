package nnl.rocks.kactoos.scalar

import nnl.rocks.kactoos.dummy
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith

class ScalarOfTest {

    @Test
    fun okForNoNulls() {
        assertEquals(
            "Hello",
            ScalarOf(
                "Hello"
            ).value()
        )
    }

    @Test
    fun failForNullArgument() {
        assertFailsWith(
            Throwable::class,
            {
                ScalarOf(
                    dummy()
                ).value().hashCode()
            }
        )
    }

    @Test
    fun failForNullResult() {
        assertFailsWith(
            Throwable::class,
            {
                ScalarOf<Any>(
                    { dummy() }
                ).value().toString()
            }
        )
    }
}
