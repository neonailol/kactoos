package nnl.rocks.kactoos.map

import nnl.rocks.kactoos.KFunc

/**
 * Iterable as [Map].
 *
 * This class groups objects from iterable by applying functions for keys and values
 *
 * There is no thread-safety guarantee.
 *
 * @param K Type of key
 * @param V Type of value
 * @param T Type of entry objects of functions
 * @param list Iterable which is used to retrieve data from
 * @param keys Function to get a key
 * @param values Function to get a value
 * @since 0.3
 */
class Grouped<K : Any, out V : Any, T : Any>(
    list: Iterable<T>,
    keys: KFunc<T, K>,
    values: KFunc<T, V>
) : MapEnvelope<K, List<V>>({ list.groupBy(keys, values) })
