package nnl.rocks.kactoos.text

import kotlin.test.Test
import kotlin.test.assertEquals

class TrimmedTextTest {

    @Test
    fun convertsText() {
        assertEquals(
            TrimmedText({ "  Hello!   \t " }).asString(),
            "Hello!",
            "Can't trim a text"
        )
    }

    @Test
    fun trimmedBlankTextIsEmptyText() {
        assertEquals(
            TrimmedText({ "  \t " }).asString(),
            "",
            "Can't trim a blank text"
        )
    }
}
