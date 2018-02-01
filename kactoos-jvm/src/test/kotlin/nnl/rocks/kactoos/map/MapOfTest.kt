
package nnl.rocks.kactoos.map

import nnl.rocks.kactoos.Scalar
import nnl.rocks.kactoos.iterator.Repeated
import org.hamcrest.MatcherAssert
import org.hamcrest.Matchers
import org.junit.Test

import java.io.IOException
import java.security.SecureRandom
import java.util.concurrent.atomic.AtomicInteger

/**
 * Test case for [MapOf].
 *
 * @author Yegor Bugayenko (yegor256@gmail.com)
 * @version $Id: 0ff141b7a02fcac7eaf92d99e3ca3a97c8be9630 $
 * @since 0.4
 * @checkstyle JavadocMethodCheck (500 lines)
 * @checkstyle ClassDataAbstractionCouplingCheck (500 lines)
 */
class MapOfTest {

    @Test
    fun behavesAsMap() {
        MatcherAssert.assertThat(
                "Can't behave as a map",
                MapNoNulls(
                        MapOf<Int, Int>(
                                MapEntry(0, - 1),
                                MapEntry(1, 1)
                        )
                ),
                BehavesAsMap(0, 1)
        )
    }

    @Test
    fun convertsIterableToMap() {
        MatcherAssert.assertThat<MapOf<Int, String>>(
                "Can't convert iterable to map",
                MapOf<Int, String>(
                        MapEntry(0, "hello, "),
                        MapEntry(1, "world!")
                ),
                Matchers.hasEntry(
                        Matchers.equalTo(0),
                        Matchers.startsWith("hello")
                )
        )
    }

    @Test
    @Throws(Exception::class)
    fun sensesChangesInMap() {
        val size = AtomicInteger(2)
        val map = MapOf<Int, Int, Any>(
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
        MatcherAssert.assertThat(
                "Can't sense the changes in the underlying map",
                map.size,
                Matchers.not(Matchers.equalTo<Int>(map.size))
        )
    }

    @Test
    fun createsMapWithFunctions() {
        MatcherAssert.assertThat<MapOf<Int, Scalar<Boolean>>>(
                "Can't create a map with functions as values",
                MapOf<Int, Scalar<Boolean>>(
                        MapEntry<K, V>(0, { true }),
                        MapEntry<K, V>(
                                1,
                                { throw IOException("oops") }
                        )
                ),
                Matchers.hasKey(0)
        )
    }
}
