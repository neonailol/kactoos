package nnl.rocks.kactoos.test

import nnl.rocks.kactoos.text.TextEnvelope

fun TextOf(string: String): TextEnvelope = object : TextEnvelope(string) {}
