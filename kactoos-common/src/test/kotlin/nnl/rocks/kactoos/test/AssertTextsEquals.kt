package nnl.rocks.kactoos.test

import nnl.rocks.kactoos.Text
import kotlin.test.assertEquals

class AssertTextsEquals(
    expected: Text,
    actual: Text,
    message: String
) {

    init {
        assertEquals(expected, actual, message)
    }
}
