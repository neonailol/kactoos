package nnl.rocks.kactoos.text

import nnl.rocks.kactoos.Text

/**
 * Text implementing Comparable.
 *
 * Below the example how you can sort words in a string:
 *
 * ```
 * Iterable<Text> sorted = new Sorted<>(
 *   new Mapped<>(
 *     ComparableText::new,
 *     new SplitText("The quick brown fox jumps over the lazy dog", " ")
 *   )
 * )
 * ```
 *
 * There is no thread-safety guarantee.
 *
 * @since 0.27
 */
class ComparableText(private val text: Text) : Text, Comparable<Text> {

    override fun compareTo(other: Text): Int =
        this.text.asString().compareTo(other.asString())

    override fun asString(): String = this.text.asString()
}
