
package nnl.rocks.kactoos.map

import nnl.rocks.kactoos.matchers.RunsInThreads
import org.hamcrest.MatcherAssert
import org.junit.Test

/**
 * Test case for [StickyMap].
 *
 * @author Yegor Bugayenko (yegor256@gmail.com)
 * @version $Id: fb58a0b707413b1979353fe7338ef7351fbcdad8 $
 * @since 0.24
 * @checkstyle JavadocMethodCheck (500 lines)
 * @checkstyle ClassDataAbstractionCouplingCheck (500 lines)
 */
class SyncMapTest {

    @Test
    fun behavesAsMap() {
        MatcherAssert.assertThat<SyncMap<Int, Int>>(
                "Can't behave as a map",
                SyncMap<Int, Int>(
                        MapEntry(0, - 1),
                        MapEntry(1, 1)
                ),
                BehavesAsMap(0, 1)
        )
    }

    @Test
    fun worksInThreads() {
        MatcherAssert.assertThat(
                "Can't behave as a map in multiple threads",
                { map ->
                    MatcherAssert.assertThat<T>(map, BehavesAsMap(0, 1))
                    true
                },
                RunsInThreads(
                        SyncMap<Int, Int>(
                                MapEntry(0, - 1),
                                MapEntry(1, 1)
                        )
                )
        )
    }
}
