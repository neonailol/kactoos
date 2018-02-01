
package nnl.rocks.kactoos.scalar

import nnl.rocks.kactoos.io.InputOf
import nnl.rocks.kactoos.iterator.Repeated
import nnl.rocks.kactoos.map.MapEntry
import nnl.rocks.kactoos.map.MapOf
import nnl.rocks.kactoos.map.StickyMap
import nnl.rocks.kactoos.matchers.MatcherOf
import nnl.rocks.kactoos.matchers.ScalarHasValue
import org.hamcrest.MatcherAssert
import org.hamcrest.Matchers
import org.junit.Test

import java.security.SecureRandom
import java.util.Properties
import java.util.concurrent.atomic.AtomicInteger

/**
 * Test case for [PropertiesOf].
 *
 * @author Yegor Bugayenko (yegor256@gmail.com)
 * @version $Id: 07eaa9d5042954717be1272970fbefb765f40945 $
 * @since 0.7
 * @checkstyle JavadocMethodCheck (500 lines)
 * @checkstyle ClassDataAbstractionCouplingCheck (500 lines)
 */
class PropertiesOfTest {

    @Test
    fun readsStringContent() {
        MatcherAssert.assertThat(
                "Can't read properties from an input string",
                PropertiesOf(
                        "foo=Hello, world!\nbar=works fine?\n"
                ),
                ScalarHasValue(
                        MatcherOf<Properties> { props -> "Hello, world!" == props.getProperty("foo") }
                )
        )
    }

    @Test
    fun readsInputContent() {
        MatcherAssert.assertThat(
                "Can't read properties from an input",
                PropertiesOf(
                        InputOf("greet=Hello, inner world!\nask=works fine?\n")
                ),
                ScalarHasValue(
                        MatcherOf<Properties> { props -> "Hello, inner world!" == props.getProperty("greet") }
                )
        )
    }

    @Test
    fun convertsMapToProperties() {
        MatcherAssert.assertThat(
                "Can't convert map to properties",
                PropertiesOf(
                        StickyMap(
                                MapOf<Int, String>(
                                        MapEntry(0, "hello, world"),
                                        MapEntry(1, "how are you?")
                                )
                        )
                ),
                ScalarHasValue(
                        MatcherOf<Properties> { props -> props.getProperty("0").endsWith(", world") }
                )
        )
    }

    @Test
    @Throws(Exception::class)
    fun sensesChangesInMap() {
        val size = AtomicInteger(2)
        val props = PropertiesOf(
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
                "Can't sense the changes in the underlying map",
                props.value().size,
                Matchers.not(Matchers.equalTo<Int>(props.value().size))
        )
    }
}
