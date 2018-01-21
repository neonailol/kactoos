package nnl.rocks.kactoos.io

import nnl.rocks.kactoos.Input

import java.io.InputStream

/**
 * Input that reads from `stdin`.
 *
 *
 * There is no thread-safety guarantee.
 *
 *
 *
 * @since 0.6
 */
class StdinInput : Input {

    override fun stream(): InputStream = System.`in`
}
