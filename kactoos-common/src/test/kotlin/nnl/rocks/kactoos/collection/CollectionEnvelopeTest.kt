package nnl.rocks.kactoos.collection

import kotlin.test.Test
import kotlin.test.assertTrue

class CollectionEnvelopeTest {

    @Test
    fun containsAllValues() {
        val listOf = listOf("one", "two", "three")
        assertTrue(
            CollectionEnvelope(listOf).containsAll(listOf),
            "Envelope does not contain all values from original list"
        )
    }
}
