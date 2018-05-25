package nnl.rocks.kactoos.iterator

import java.util.concurrent.atomic.AtomicInteger

/**
 * Iterator that returns a set of bytes.
 *
 * There is no thread-safety guarantee.
 *
 * @since 0.5
 */
class IteratorOfBytes(
    private val items: ByteArray,
    private val position: AtomicInteger = AtomicInteger(0)
) : Iterator<Byte> {

    constructor(vararg bytes: Byte) : this(bytes)

    override fun hasNext(): Boolean = position.toInt() < items.size

    override fun next(): Byte {
        if (! hasNext()) {
            throw NoSuchElementException(
                "The iterator doesn't have any more items"
            )
        }
        return items[position.getAndIncrement()]
    }
}
