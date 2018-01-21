package nnl.rocks.kactoos

import kotlin.test.Test
import kotlin.test.assertEquals

class ProcTest {

    @Test
    fun okForNoNulls() {
        var counter = 0L

        val proc = object : Proc<Long> {
            override fun exec(input: Long) {
                counter += 1
            }
        }

        proc.exec(counter)

        assertEquals(
            counter,
            1L,
            "Can't involve the \"Proc.exec(X input)\" method"
        )
    }
}
