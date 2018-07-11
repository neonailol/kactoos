package nnl.rocks.kactoos.text

import nnl.rocks.kactoos.KText

/**
 * Text from various inputs
 *
 * There is no thread-safety guarantee.
 *
 * @since 0.5
 */
class TextOf(origin: KText) : TextEnvelope(origin)
