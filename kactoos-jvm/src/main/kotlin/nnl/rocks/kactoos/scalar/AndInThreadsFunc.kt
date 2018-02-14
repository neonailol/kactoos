package nnl.rocks.kactoos.scalar

import nnl.rocks.kactoos.Func
import nnl.rocks.kactoos.Proc
import nnl.rocks.kactoos.Scalar
import nnl.rocks.kactoos.func.FuncOf
import nnl.rocks.kactoos.iterable.IterableOf
import nnl.rocks.kactoos.iterable.Mapped
import java.util.concurrent.ExecutorService
import java.util.concurrent.Executors

/**
 * Logical conjunction, in multiple threads.
 *
 * This class can be effectively used to iterate through a collection, just like [java.util.stream.Stream.forEach] works:
 *
 * ```
 * new AndInThreads(
 * new IterableOf("Mary", "John", "William", "Napkin"),
 * name -> System.out.printf("The name: %s\n", name)
 * ).value();
 * ```
 *
 * This class implements [Scalar], which throws a checked
 * [Exception]. This may not be convenient in many cases. To make
 * it more convenient and get rid of the checked exception you can
 * use [UncheckedScalar] or [IoCheckedScalar] decorators.
 *
 * There is no thread-safety guarantee.
 *
 * @param service Executable service to run thread in
 * @param iterable The iterable
 * @param shut Shut it down
 * @param X Type of items in the iterable
 * @see UncheckedScalar
 * @see IoCheckedScalar
 * @since 0.25
 */
class AndInThreadsFunc<X : Any>(
    private val service: ExecutorService,
    private val iterable: Iterable<Scalar<Boolean>>,
    private val shut: Boolean
) : Scalar<Boolean> {

    constructor(
        service: ExecutorService,
        iterable: Iterable<Scalar<Boolean>>
    ) : this(service, iterable, true)

    constructor(
        iterable: Iterable<Scalar<Boolean>>
    ) : this(Executors.newCachedThreadPool(), iterable, true)

    /**
     * @param proc Proc to map
     * @param src The iterable
     * @param X Type of items in the iterable
     */
    @SafeVarargs
    @Suppress("SpreadOperator")
    constructor(
        proc: Proc<X>,
        vararg src: X
    ) : this(FuncOf<X, Boolean>(proc, true), *src)

    /**
     * @param func Func to map
     * @param src The iterable
     * @param X Type of items in the iterable
     */
    @SafeVarargs
    @Suppress("SpreadOperator")
    constructor(
        func: Func<X, Boolean>,
        vararg src: X
    ) : this(func, IterableOf<X>(*src))

    /**
     * @param src The iterable
     * @param proc Proc to use
     * @param X Type of items in the iterable
     */
    constructor(
        proc: Proc<X>,
        src: Iterator<X>
    ) : this(FuncOf<X, Boolean>(proc, true), src)

    /**
     * @param src The iterable
     * @param proc Proc to use
     * @param X Type of items in the iterable
     */
    constructor(
        proc: Proc<X>,
        src: Iterable<X>
    ) : this(FuncOf<X, Boolean>(proc, true), src)

    /**
     * @param src The iterable
     * @param func Func to map
     * @param X Type of items in the iterable
     */
    constructor(
        func: Func<X, Boolean>,
        src: Iterator<X>
    ) : this(func, IterableOf<X>(src))

    /**
     * @param src The iterable
     * @param func Func to map
     * @param X Type of items in the iterable
     */
    constructor(
        func: Func<X, Boolean>,
        src: Iterable<X>
    ) : this(
        Mapped<X, Scalar<Boolean>>(
            FuncOf { item -> Constant(func.apply(item)) }, src
        )
    )

    /**
     * @param svc Executable service to run thread in
     * @param proc Proc to map
     * @param src The iterable
     * @param X Type of items in the iterable
     */
    @SafeVarargs
    @Suppress("SpreadOperator")
    constructor(
        svc: ExecutorService,
        proc: Proc<X>,
        vararg src: X
    ) : this(svc, FuncOf<X, Boolean>(proc, true), *src)

    /**
     * @param svc Executable service to run thread in
     * @param func Func to map
     * @param src The iterable
     * @param X Type of items in the iterable
     */
    @SafeVarargs
    @Suppress("SpreadOperator")
    constructor(
        svc: ExecutorService,
        func: Func<X, Boolean>,
        vararg src: X
    ) : this(svc, func, IterableOf<X>(*src))

    /**
     * @param svc Executable service to run thread in
     * @param src The iterable
     * @param proc Proc to use
     * @param X Type of items in the iterable
     */
    constructor(
        svc: ExecutorService,
        proc: Proc<X>,
        src: Iterator<X>
    ) : this(svc, FuncOf<X, Boolean>(proc, true), src)

    /**
     * Ctor.
     * @param svc Executable service to run thread in
     * @param src The iterable
     * @param proc Proc to use
     * @param X Type of items in the iterable
     */
    constructor(
        svc: ExecutorService,
        proc: Proc<X>,
        src: Iterable<X>
    ) : this(svc, FuncOf<X, Boolean>(proc, true), src)

    /**
     * Ctor.
     * @param svc Executable service to run thread in
     * @param src The iterable
     * @param func Func to map
     * @param X Type of items in the iterable
     */
    constructor(
        svc: ExecutorService,
        func: Func<X, Boolean>,
        src: Iterator<X>
    ) : this(svc, func, IterableOf<X>(src))

    /**
     * Ctor.
     * @param svc Executable service to run thread in
     * @param src The iterable
     * @param func Func to map
     * @param X Type of items in the iterable
     */
    constructor(
        svc: ExecutorService,
        func: Func<X, Boolean>,
        src: Iterable<X>
    ) : this(
        svc,
        Mapped<X, Scalar<Boolean>>(
            FuncOf { item -> Constant { func.apply(item) } }, src
        )
    )

    @Throws(Exception::class)
    override fun value(): Boolean {
        return AndInThreads(service, iterable, shut).value()
    }
}
