package nnl.rocks.kactoos.iterator

import kotlin.test.Test
import kotlin.test.assertEquals

class EndlessTest {

    @Test
    fun endless() {
        val endless = Endless("Hello")
        for (i in 1 .. 10) {
            assertEquals("Hello", endless.next())
        }
    }
}
