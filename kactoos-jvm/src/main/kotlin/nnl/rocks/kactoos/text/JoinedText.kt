package nnl.rocks.kactoos.text

import nnl.rocks.kactoos.Text
import nnl.rocks.kactoos.func.FuncOf
import nnl.rocks.kactoos.iterable.IterableOf
import nnl.rocks.kactoos.iterable.Mapped
import java.io.IOException
import java.util.StringJoiner

/**
 * Join a Text.
 *
 * @param delimiter Delimit among texts
 * @param texts Texts to be joined
 *
 * There is no thread-safety guarantee.
 *
 *
 *
 * @since 0.9
 */
class JoinedText(
    private val delimiter: Text,
    private val texts: Iterable<Text>
) : Text {

    /**
     * Ctor.
     * @param delimit Delimit among strings
     * @param strs Strings to be joined
     */
    constructor(
        delimit: String,
        vararg strs: String
    ) : this(delimit, IterableOf<String>(strs.iterator()))

    /**
     * Ctor.
     * @param delimit Delimit among strings
     * @param strs Strings to be joined
     */
    constructor(
        delimit: String,
        strs: Iterable<String>
    ) : this(
        TextOf(delimit),
        Mapped<String, Text>(FuncOf { text -> TextOf(text) }, strs)
    )

    /**
     * Ctor.
     * @param delimit Delimit among texts
     * @param txts Texts to be joined
     */
    constructor(
        delimit: Text,
        vararg txts: Text
    ) : this(delimit, IterableOf<Text>(txts.iterator()))

    @Throws(IOException::class)
    override fun asString(): String {
        val joint = StringJoiner(this.delimiter.asString())
        for (text in this.texts) {
            joint.add(text.asString())
        }
        return joint.toString()
    }

}
