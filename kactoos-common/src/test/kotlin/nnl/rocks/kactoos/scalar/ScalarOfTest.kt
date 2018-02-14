package nnl.rocks.kactoos.scalar

import nnl.rocks.kactoos.dummy
import kotlin.test.Ignore
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
    @Ignore
    fun failForNullArgument() {
        assertFailsWith(Throwable::class) {
            ScalarOf(dummy()).value().hashCode()
        }
    }

    @Test
    @Ignore
    fun failForNullResult() {
        assertFailsWith(Throwable::class) {
            ScalarOf<Any>({ dummy() }).value().toString()
        }
    }
}
