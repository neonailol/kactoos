package nnl.rocks.kactoos.iterable

import kotlin.test.Test
import kotlin.test.assertEquals

class IterableOfTest {

    @Test
    fun canIterateOverItems() {
        assertEquals(
            3,
            LengthOf(
                IterableOf(
                    'a', 'b', 'c'
                )
            ).toInt(),
            "Can't iterate over items"
        )
    }

    @Test
    fun canIterateOverList() {
        assertEquals(
            3,
            LengthOf(
                IterableOf(
                    listOf('a', 'b', 'c')
                )
            ).toInt(),
            "Can't iterate over list of items"
        )
    }

    @Test
    fun canIterateOverSet() {
        assertEquals(
            3,
            LengthOf(
                IterableOf(
                    setOf('a', 'b', 'c')
                )
            ).toInt(),
            "Can't iterate over set of items"
        )
    }

    @Test
    fun canIterateOverIterator() {
        assertEquals(
            3,
            LengthOf(
                IterableOf(
                    setOf('a', 'b', 'c').iterator()
                )
            ).toInt(),
            "Can't iterate over iterator of items"
        )
    }

}
