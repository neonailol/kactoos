package nnl.rocks.kactoos.scalar

/**
 * Find the smaller among items.
 *
 *
 * Here is how you can use it to summarize numbers:
 *
 * ```
 * int sum = new MinOf(1, 2, 3, 4).intValue();
 * long sum = new MinOf(1L, 2L, 3L).longValue();
 * int sum = new MinOf(numbers.toArray(new Integer[numbers.size()])).intValue();
 * ```
 *
 *
 * There is no thread-safety guarantee.
 *
 *
 *
 *
 *
 *
 * @since 0.24
 */
class MinOf : NumberEnvelope {

    /**
     * @param src Numbers
     */
    constructor(vararg src: Int) : super(
        {
            var min = java.lang.Double.MAX_VALUE
            for (`val` in src) {
                if (`val`.toDouble() < min) {
                    min = `val`.toDouble()
                }
            }
            min
        }
    )

    /**
     * @param src Numbers
     */
    constructor(vararg src: Long) : super(
        {
            var min = java.lang.Double.MAX_VALUE
            for (`val` in src) {
                if (`val`.toDouble() < min) {
                    min = `val`.toDouble()
                }
            }
            min
        }
    )

    /**
     * @param src Numbers
     */
    constructor(vararg src: Double) : super(
        {
            var min = java.lang.Double.MAX_VALUE
            for (`val` in src) {
                if (`val` < min) {
                    min = `val`
                }
            }
            min
        }
    )

    /**
     * @param src Numbers
     */
    constructor(vararg src: Float) : super(
        {
            var min = java.lang.Double.MAX_VALUE
            for (`val` in src) {
                if (`val`.toDouble() < min) {
                    min = `val`.toDouble()
                }
            }
            min
        }
    )

    /**
     * @param src The iterable
     */
    constructor(src: Iterable<Number>) : super(
        {
            val numbers = src.iterator()
            var min = java.lang.Double.MAX_VALUE
            while (numbers.hasNext()) {
                val next = numbers.next().toDouble()
                if (next < min) {
                    min = next
                }
            }
            min
        }
    )
}
