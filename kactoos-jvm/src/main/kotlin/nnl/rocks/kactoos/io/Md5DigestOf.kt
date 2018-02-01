package nnl.rocks.kactoos.io

import nnl.rocks.kactoos.Input

/**
 * MD5 checksum calculation of [Input].
 *
 * There is no thread-safety guarantee.
 *
 * @since 0.3
 */
class Md5DigestOf : DigestEnvelope {

    /**
     * @param input The input
     */
    constructor(input: Input) : super(input, "MD5")

    /**
     * @param input The input
     * @param max Buffer size
     */
    constructor(
        input: Input,
        max: Int
    ) : super(input, max, "MD5")
}
