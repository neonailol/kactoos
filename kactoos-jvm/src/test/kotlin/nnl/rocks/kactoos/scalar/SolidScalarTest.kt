
package nnl.rocks.kactoos.scalar

import nnl.rocks.kactoos.list.ListOf
import nnl.rocks.kactoos.matchers.RunsInThreads
import org.hamcrest.MatcherAssert
import org.hamcrest.Matchers
import org.junit.Test

import java.security.SecureRandom

/**
 * Test case for [SolidScalar].
 *
 * @author Yegor Bugayenko (yegor256@gmail.com)
 * @version $Id: 1eaa9cf08bd4ba2f4110345601696ad3d8eb3d04 $
 * @since 0.24
 * @checkstyle JavadocMethodCheck (500 lines)
 */
class SolidScalarTest {

    @Test
    @Throws(Exception::class)
    fun cachesScalarResults() {
        val scalar = SolidScalar<Int>(
                { SecureRandom().nextInt() }
        )
        MatcherAssert.assertThat(
                scalar.value() + scalar.value(),
                Matchers.equalTo<Int>(scalar.value() + scalar.value())
        )
    }

    @Test
    fun worksInThreads() {
        MatcherAssert.assertThat(
                "Can't work well in multiple threads",
                { scalar ->
                    MatcherAssert.assertThat(
                            scalar.value(),
                            Matchers.equalTo(scalar.value())
                    )
                    true
                },
                RunsInThreads(
                        UncheckedScalar<T>(
                                SolidScalar<ListOf<Int>>({ ListOf(1, 2) })
                        )
                )
        )
    }
}
