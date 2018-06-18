package nnl.rocks.kactoos.collection

import nnl.rocks.kactoos.test.BehavesAsCollection
import kotlin.test.Test

class CollectionNoNullsTest {

    @Test
    fun collection() {
        BehavesAsCollection(
            CollectionNoNulls(CollectionOf(1, 2, 3)),
            arrayOf(1, 2, 3)
        )
    }
}
