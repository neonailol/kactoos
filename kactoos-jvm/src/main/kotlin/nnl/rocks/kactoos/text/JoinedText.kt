package nnl.rocks.kactoos.text

import nnl.rocks.kactoos.KScalar
import nnl.rocks.kactoos.Text
import nnl.rocks.kactoos.func.FuncOf
import nnl.rocks.kactoos.iterable.IterableOf
import nnl.rocks.kactoos.iterable.Mapped
import java.util.StringJoiner

/**
 * Join a Text.
 *
 * There is no thread-safety guarantee.
 *
 * @since 0.5
 */
class JoinedText private constructor(origin: KScalar<String>) : TextEnvelope(origin) {

    /**
     * @param delimiter Delimit among texts
     * @param texts Texts to be joined
     */
    constructor(delimiter: Text, texts: Iterable<Text>) : this(
        {
            val joint = StringJoiner(delimiter.asString())
            for (text in texts) {
                joint.add(text.asString())
            }
            joint.toString()
        }
    )

    /**
     * @param delimit Delimit among strings
     * @param strs Strings to be joined
     */
    constructor(
        delimit: String,
        vararg strs: String
    ) : this(delimit, IterableOf<String>(strs.asIterable()))

    /**
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
     * @param delimit Delimit among texts
     * @param txts Texts to be joined
     */
    constructor(
        delimit: Text,
        vararg txts: Text
    ) : this(delimit, IterableOf<Text>(txts.asIterable()))
}
