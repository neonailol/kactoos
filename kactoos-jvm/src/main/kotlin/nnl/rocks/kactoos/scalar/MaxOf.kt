package nnl.rocks.kactoos.scalar

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
 * There is no thread-safety guarantee.
 *
 * @see IoCheckedScalar
 *
 * @since 0.3
 */
class MaxOf : NumberEnvelope {

    /**
     * @param src Numbers
     */
    constructor(vararg src: Int) : super(
        Constant {
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
        Constant {
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
        Constant {
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
        Constant {
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
        Constant {
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
