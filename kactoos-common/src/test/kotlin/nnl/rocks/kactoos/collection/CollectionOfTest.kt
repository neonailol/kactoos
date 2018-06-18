package nnl.rocks.kactoos.collection

import nnl.rocks.kactoos.test.BehavesAsCollection
import kotlin.test.Test

class CollectionOfTest {

    @Test
    fun collectionFromList() {
        BehavesAsCollection(
            CollectionOf(listOf("one", "two", "three")),
            arrayOf("one", "two", "three")
        )
    }

    @Test
    fun collectionFromArray() {
        BehavesAsCollection(
            CollectionOf("one", "two", "three"),
            arrayOf("one", "two", "three")
        )
    }

}
