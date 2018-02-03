package nnl.rocks.kactoos.iterable

import nnl.rocks.kactoos.KFunc
import nnl.rocks.kactoos.iterator.Filtered
import nnl.rocks.kactoos.scalar.ScalarOf
import java.util.LinkedList

/**
 * Filtered iterable.
 *
 *
 * You can use it in order to create a declarative/lazy
 * version of a filtered collection/iterable. For example,
 * this code will create a list of two strings "hello" and "world":
 *
 * <pre> Iterable&lt;String&gt; list = new Filtered&lt;&gt;(
 * new ArrayOf&lt;&gt;(
 * "hey", "hello", "world"
 * ),
 * input -&gt; input.length() &gt; 4
 * );
</pre> *
 *
 *
 * There is no thread-safety guarantee.
 *
 *
 *
 * @param X Type of item
 * @see Filtered
 * @since 0.1
 */
class Filtered<X : Any>(
    fnc: KFunc<X, Boolean>,
    src: Iterable<X>
) : IterableEnvelope<X>(
    ScalarOf {
        Iterable {
            Filtered<X>(
                fnc, src.iterator(), LinkedList<X>()
            )
        }
    }
) {

    /**
     * @param fnc Predicate
     * @param src Source iterable
     * @since 0.21
     */
    @SafeVarargs
    constructor(
        fnc: KFunc<X, Boolean>,
        vararg src: X
    ) : this(fnc, IterableOf<X>(src.iterator()))

    /**
     * @param fnc Predicate
     * @param src Source iterable
     * @since 0.21
     */
    constructor(
        fnc: KFunc<X, Boolean>,
        src: Iterator<X>
    ) : this(fnc, IterableOf<X>(src))
}
