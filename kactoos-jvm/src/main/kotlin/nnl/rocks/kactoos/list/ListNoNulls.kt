package nnl.rocks.kactoos.list

/**
 * A decorator of [List] that tolerates no NULLs.
 *
 * There is no thread-safety guarantee.
 *
 * @param T Element type
 * @since 0.27
 */
class ListNoNulls<T : Any>(private val list: MutableList<T>) : MutableList<T> by list {

    constructor(lst: ListEnvelope<T>) : this(lst.toMutableList())
}
