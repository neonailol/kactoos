package nnl.rocks.kactoos.test

import kotlin.test.assertEquals

class BehavesAsList<T : Any>(
    origin: List<T>,
    expected: Array<T>,
    iterations: Int = 3
) {

    init {
        BehavesAsCollection(
            origin,
            expected,
            iterations
        )
        expected.forEachIndexed { index, value ->
            assertEquals(value, origin[index], "List does not contains expected value at index $index")
            assertEquals(index, origin.indexOf(value), "Expected index for value $value did not match")
            assertEquals(index, origin.lastIndexOf(value), "Expected last index for value $value did not match")
        }
    }
}
