[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos.iterator](../index.md) / [SyncIterator](index.md) / [&lt;init&gt;](./-init-.md)

# &lt;init&gt;

`SyncIterator(iterator: `[`Iterator`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterator/index.html)`<`[`T`](index.md#T)`>)``SyncIterator(iterator: `[`Iterator`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterator/index.html)`<`[`T`](index.md#T)`>, readLock: `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, writeLock: `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`)`

Synchronized [Iterator](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterator/index.html).

### Parameters

`T` - The type of the iterator.

`iterator` - The iterator to synchronize access to.

`readLock` - The lock to use for synchronization on reads.

`writeLock` - The lock to use for synchronization on writes.

**Since**
0.3

