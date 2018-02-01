
package nnl.rocks.kactoos.map

import nnl.rocks.kactoos.iterable.IterableOf
import nnl.rocks.kactoos.iterator.Repeated
import org.hamcrest.MatcherAssert
import org.hamcrest.Matchers
import org.junit.Test

import java.security.SecureRandom
import java.util.Locale
import java.util.concurrent.atomic.AtomicInteger

/**
 * Test case for [StickyMap].
 *
 * @author Yegor Bugayenko (yegor256@gmail.com)
 * @version $Id: 22b673cf4f3b1b11d8dffe0b1ff1607e5af609da $
 * @since 0.8
 * @checkstyle JavadocMethodCheck (500 lines)
 * @checkstyle ClassDataAbstractionCouplingCheck (500 lines)
 */
class StickyMapTest {

    @Test
    fun behavesAsMap() {
        MatcherAssert.assertThat<StickyMap<Int, Int>>(
                "Can't behave as a map",
                StickyMap<Int, Int>(
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
                        {
                            Repeated<Entry<out Int, out Int>>(
                                    size.incrementAndGet(), {
                                MapEntry(
                                        SecureRandom().nextInt(),
                                        1
                                )
                            }
                            )
                        }
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
        MatcherAssert.assertThat<StickyMap<String, String>>(
                "Can't decorate a list of entries",
                StickyMap<String, String>(
                        MapEntry("first", "Jeffrey"),
                        MapEntry("last", "Lebowski")
                ),
                Matchers.hasValue(Matchers.endsWith("ski"))
        )
    }

    @Test
    @Throws(Exception::class)
    fun extendsExistingMap() {
        MatcherAssert.assertThat<StickyMap<String, String>>(
                "Can't extend an existing map",
                StickyMap<String, String>(
                        StickyMap<String, String>(
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
        MatcherAssert.assertThat<StickyMap<String, String>>(
                "Can't transform and decorate a list of entries",
                StickyMap<String, String>(
                        { color ->
                            MapEntry<K, V>(
                                    color, color.toUpperCase(Locale.ENGLISH)
                            )
                        },
                        StickyMap<String, String>(
                                MapEntry("black", "BLACK"),
                                MapEntry("white", "WHITE")
                        ),
                        IterableOf<X>("yellow", "red", "blue")
                ),
                Matchers.hasValue(Matchers.equalTo("BLUE"))
        )
    }

    @Test
    @Throws(Exception::class)
    fun extendsExistingMapWithTwoFuncs() {
        MatcherAssert.assertThat<StickyMap<String, String>>(
                "Can't transform and decorate a list of entries with two funcs",
                StickyMap<String, String>(
                        { color -> String.format("[%s]", color) },
                        Func { toUpperCase() },
                        StickyMap<String, String>(
                                MapEntry("black!", "Black!"),
                                MapEntry("white!", "White!")
                        ),
                        IterableOf<X>("yellow!", "red!", "blue!")
                ),
                Matchers.hasValue(Matchers.equalTo("BLUE!"))
        )
    }
}
