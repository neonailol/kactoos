package nnl.rocks.kactoos.test

import nnl.rocks.kactoos.text.TextEnvelope
import kotlin.test.assertEquals

class AssertTextsEquals(
    expected: TextEnvelope,
    actual: TextEnvelope,
    message: String
) {

    init {
        assertEquals(expected.asString(), actual.asString(), message)
    }
}
