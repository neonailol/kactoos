package nnl.rocks.kactoos.scalar

import nnl.rocks.kactoos.test.AssertScalarsEquals
import nnl.rocks.kactoos.text.TextOf
import kotlin.test.Test

class BoolOfTest {

    @Test
    fun trueTest() {
        AssertScalarsEquals(
            BoolOf("TruE"),
            True(),
            "Can't parse 'true' string"
        )
    }

    @Test
    fun falseTest() {
        AssertScalarsEquals(
            BoolOf(TextOf { "fALSe" }),
            False(),
            "Can't parse 'false' string"
        )
    }

    @Test
    fun isFalseIfTextDoesNotRepresentABoolean() {
        AssertScalarsEquals(
            BoolOf("abc"),
            False(),
            "Can't parse a non-boolean string"
        )
    }
}
