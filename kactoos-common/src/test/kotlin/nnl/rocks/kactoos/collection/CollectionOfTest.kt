package nnl.rocks.kactoos.collection

import kotlin.test.Test
import kotlin.test.assertTrue

class CollectionOfTest {

    @Test
    fun collectionFromList() {
        val listOf = listOf("one", "two", "three")
        assertTrue(
            CollectionOf(listOf).containsAll(listOf),
            "CollectionOf does not contain all values from original list"
        )
    }

    @Test
    fun collectionFromIterable() {
        val listOf = listOf("one", "two", "three")
        assertTrue(
            CollectionOf(listOf.asIterable()).containsAll(listOf),
            "CollectionOf does not contain all values from original list"
        )
    }

    @Test
    fun collectionFromIterator() {
        val listOf = listOf("one", "two", "three")
        assertTrue(
            CollectionOf(listOf.iterator()).containsAll(listOf),
            "CollectionOf does not contain all values from original list"
        )
    }
}
