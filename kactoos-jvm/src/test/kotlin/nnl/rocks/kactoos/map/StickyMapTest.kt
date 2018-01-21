package nnl.rocks.kactoos.map

import nnl.rocks.kactoos.func.FuncOf
import nnl.rocks.kactoos.iterable.IterableOf
import nnl.rocks.kactoos.iterator.Repeated
import nnl.rocks.kactoos.scalar.ScalarOf
import org.hamcrest.MatcherAssert
import org.hamcrest.Matchers
import org.junit.Test
import java.security.SecureRandom
import java.util.Locale
import java.util.concurrent.atomic.AtomicInteger

/**
 * Test case for [StickyMap].
 * @since 0.8
 */
class StickyMapTest {

    @Test
    fun behavesAsMap() {
        MatcherAssert.assertThat(
            "Can't behave as a map",
            StickyMap<Int, Int, Any>(
                MapEntry(0, - 1),
                MapEntry(1, 1)
            ),
            BehavesAsMap(0, 1)
        )
    }

    @Test
    @Throws(Exception::class)
    fun ignoresChangesInMap() {
        val size = AtomicInteger(2)
        val map = StickyMap<Int, Int, Any>(
            MapOf<Int, Int, Any>(
                Repeated<Map.Entry<Int, Int>>(
                    size.incrementAndGet(), ScalarOf {
                    MapEntry(
                        SecureRandom().nextInt(),
                        1
                    )
                }
                )
            )
        )
        MatcherAssert.assertThat(
            "Can't ignore the changes in the underlying map",
            map.size,
            Matchers.equalTo<Int>(map.size)
        )
    }

    @Test
    @Throws(Exception::class)
    fun decoratesEntries() {
        MatcherAssert.assertThat(
            "Can't decorate a list of entries",
            StickyMap<String, String, Any>(
                MapEntry("first", "Jeffrey"),
                MapEntry("last", "Lebowski")
            ),
            Matchers.hasValue(Matchers.endsWith("ski"))
        )
    }

    @Test
    @Throws(Exception::class)
    fun extendsExistingMap() {
        MatcherAssert.assertThat(
            "Can't extend an existing map",
            StickyMap<String, String, Any>(
                StickyMap<String, String, Any>(
                    MapEntry("make", "Mercedes-Benz"),
                    MapEntry("cost", "$95,000")
                ),
                MapEntry("year", "2017"),
                MapEntry("mileage", "12,000")
            ),
            Matchers.hasValue(Matchers.endsWith(",000"))
        )
    }

    @Test
    @Throws(Exception::class)
    fun extendsExistingMapWithFunc() {
        MatcherAssert.assertThat<StickyMap<String, String, String>>(
            "Can't transform and decorate a list of entries",
            StickyMap<String, String, String>(
                FuncOf { color ->
                    MapEntry(
                        color, color.toUpperCase(Locale.ENGLISH)
                    )
                },
                StickyMap<String, String, String>(
                    MapEntry("black", "BLACK"),
                    MapEntry("white", "WHITE")
                ),
                IterableOf("yellow", "red", "blue")
            ),
            Matchers.hasValue(Matchers.equalTo("BLUE"))
        )
    }

    @Test
    @Throws(Exception::class)
    fun extendsExistingMapWithTwoFuncs() {
        MatcherAssert.assertThat<StickyMap<String, String, String>>(
            "Can't transform and decorate a list of entries with two funcs",
            StickyMap<String, String, String>(
                FuncOf { color -> String.format("[%s]", color) },
                FuncOf { it.toUpperCase() },
                StickyMap<String, String, String>(
                    MapEntry("black!", "Black!"),
                    MapEntry("white!", "White!")
                ),
                IterableOf("yellow!", "red!", "blue!")
            ),
            Matchers.hasValue(Matchers.equalTo("BLUE!"))
        )
    }
}
