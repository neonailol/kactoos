package nnl.rocks.kactoos.collection

import nnl.rocks.kactoos.test.BehavesAsCollection
import kotlin.test.Test

class CollectionEnvelopeTest {

    @Test
    fun containsAllValues() {
        BehavesAsCollection(
            CollectionEnvelope(listOf("one", "two", "three")),
            arrayOf("one", "two", "three")
        )
    }
}
