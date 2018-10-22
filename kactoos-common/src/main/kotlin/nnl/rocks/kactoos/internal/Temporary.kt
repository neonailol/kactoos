package nnl.rocks.kactoos.internal

internal class Temporary<X : Any> {

    private var value: X? = null

    fun put(element: X) {
        when (value) {
            null -> value = element
            else -> throw IllegalStateException()
        }
    }

    fun poll(): X {
        val result = value
        value = null
        return result ?: throw NoSuchElementException()
    }

    fun isEmpty() = value == null

    fun isNotEmpty() = ! isEmpty()
}
