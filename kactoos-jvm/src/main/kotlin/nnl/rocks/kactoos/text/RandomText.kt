package nnl.rocks.kactoos.text

import nnl.rocks.kactoos.KScalar
import nnl.rocks.kactoos.Text
import nnl.rocks.kactoos.list.ListOf
import java.security.SecureRandom
import java.util.Random

/**
 * Random text.
 *
 * There is no thread-safety guarantee.
 *
 * @param characters List of characters allowed for generating.
 * @param length Length of generated text.
 * @param random Characters index randomizer.
 * @since 0.5
 */
class RandomText(
    private val characters: List<Char>,
    private val length: KScalar<Int> = { SecureRandom().nextInt(RandomText.MAX_RANDOM_LENGTH - 1) + 1 },
    private val random: Random = SecureRandom()
) : Text {

    /**
     * Ctor.
     * @param len Length of generated text.
     */
    constructor(len: Int) : this({ len })

    /**
     * Ctor.
     * @param len Length of generated text.
     */
    constructor(
        len: KScalar<Int> = {
            SecureRandom().nextInt(
                RandomText.MAX_RANDOM_LENGTH - 1
            ) + 1
        }
    ) : this(
        ListOf<Char>(
            '!', '"', '#', '$', '%', '&', '\'', '(', ')', '*',
            '+', ',', '-', '.', '/', '0', '1', '2', '3', '4',
            '5', '6', '7', '8', '9', ':', ';', '<', '=', '>',
            '?', '@', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H',
            'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R',
            'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', '[', '\\',
            ']', '^', '_', '`', 'a', 'b', 'c', 'd', 'e', 'f',
            'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p',
            'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z',
            '{', '|', '}', '~'
        ),
        len
    )

    /**
     * Ctor.
     * @param chrs Array of characters allowed for generating.
     */
    constructor(vararg chrs: Char) : this(ListOf<Char>(chrs.toList()))

    /**
     * Ctor.
     * @param len Length of generated text.
     * @param chrs Array of characters allowed for generating.
     */
    constructor(len: KScalar<Int>, vararg chrs: Char) : this(ListOf<Char>(chrs.toList()), len)

    override fun asString(): String {
        val len = this.length()
        val bound = this.characters.size
        var index = 0
        return StringBuilder(len).apply {
            while (index < len) {
                append(characters[random.nextInt(bound)])
                index += 1
            }
        }.toString()
    }

    companion object {

        /**
         * Max length of generated text (if no length is specified).
         */
        private const val MAX_RANDOM_LENGTH = 255
    }
}
