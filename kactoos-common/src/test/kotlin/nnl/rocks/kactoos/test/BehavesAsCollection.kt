package nnl.rocks.kactoos.test

import kotlin.test.assertEquals
import kotlin.test.assertTrue

class BehavesAsCollection<T : Any>(
    origin: Collection<T>,
    expected: Array<T>,
    iterations: Int = 3
) {

    init {
        BehavesAsIterable(origin, expected, iterations)
        expected.forEach {
            assertTrue(origin.contains(it), "Collection does not contain expected element: $it")
        }
        assertTrue(origin.containsAll(expected.toList()), "Collection does not contain all expected elements")
        assertEquals(origin.size, expected.size, "Collection does not contain expected number of elements")
        assertEquals(expected.isEmpty(), origin.isEmpty(), "Collection isEmpty does not equals expected isEmpty")
    }
}
