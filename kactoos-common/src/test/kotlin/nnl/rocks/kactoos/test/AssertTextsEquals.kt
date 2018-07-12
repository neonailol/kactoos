package nnl.rocks.kactoos.test

import nnl.rocks.kactoos.Text
import kotlin.test.assertEquals

class AssertTextsEquals(
    actual: Text,
    expected: Text,
    message: String
) {
    init {
        assertEquals(expected, actual, message)
    }
}
