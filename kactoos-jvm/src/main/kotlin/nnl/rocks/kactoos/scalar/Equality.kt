package nnl.rocks.kactoos.scalar

import nnl.rocks.kactoos.Bytes
import nnl.rocks.kactoos.Scalar
import kotlin.math.sign

/**
 * Equality.
 *
 * Returns:
 * * the value `0` if `x == y`;
 * * the value `-1` if `x < y`;
 * * the value `1` if `x > y`
 *
 * There is no thread-safety guarantee.
 *
 * @param T Type of input
 * @param left Left
 * @param right Right
 * @since 0.5
 */
class Equality<T : Bytes>(
    private val left: T,
    private val right: T
) : Scalar<Int> {

    override fun invoke(): Int {
        val lft = left.asBytes()
        val rght = right.asBytes()
        return Ternary(
            { lft.size == rght.size },
            {
                var result = 0
                for (idx in rght.indices.reversed()) {
                    result = lft[idx] - rght[idx]
                    if (result != 0) {
                        break
                    }
                }
                result.sign
            },
            { (lft.size - rght.size).sign }
        ).invoke()
    }
}
