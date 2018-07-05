package nnl.rocks.kactoos.map

import kotlin.test.Test
import kotlin.test.assertFailsWith
import kotlin.test.assertFalse
import kotlin.test.assertNotNull
import kotlin.test.assertNull
import kotlin.test.assertTrue

class MapEnvelopeTest {

    @Test
    fun testUnsafeGet() {
        val mapOf = MapOf(MapEntry("key", "value"))
        assertTrue(mapOf.containsKey("key"), "Map does not contain key `key`")
        assertNotNull(mapOf["key"], "Value for key `key` is null")
        assertFalse(mapOf.containsKey("invalid"), "Map should not contain key `invalid`")
        assertNull(mapOf["invalid"], "Value for key `invalid` should be null")
        assertNotNull(mapOf.unsafeGet("key"), "Map should have not null value for specified key")
        assertFailsWith(NullPointerException::class, "Should throw NPE for invalid key") {
            mapOf.unsafeGet("invalid")
        }
    }
}
