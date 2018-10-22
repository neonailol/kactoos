package nnl.rocks.kactoos.text

import nnl.rocks.kactoos.KText
import nnl.rocks.kactoos.Text
import nnl.rocks.kactoos.internal.kSynchronized

/**
 * Text that is thread-safe.
 *
 * Objects of this class are thread safe.
 *
 * @since 0.5
 */
class SyncText(
    origin: KText,
    lock: Any
) : TextEnvelope(
    {
        kSynchronized(lock) {
            origin()
        }
    }
) {

    constructor(
        origin: KText
    ) : this(
        origin,
        origin
    )

    constructor(
        origin: Text
    ) : this(
        { origin.asString() },
        origin
    )

    constructor(
        origin: Text,
        lock: Any
    ) : this(
        { origin.asString() },
        lock
    )
}
