package nnl.rocks.kactoos

/**
 * Dummy function, to provide generic argument when we don't have one.
 * Uses bug in compiler, see https://youtrack.jetbrains.com/issue/KT-8135
 */
@Suppress("UNCHECKED_CAST")
internal actual fun <T> dummy(): T {
    return null as T
}
