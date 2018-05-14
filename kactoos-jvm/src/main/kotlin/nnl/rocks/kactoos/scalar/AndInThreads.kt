package nnl.rocks.kactoos.scalar

import nnl.rocks.kactoos.Func
import nnl.rocks.kactoos.KScalar
import nnl.rocks.kactoos.Proc
import nnl.rocks.kactoos.func.FuncOf
import nnl.rocks.kactoos.iterable.IterableOf
import nnl.rocks.kactoos.iterable.Mapped
import java.util.LinkedList
import java.util.concurrent.ExecutorService
import java.util.concurrent.Executors
import java.util.concurrent.Future
import java.util.concurrent.TimeUnit

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
 *
 * There is no thread-safety guarantee.
 *
 * @param service Executable service to run thread in
 * @param iterable The iterable
 * @param shut Shut it down
 * @see IoCheckedScalar
 * @since 0.25
 */
class AndInThreads(
    private val service: ExecutorService,
    private val iterable: Iterable<KScalar<Boolean>>,
    private val shut: Boolean
) : KScalar<Boolean> {

    /**
     * @param src The iterable
     */
    @SafeVarargs
    @Suppress("SpreadOperator")
    constructor(vararg src: KScalar<Boolean>) : this(IterableOf<KScalar<Boolean>>(*src))

    /**
     * @param src The iterable
     * @since 0.24
     */
    constructor(src: Iterator<KScalar<Boolean>>) : this(IterableOf<KScalar<Boolean>>(src))

    /**
     * @param src The iterable
     */
    constructor(src: Iterable<KScalar<Boolean>>) : this(Executors.newCachedThreadPool(), src, true)

    /**
     * Ctor.
     * @param svc Executable service to run thread in
     * @param src The iterable
     */
    @SafeVarargs
    @Suppress("SpreadOperator")
    constructor(
        svc: ExecutorService,
        vararg src: KScalar<Boolean>
    ) : this(svc, IterableOf<KScalar<Boolean>>(*src))

    /**
     * Ctor.
     * @param svc Executable service to run thread in
     * @param src The iterable
     */
    constructor(
        svc: ExecutorService,
        src: Iterator<KScalar<Boolean>>
    ) : this(svc, IterableOf<KScalar<Boolean>>(src))

    /**
     * Ctor.
     * @param svc Executable service to run thread in
     * @param src The iterable
     */
    constructor(
        svc: ExecutorService,
        src: Iterable<KScalar<Boolean>>
    ) : this(svc, src, false)

    override fun invoke(): Boolean {
        val futures = LinkedList<Future<Boolean>>()
        for (item in this.iterable) {
            futures.add(this.service.submit<Boolean>({ item() }))
        }
        val result = AndFunc(
            FuncOf<Future<Boolean>, Boolean> { it.get() },
            futures
        ).invoke()
        if (this.shut) {
            this.service.shutdown()
            try {
                if (! this.service.awaitTermination(1L, TimeUnit.MINUTES)) {
                    throw IllegalStateException(
                        String.format(
                            "Can't terminate the service, result=%b",
                            result
                        )
                    )
                }
            } catch (ex: InterruptedException) {
                Thread.currentThread().interrupt()
                throw IllegalStateException(ex)
            }
        }
        return result
    }

    companion object {

        /**
         * @param proc Proc to map
         * @param src The iterable
         * @param X Type of items in the iterable
         */
        @SafeVarargs
        @Suppress("SpreadOperator")
        operator fun <X : Any> invoke(
            proc: Proc<X>,
            vararg src: X
        ): AndInThreads {
            return AndInThreads(AndInThreadsFunc(FuncOf(proc, true), *src))
        }

        /**
         * @param func Func to map
         * @param src The iterable
         * @param X Type of items in the iterable
         */
        @SafeVarargs
        @Suppress("SpreadOperator")
        operator fun <X : Any> invoke(
            func: Func<X, Boolean>,
            vararg src: X
        ): AndInThreads {
            return AndInThreads(AndInThreadsFunc(func, IterableOf(*src)))
        }

        /**
         * @param src The iterable
         * @param proc Proc to use
         * @param X Type of items in the iterable
         */
        operator fun <X : Any> invoke(
            proc: Proc<X>,
            src: Iterator<X>
        ): AndInThreads {
            return AndInThreads(AndInThreadsFunc(FuncOf(proc, true), src))
        }

        /**
         * @param src The iterable
         * @param proc Proc to use
         * @param X Type of items in the iterable
         */
        operator fun <X : Any> invoke(
            proc: Proc<X>,
            src: Iterable<X>
        ): AndInThreads {
            return AndInThreads(AndInThreadsFunc(FuncOf(proc, true), src))
        }

        /**
         * @param src The iterable
         * @param func Func to map
         * @param X Type of items in the iterable
         */
        operator fun <X : Any> invoke(
            func: Func<X, Boolean>,
            src: Iterator<X>
        ): AndInThreads {
            return AndInThreads(AndInThreadsFunc(func, IterableOf(src)))
        }

        /**
         * @param src The iterable
         * @param func Func to map
         * @param X Type of items in the iterable
         */
        operator fun <X : Any> invoke(
            func: Func<X, Boolean>,
            src: Iterable<X>
        ): AndInThreads {
            return AndInThreads(
                AndInThreadsFunc<X>(
                    Mapped<X, KScalar<Boolean>>(
                        FuncOf { item -> { func.apply(item) } }, src
                    )
                )
            )
        }

        /**
         * @param svc Executable service to run thread in
         * @param proc Proc to map
         * @param src The iterable
         * @param X Type of items in the iterable
         */
        @SafeVarargs
        @Suppress("SpreadOperator")
        operator fun <X : Any> invoke(
            svc: ExecutorService,
            proc: Proc<X>,
            vararg src: X
        ): AndInThreads {
            return AndInThreads(AndInThreadsFunc(svc, FuncOf(proc, true), *src))
        }

        /**
         * @param svc Executable service to run thread in
         * @param func Func to map
         * @param src The iterable
         * @param X Type of items in the iterable
         */
        @SafeVarargs
        @Suppress("SpreadOperator")
        operator fun <X : Any> invoke(
            svc: ExecutorService,
            func: Func<X, Boolean>,
            vararg src: X
        ): AndInThreads {
            return AndInThreads(AndInThreadsFunc(svc, func, IterableOf(*src)))
        }

        /**
         * @param svc Executable service to run thread in
         * @param src The iterable
         * @param proc Proc to use
         * @param X Type of items in the iterable
         */
        operator fun <X : Any> invoke(
            svc: ExecutorService,
            proc: Proc<X>,
            src: Iterator<X>
        ): AndInThreads {
            return AndInThreads(AndInThreadsFunc(svc, FuncOf(proc, true), src))
        }

        /**
         * Ctor.
         * @param svc Executable service to run thread in
         * @param src The iterable
         * @param proc Proc to use
         * @param X Type of items in the iterable
         */
        operator fun <X : Any> invoke(
            svc: ExecutorService,
            proc: Proc<X>,
            src: Iterable<X>
        ): AndInThreads {
            return AndInThreads(AndInThreadsFunc(svc, FuncOf(proc, true), src))
        }

        /**
         * Ctor.
         * @param svc Executable service to run thread in
         * @param src The iterable
         * @param func Func to map
         * @param X Type of items in the iterable
         */
        operator fun <X : Any> invoke(
            svc: ExecutorService,
            func: Func<X, Boolean>,
            src: Iterator<X>
        ): AndInThreads {
            return AndInThreads(AndInThreadsFunc(svc, func, IterableOf(src)))
        }

        /**
         * Ctor.
         * @param svc Executable service to run thread in
         * @param src The iterable
         * @param func Func to map
         * @param X Type of items in the iterable
         */
        operator fun <X : Any> invoke(
            svc: ExecutorService,
            func: Func<X, Boolean>,
            src: Iterable<X>
        ): AndInThreads {
            return AndInThreads(
                AndInThreadsFunc<X>(
                    svc,
                    Mapped<X, KScalar<Boolean>>(
                        FuncOf { item ->  { func.apply(item) } },
                        src
                    )
                )
            )
        }
    }
}
