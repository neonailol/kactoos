package nnl.rocks.kactoos.map

import org.hamcrest.Description
import org.hamcrest.MatcherAssert
import org.hamcrest.Matchers
import org.hamcrest.TypeSafeMatcher

/**
 * Matcher for collection.
 *
 *
 * @param <K> Type of key
 * @param <V> Type of value
 * @since 0.24
 *
</V></K> */
class BehavesAsMap<K : Any, V : Any>
/**
 * Ctor.
 * @param key Sample key
 * @param value Sample value
 */
(
    /**
     * Sample key.
     */
    private val key: K,
    /**
     * Sample value.
     */
    private val value: V
) : TypeSafeMatcher<Map<K, V>>() {

    public override fun matchesSafely(map: Map<K, V>): Boolean {
        MatcherAssert.assertThat(map, Matchers.hasKey(this.key))
        MatcherAssert.assertThat(map, Matchers.hasValue(this.value))
        MatcherAssert.assertThat(map.keys, Matchers.hasItem(this.key))
        MatcherAssert.assertThat(map.values, Matchers.hasItem(this.value))
        return true
    }

    override fun describeTo(desc: Description) {
        desc.appendText("not a valid map")
    }
}
