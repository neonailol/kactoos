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
            Constant(
                "Hello"
            ).value()
        )
    }

    @Test
    @Ignore
    fun failForNullArgument() {
        assertFailsWith(Throwable::class) {
            Constant(dummy()).value().hashCode()
        }
    }

    @Test
    @Ignore
    fun failForNullResult() {
        assertFailsWith(Throwable::class) {
            Constant<Any>({ dummy() }).value().toString()
        }
    }
}
