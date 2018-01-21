package nnl.rocks.kactoos.map

import org.hamcrest.MatcherAssert
import org.hamcrest.Matchers
import org.junit.Test

/**
 * Test case for [MapEntry].
 *
 *
 *
 * @since 0.9
 *
 */
class MapEntryTest {

    @Test
    fun getKey() {
        val key = "hello"
        val value = "world"
        MatcherAssert.assertThat(
            "Can't get key in the map entry",
            MapEntry(key, value).key,
            Matchers.equalTo(key)
        )
    }

    @Test
    fun getValue() {
        val key = "foo"
        val value = "bar"
        MatcherAssert.assertThat(
            "Can't get value in the map entry",
            MapEntry(key, value).value,
            Matchers.equalTo(value)
        )
    }

    @Test
    fun equalsTo() {
        val key = "eo"
        val value = "book"
        MatcherAssert.assertThat(
            "MapEntries are not equals",
            MapEntry(key, value) == MapEntry(key, value),
            Matchers.equalTo(true)
        )
    }

    @Test
    fun compareHash() {
        MatcherAssert.assertThat(
            "the hash code are not equals",
            MapEntry("elegant", "objects").hashCode(),
            Matchers.equalTo(32739498)
        )
    }
}
