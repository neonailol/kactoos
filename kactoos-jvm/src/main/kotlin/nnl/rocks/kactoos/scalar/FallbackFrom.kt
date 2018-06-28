package nnl.rocks.kactoos.scalar

import nnl.rocks.kactoos.Func
import nnl.rocks.kactoos.KFunc
import nnl.rocks.kactoos.func.FuncOf
import nnl.rocks.kactoos.iterable.IterableOf
import nnl.rocks.kactoos.iterable.Mapped

/**
 * Fallback from exception.
 *
 * There is no thread-safety guarantee.
 *
 * @param T Type of result
 * @param exceptions The list of exceptions supported by this instance.
 * @param func Function that converts exceptions to the required type.
 * @since 0.4
 */
class FallbackFrom<T : Any>(
    private val exceptions: Iterable<Class<out Throwable>>,
    private val func: KFunc<Throwable, T>
) : Func<Throwable, T> {

    constructor(
        exp: Class<out Throwable>,
        func: KFunc<Throwable, T>
    ) : this(IterableOf<Class<out Throwable>>(exp), func)

    override fun apply(input: Throwable): T = func(input)

    /**
     * Calculate level of support of the given exception type.
     * @param target Exception type
     * @return Level of support: greater or equals to 0 if the target is supported and [Integer.MIN_VALUE] otherwise
     * @see InheritanceLevel
     */
    fun support(target: Class<out Throwable>): Int {
        return MinOf(
            Mapped<Class<*>, Int>(
                FuncOf { supported: Class<*> -> InheritanceLevel(target, supported).invoke() },
                exceptions
            )
        ).toInt()
    }
}
