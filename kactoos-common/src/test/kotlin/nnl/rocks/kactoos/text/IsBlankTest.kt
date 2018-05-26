package nnl.rocks.kactoos.text

import nnl.rocks.kactoos.scalar.False
import nnl.rocks.kactoos.scalar.True
import kotlin.test.Test
import kotlin.test.assertEquals

class IsBlankTest {

    @Test
    fun determinesEmptyText() {
        assertEquals(
            IsBlank(
                { "" }
            ).invoke(),
            True().invoke(),
            "Can't determine an empty text"
        )
    }

    @Test
    fun determinesBlankText() {
        assertEquals(
            IsBlank(
                { "  " }
            ).invoke(),
            True().invoke(),
            "Can't determine an empty text with spaces"
        )
    }

    @Test
    fun determinesNotBlankText() {
        assertEquals(
            IsBlank(
                { "not empty" }
            ).invoke(),
            False().invoke(),
            "Can't detect a nonempty text"
        )
    }
}
