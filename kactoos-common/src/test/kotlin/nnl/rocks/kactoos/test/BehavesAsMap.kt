package nnl.rocks.kactoos.test

import kotlin.test.assertEquals
import kotlin.test.assertTrue

class BehavesAsMap<K : Any, V : Any>(
    origin: Map<K, V>,
    expected: Map<K, V>
) {

    init {
        assertEquals(origin.size, expected.size, "Size of maps did not match")
        assertEquals(origin.isEmpty(), expected.isEmpty(), "Emptiness of map does not equals")
        expected.keys.forEach {
            assertTrue(origin.containsKey(it), "Map does not contain expected key $it")
            assertEquals(expected[it], origin[it], "Values for key $it did not match")
        }
        expected.values.forEach {
            assertTrue(origin.containsValue(it), "Map does not contain expected value $it")
        }
        assertEquals(expected.keys.size, origin.keys.size, "Map contain different number of keys")
        assertEquals(expected.values.size, origin.values.size, "Map contain different number of keys")
    }
}
