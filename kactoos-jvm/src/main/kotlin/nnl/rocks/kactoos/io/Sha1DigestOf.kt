package nnl.rocks.kactoos.io

import nnl.rocks.kactoos.Input

/**
 * SHA-1 checksum calculation of [Input].
 *
 * There is no thread-safety guarantee.
 *
 * @since 0.3
 */
class Sha1DigestOf : DigestEnvelope {

    /**
     * @param input The input
     */
    constructor(input: Input) : super(input, "SHA-1")

    /**
     * @param input The input
     * @param max Buffer size
     */
    constructor(
        input: Input,
        max: Int
    ) : super(input, max, "SHA-1")
}
