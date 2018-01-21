package nnl.rocks.kactoos.map

import nnl.rocks.kactoos.Scalar
import nnl.rocks.kactoos.iterable.Repeated
import nnl.rocks.kactoos.scalar.ScalarOf
import nnl.rocks.kactoos.scalar.UncheckedScalar
import org.hamcrest.MatcherAssert
import org.hamcrest.Matchers
import org.junit.Ignore
import org.junit.Test
import java.io.IOException
import java.security.SecureRandom
import java.util.concurrent.atomic.AtomicInteger

/**
 * Test case for [MapOf].
 *
 *
 *
 * @since 0.4
 *
 *
 */
class MapOfTest {

    @Test
    fun behavesAsMap() {
        MatcherAssert.assertThat(
            "Can't behave as a map",
            MapNoNulls(
                MapOf<Int, Int, Any>(
                    MapEntry(0, - 1),
                    MapEntry(1, 1)
                )
            ),
            BehavesAsMap(0, 1)
        )
    }

    @Test
    fun convertsIterableToMap() {
        MatcherAssert.assertThat(
            "Can't convert iterable to map",
            MapOf<Int, String, Any>(
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
    @Ignore
    fun sensesChangesInMap() {
        val size = AtomicInteger(2)
        val map = MapOf<Int, Int, Any>(
            Repeated<Map.Entry<Int, Int>>(
                size.incrementAndGet(),
                UncheckedScalar(
                    ScalarOf(
                        MapEntry(
                            SecureRandom().nextInt(),
                            1
                        )
                    )
                )
            )
        )
        MatcherAssert.assertThat(
            "Can't sense the changes in the underlying map",
            map.size,
            Matchers.not(Matchers.equalTo<Int>(map.size))
        )
    }

    @Test
    fun createsMapWithFunctions() {
        MatcherAssert.assertThat(
            "Can't create a map with functions as values",
            MapOf<Int, Scalar<Boolean>, Any>(
                MapEntry(0, ScalarOf { true }),
                MapEntry(
                    1,
                    ScalarOf<Boolean> { throw IOException("oops") }
                )
            ),
            Matchers.hasKey(0)
        )
    }
}
