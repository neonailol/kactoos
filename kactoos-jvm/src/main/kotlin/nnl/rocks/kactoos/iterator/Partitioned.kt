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
package nnl.rocks.kactoos.iterator

import java.util.Collections
import java.util.LinkedList
import java.util.NoSuchElementException

/**
 * Iterator implementation for [Iterator] partitioning.
 *
 * @param size Size of the partitions.
 * @param decorated Source iterator.
 * @param T Partitions value type
 * @since 0.29
 */
class Partitioned<out T : Any>(
    private val size: Int,
    private val decorated: Iterator<T>
) : Iterator<List<T>> {

    override fun hasNext(): Boolean {
        return this.decorated.hasNext()
    }

    override fun next(): List<T> {
        if (! this.hasNext()) {
            throw NoSuchElementException("No partition left.")
        }
        if (this.size < 1) {
            throw IllegalArgumentException("Partition size < 1")
        }
        val result = LinkedList<T>()
        var count = 0
        while (count < this.size && this.hasNext()) {
            result.add(this.decorated.next())
            ++ count
        }
        return Collections.unmodifiableList(result)
    }
}
