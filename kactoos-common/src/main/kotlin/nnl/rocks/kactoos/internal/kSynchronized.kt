package nnl.rocks.kactoos.internal

expect inline fun <R> kSynchronized(lock: Any, block: () -> R): R
