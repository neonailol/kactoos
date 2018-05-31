package nnl.rocks.kactoos.list

/**
 * A decorator of [List] that tolerates no NULLs.
 *
 * There is no thread-safety guarantee.
 *
 * @param T Element type
 * @since 0.4
 */
class ListNoNulls<T : Any> : ListEnvelope<T> {

    constructor(list: List<T>) : super(list)

}
