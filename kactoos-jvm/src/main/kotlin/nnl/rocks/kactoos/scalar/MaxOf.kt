package nnl.rocks.kactoos.scalar

import nnl.rocks.kactoos.Scalar

/**
 * Find the greater among items.
 *
 *
 * Here is how you can use it to summarize numbers:
 *
 * ```
 * int sum = new MaxOf(1, 2, 3, 4).intValue();
 * long sum = new MaxOf(1L, 2L, 3L).longValue();
 * int sum = new MaxOf(numbers.toArray(new Integer[numbers.size()])).intValue();
 * ```
 *
 *
 * This class implements [Scalar], which throws a checked
 * [Exception]. This may not be convenient in many cases. To make
 * it more convenient and get rid of the checked exception you can
 * use [UncheckedScalar] or [IoCheckedScalar] decorators.
 *
 *
 * There is no thread-safety guarantee.
 *
 *
 *
 *
 * @see UncheckedScalar
 *
 * @see IoCheckedScalar
 *
 * @since 0.24
 */
class MaxOf : NumberEnvelope {

    /**
     * @param src Numbers
     */
    constructor(vararg src: Int) : super(
        {
            var max = java.lang.Double.MIN_VALUE
            for (`val` in src) {
                if (`val`.toDouble() > max) {
                    max = `val`.toDouble()
                }
            }
            max
        }
    )

    /**
     * @param src Numbers
     */
    constructor(vararg src: Long) : super(
        {
            var max = java.lang.Double.MIN_VALUE
            for (`val` in src) {
                if (`val`.toDouble() > max) {
                    max = `val`.toDouble()
                }
            }
            max
        }
    )

    /**
     * @param src Numbers
     */
    constructor(vararg src: Double) : super(
        {
            var max = java.lang.Double.MIN_VALUE
            for (`val` in src) {
                if (`val` > max) {
                    max = `val`
                }
            }
            max
        }
    )

    /**
     * @param src Numbers
     */
    constructor(vararg src: Float) : super(
        {
            var max = java.lang.Double.MIN_VALUE
            for (`val` in src) {
                if (`val`.toDouble() > max) {
                    max = `val`.toDouble()
                }
            }
            max
        }
    )

    /**
     * @param src The iterable
     */
    constructor(src: Iterable<Number>) : super(
        {
            val numbers = src.iterator()
            var max = java.lang.Double.MIN_VALUE
            while (numbers.hasNext()) {
                val next = numbers.next().toDouble()
                if (next > max) {
                    max = next
                }
            }
            max
        }
    )
}
