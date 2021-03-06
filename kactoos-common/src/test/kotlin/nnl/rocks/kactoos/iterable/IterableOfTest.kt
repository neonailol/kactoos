package nnl.rocks.kactoos.iterable

import nnl.rocks.kactoos.iterator.IteratorOf
import nnl.rocks.kactoos.scalar.Constant
import nnl.rocks.kactoos.test.BehavesAsIterable
import kotlin.test.Test

class IterableOfTest {

    @Test
    fun canIterateOverItems() {
        BehavesAsIterable(
            IterableOf(
                'a', 'b', 'c'
            ),
            arrayOf('a', 'b', 'c')
        )
    }

    @Test
    fun canIterateOverList() {
        BehavesAsIterable(
            IterableOf(
                listOf('a', 'b', 'c')
            ),
            arrayOf('a', 'b', 'c')
        )
    }

    @Test
    fun canIterateOverSet() {
        BehavesAsIterable(
            IterableOf(
                setOf('a', 'b', 'c')
            ),
            arrayOf('a', 'b', 'c')
        )
    }

    @Test
    fun canIterateOverScalarIterator() {
        BehavesAsIterable(
            IterableOf(
                Constant { IteratorOf('a', 'b', 'c') }
            ),
            arrayOf('a', 'b', 'c')
        )
    }

}
