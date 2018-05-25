package nnl.rocks.kactoos.scalar

import nnl.rocks.kactoos.Scalar

/**
 * Calculates number of superclasses between base and derived class.
 *
 * This class is thread safe.
 *
 * Result interpretation:
 *
 *  * [Integer.MIN_VALUE] -&gt; classes are not related. (ex. matching FileNotFoundException with RuntimeException);
 *  * 0 -&gt; classes are identical. (ex. matching IOException with IOException);
 *  * 1 -&gt; single level inheritance. (ex. matching FileNotFoundException with IOException);
 *  * 2 -&gt; two inheritance levels. (ex. matching FileNotFoundException with Exception).
 *
 * @param derived Derived class
 * @param base Base class
 * @since 0.5
 */
class InheritanceLevel(
    private val derived: Class<*>,
    private val base: Class<*>
) : Scalar<Int> {

    override fun invoke(): Int {
        return if (base == derived) {
            0
        } else {
            calculateLevel()
        }
    }

    /**
     * Calculates inheritance level.
     * @return Integer Level
     */
    private fun calculateLevel(): Int {
        var level = Integer.MIN_VALUE
        var sclass: Class<*> = derived.superclass
        var idx = 0
        while (sclass != Any::class.java) {
            idx += 1
            if (sclass == base) {
                level = idx
                break
            }
            sclass = sclass.superclass
        }
        return level
    }
}
