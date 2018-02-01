
package nnl.rocks.kactoos.iterator

import nnl.rocks.kactoos.list.ListOf
import org.hamcrest.MatcherAssert
import org.hamcrest.Matchers
import org.junit.Test

import java.util.Arrays
import java.util.concurrent.locks.ReentrantReadWriteLock

// @todo #482:30min add multi-threaded tests which test that the lock syncs the
//  access to the next method against next and hasNext calls and calls to the
//  hasNext method against next calls.

/**
 * Test for [SyncIterator].
 *
 * @author Sven Diedrichsen (sven.diedrichsen@gmail.com)
 * @version $Id: 0678ca60044cda75a3feeaafb496aff1f4b0e1b3 $
 * @since 1.0
 * @checkstyle JavadocMethodCheck (500 lines)
 * @checkstyle MagicNumberCheck (500 lines)
 * @checkstyle TodoCommentCheck (500 lines)
 */
class SyncIteratorTest {

    @Test
    fun syncIteratorReturnsCorrectValuesWithExternalLock() {
        val lock = ReentrantReadWriteLock()
        MatcherAssert.assertThat<Array<Any>>(
                "Unexpected value found.",
                ListOf(
                        SyncIterator(
                                Arrays.asList("a", "b").iterator(), lock
                        )
                ).toTypedArray(),
                Matchers.equalTo(arrayOf<Any>("a", "b"))
        )
    }

    @Test
    fun syncIteratorReturnsCorrectValuesWithInternalLock() {
        MatcherAssert.assertThat<Array<Any>>(
                "Unexpected value found.",
                ListOf(
                        SyncIterator(
                                Arrays.asList("a", "b").iterator()
                        )
                ).toTypedArray(),
                Matchers.equalTo(arrayOf<Any>("a", "b"))
        )
    }
}
