package nnl.rocks.kactoos.text

import nnl.rocks.kactoos.scalar.False
import nnl.rocks.kactoos.scalar.True
import nnl.rocks.kactoos.test.AssertScalarsEquals
import kotlin.test.Test

class IsBlankTest {

    @Test
    fun determinesEmptyText() {
        AssertScalarsEquals(
            IsBlank { "" },
            True(),
            "Can't determine an empty text"
        )
    }

    @Test
    fun determinesBlankText() {
        AssertScalarsEquals(
            IsBlank { "  " },
            True(),
            "Can't determine an empty text with spaces"
        )
    }

    @Test
    fun determinesNotBlankText() {
        AssertScalarsEquals(
            IsBlank { "not empty" },
            False(),
            "Can't detect a non empty text"
        )
    }
}
