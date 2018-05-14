package nnl.rocks.kactoos.scalar

import nnl.rocks.kactoos.Input
import nnl.rocks.kactoos.Scalar
import nnl.rocks.kactoos.Text
import nnl.rocks.kactoos.func.FuncOf
import nnl.rocks.kactoos.io.InputOf
import nnl.rocks.kactoos.iterable.IterableOf
import nnl.rocks.kactoos.iterable.Mapped
import nnl.rocks.kactoos.map.MapEntry
import nnl.rocks.kactoos.map.MapOf
import nnl.rocks.kactoos.text.TextOf
import java.io.IOException
import java.util.Properties

/**
 * Map as [java.util.Properties].
 *
 * There is no thread-safety guarantee.
 *
 * @since 0.3
 */
class PropertiesOf(
    private val scalar: IoCheckedScalar<Properties>
) : Scalar<Properties> {

    constructor(sclr: Scalar<Properties>) : this(IoCheckedScalar(sclr))

    /**
     * @param content String
     */
    constructor(content: String) : this(TextOf(content))

    /**
     * @param text Text
     */
    constructor(text: Text) : this(InputOf(text))

    /**
     * @param input Input
     */
    constructor(input: Input) : this(
        Constant {
            val props = Properties()
            input.stream().use { stream -> props.load(stream) }
            props
        }
    )

    /**
     * @param entries The map with properties
     */
    constructor(vararg entries: Map.Entry<*, *>) : this(IterableOf<Map.Entry<*, *>>(entries.iterator()))

    /**
     * @param entries The map with properties
     * @since 0.23
     */
    constructor(entries: Iterable<Map.Entry<*, *>>) : this(
        MapOf<String, String>(
            Mapped<Map.Entry<*, *>, Map.Entry<String, String>>(
                FuncOf { input ->
                    MapEntry<String, String>(
                        input.key.toString(), input.value.toString()
                    )
                },
                entries
            )
        )
    )

    /**
     * @param map The map with properties
     */
    constructor(map: Map<*, *>) : this(
        Constant {
            val props = Properties()
            for ((key, value) in map) {
                props.setProperty(
                    key.toString(),
                    value.toString()
                )
            }
            props
        }
    )

    @Throws(IOException::class)
    override fun invoke(): Properties = this.scalar()
}
