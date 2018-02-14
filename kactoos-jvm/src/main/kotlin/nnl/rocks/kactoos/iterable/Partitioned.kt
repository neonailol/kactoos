/**
 * The MIT License (MIT)
 *
 * Copyright (c) 2017-2018 Yegor Bugayenko
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included
 * in all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NON-INFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package nnl.rocks.kactoos.iterable

import nnl.rocks.kactoos.scalar.Constant

/**
 * Iterable implementation for partitioning functionality.
 *
 * @param T Partitions value type
 * @since 0.29
 */
class Partitioned<T : Any> : IterableEnvelope<List<T>> {

    /**
     * @param size The partitions size.
     * @param iterable The source [Iterable].
     */
    constructor(
        size: Int,
        iterable: Iterable<T>
    ) : super(Constant {
        Iterable {
            nnl.rocks.kactoos.iterator.Partitioned<T>(
                size, iterable.iterator()
            )
        }
    })

    /**
     * Ctor.
     * @param size The partitions size.
     * @param items The source items.
     */
    @SafeVarargs
    constructor(
        size: Int,
        vararg items: T
    ) : this(size, IterableOf<T>(items.iterator()))
}
