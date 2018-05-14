package nnl.rocks.kactoos.text

import nnl.rocks.kactoos.Text

/**
 * Text that is thread-safe.
 *
 * @param origin The text
 * @param lock The lock
 *
 * There is no thread-safety guarantee.
 *
 * @since 0.18
 */
class SyncText(
    private val origin: Text,
    private val lock: Any
) : Text {

    constructor(origin: Text) : this(origin, origin)

    override fun asString(): String = synchronized(this.lock) {
        return this.origin.asString()
    }
}
