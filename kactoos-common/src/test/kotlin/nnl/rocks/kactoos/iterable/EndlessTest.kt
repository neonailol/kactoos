package nnl.rocks.kactoos.iterable

import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

class EndlessTest {

    @Test
    fun endless() {
        val endless = Endless(1).iterator()
        for (i in 1 .. 10) {
            assertTrue(endless.hasNext())
            assertEquals(1, endless.next())
        }
    }
}
