package nnl.rocks.kactoos.scalar

import nnl.rocks.kactoos.Scalar

/**
 * Int total of numbers.
 *
 * Here is how you can use it to summarize numbers:
 *
 * ```
 * int sum = new SumOf(1, 2, 3, 4).intValue();
 * long sum = new SumOf(1L, 2L, 3L).longValue();
 * int sum = new SumOf(numbers.toArray(new Integer[numbers.size()])).intValue();
 * ```
 *
 * This class implements [Scalar], which throws a checked
 * [Exception]. This may not be convenient in many cases. To make
 * it more convenient and get rid of the checked exception you can
 * use [UncheckedScalar] or [IoCheckedScalar] decorators.
 *
 * There is no thread-safety guarantee.
 *
 *
 *
 *
 * @since 0.9
 */
class SumOf : NumberEnvelope {

    constructor(vararg src: Int) : super(
        ScalarOf {
            var sum = 0.0
            for (`val` in src) {
                sum += `val`.toDouble()
            }
            sum
        }
    )

    /**
     * @param src Numbers
     * @since 0.22
     */
    constructor(vararg src: Long) : super(
        ScalarOf {
            var sum = 0.0
            for (`val` in src) {
                sum += `val`.toDouble()
            }
            sum
        }
    )

    /**
     * @param src Numbers
     * @since 0.22
     */
    constructor(vararg src: Double) : super(
        ScalarOf {
            var sum = 0.0
            for (`val` in src) {
                sum += `val`
            }
            sum
        }
    )

    /**
     * @param src Numbers
     * @since 0.22
     */
    constructor(vararg src: Float) : super(
        ScalarOf {
            var sum = 0.0
            for (`val` in src) {
                sum += `val`.toDouble()
            }
            sum
        }
    )

    /**
     * @param src The iterable
     */
    constructor(src: Iterable<Number>) : super(
        ScalarOf {
            val numbers = src.iterator()
            var sum = 0.0
            while (numbers.hasNext()) {
                sum += numbers.next().toDouble()
            }
            sum
        }
    )
}
