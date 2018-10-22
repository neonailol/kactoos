package nnl.rocks.kactoos.internal

actual inline fun <R> kSynchronized(lock: Any, block: () -> R): R = block()
