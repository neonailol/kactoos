package nnl.rocks.kactoos.scalar

import nnl.rocks.kactoos.RunsInThreads
import nnl.rocks.kactoos.func.FuncOf
import nnl.rocks.kactoos.list.ListOf
import org.hamcrest.MatcherAssert
import org.hamcrest.Matchers
import org.junit.Test
import java.security.SecureRandom

/**
 * Test case for [SolidScalar].
 *
 *
 *
 * @since 0.24
 *
 */
class SolidScalarTest {

    @Test
    @Throws(Exception::class)
    fun cachesScalarResults() {
        val scalar = SolidScalar(
            ScalarOf { SecureRandom().nextInt() }
        )
        MatcherAssert.assertThat(
            scalar.value() + scalar.value(),
            Matchers.equalTo(scalar.value() + scalar.value())
        )
    }

    @Test
    fun worksInThreads() {
        MatcherAssert.assertThat<FuncOf<UncheckedScalar<ListOf<Int>>, Boolean>>(
            "Can't work well in multiple threads",
            FuncOf { scalar ->
                MatcherAssert.assertThat(
                    scalar.value(),
                    Matchers.equalTo<ListOf<Int>>(scalar.value())
                )
                true
            },
            RunsInThreads(
                UncheckedScalar(
                    SolidScalar(ScalarOf { ListOf(1, 2) })
                )
            )
        )
    }
}
