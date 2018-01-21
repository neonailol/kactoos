package nnl.rocks.kactoos

import kotlin.test.Test
import kotlin.test.assertEquals

class ProcTest {

    @Test
    fun okForNoNulls() {
        var counter = 0L

        object : Proc<Long> {
            override fun exec(input: Long) {
                counter += input
            }
        }.exec(1L)

        assertEquals(
            counter,
            1L,
            "Can't involve the \"Proc.exec(X input)\" method"
        )
    }
}
