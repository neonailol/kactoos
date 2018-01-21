package nnl.rocks.kactoos.io

import nnl.rocks.kactoos.Input

import java.io.InputStream

/**
 * Input with no data.
 *
 *
 * There is no thread-safety guarantee.
 *
 *
 *
 * @since 0.1
 */
class DeadInput : Input {

    override fun stream(): InputStream = DeadInputStream()
}
