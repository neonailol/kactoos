package nnl.rocks.kactoos.list

/**
 * Reversed list.
 *
 * There is no thread-safety guarantee.
 *
 * @param T Element type
 * @since 0.4
 */
class Reversed<T : Any> : ListEnvelope<T> {

    constructor(list: List<T>) : super(list.asReversed())
}
