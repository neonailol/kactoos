package nnl.rocks.kactoos.collection

import nnl.rocks.kactoos.iterable.IterableOf
import nnl.rocks.kactoos.iterable.LengthOf
import org.hamcrest.MatcherAssert
import org.hamcrest.Matchers
import org.junit.Test

/**
 * Test case for [nnl.rocks.kactoos.collection.Filtered].
 *
 * @author Vseslav Sekorin (vssekorin@gmail.com)
 * @version $Id: 050e003f314baa136e1cb18ff072130dc97cd035 $
 * @since 0.16
 * @checkstyle JavadocMethodCheck (500 lines)
 * @checkstyle MagicNumber (500 line)
 */
class FilteredTest {

    @Test
    @Throws(Exception::class)
    fun behavesAsCollection() {
        MatcherAssert.assertThat(
            "Can't behave as a collection",
            Filtered({ i -> i < 2 }, 1, 2, 0, - 1),
            BehavesAsCollection(- 1)
        )
    }

    @Test
    fun filterList() {
        MatcherAssert.assertThat(
            LengthOf(
                Filtered<String>(
                    { input -> input.length > 4 },
                    IterableOf("hello", "world", "друг")
                )
            ).toInt(),
            Matchers.equalTo(2)
        )
    }

    @Test
    fun filterEmptyList() {
        MatcherAssert.assertThat<Filtered<String>>(
            Filtered<String>(
                { input -> input.length > 4 },
                emptyList<String>()
            ),
            Matchers.emptyIterable()
        )
    }

    @Test
    @Throws(Exception::class)
    fun size() {
        MatcherAssert.assertThat(
            Filtered<String>(
                { input -> input.length >= 4 },
                IterableOf("some", "text", "yes")
            ).size,
            Matchers.equalTo(2)
        )
    }

    @Test
    @Throws(Exception::class)
    fun withItemsNotEmpty() {
        MatcherAssert.assertThat(
            Filtered<String>(
                { input -> input.length > 4 },
                IterableOf("first", "second")
            ).isEmpty(),
            Matchers.equalTo(false)
        )
    }

    @Test
    @Throws(Exception::class)
    fun withoutItemsIsEmpty() {
        MatcherAssert.assertThat(
            Filtered<String>(
                { input -> input.length > 16 },
                IterableOf("third", "fourth")
            ).isEmpty(),
            Matchers.equalTo(true)
        )
    }
}
