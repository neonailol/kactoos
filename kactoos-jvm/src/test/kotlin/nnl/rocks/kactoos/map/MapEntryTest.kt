
package nnl.rocks.kactoos.map

import org.hamcrest.MatcherAssert
import org.hamcrest.Matchers
import org.junit.Test

/**
 * Test case for [MapEntry].
 *
 * @author Fabricio Cabral (fabriciofx@gmail.com)
 * @version $Id: cb95e740f587aba7489456f4947228a5c0f98bbe $
 * @since 0.9
 * @checkstyle JavadocMethodCheck (500 lines)
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

    @Test(expected = UnsupportedOperationException::class)
    fun cantSetValue() {
        MapEntry("one", "two").setValue("three")
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
                // @checkstyle MagicNumber (1 line)
                Matchers.equalTo(32739498)
        )
    }
}
