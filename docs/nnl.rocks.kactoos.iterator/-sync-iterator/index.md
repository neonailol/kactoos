[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos.iterator](../index.md) / [SyncIterator](./index.md)

# SyncIterator

`class SyncIterator<out T> : `[`Iterator`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterator/index.html)`<`[`T`](index.md#T)`>`

Synchronized [Iterator](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterator/index.html) implementation using a [ReadWriteLock](http://docs.oracle.com/javase/8/docs/api/java/util/concurrent/locks/ReadWriteLock.html)
either provided to the constructor or an internally created [ReentrantReadWriteLock](http://docs.oracle.com/javase/8/docs/api/java/util/concurrent/locks/ReentrantReadWriteLock.html).
The [ReadWriteLock](http://docs.oracle.com/javase/8/docs/api/java/util/concurrent/locks/ReadWriteLock.html) is used to synchronize read calls to [SyncIterator.hasNext](has-next.md)
against write calls to [SyncIterator.next](next.md) and write calls to any other read or write calls.

### Parameters

`T` - The type of the iterator.

`iterator` - The iterator to synchronize access to.

`lock` - The lock to use for synchronization.

**Since**
0.3

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `SyncIterator(iterator: `[`Iterator`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterator/index.html)`<`[`T`](index.md#T)`>)``SyncIterator(iterator: `[`Iterator`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterator/index.html)`<`[`T`](index.md#T)`>, lock: `[`ReadWriteLock`](http://docs.oracle.com/javase/8/docs/api/java/util/concurrent/locks/ReadWriteLock.html)`)`<br>Synchronized [Iterator](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterator/index.html) implementation using a [ReadWriteLock](http://docs.oracle.com/javase/8/docs/api/java/util/concurrent/locks/ReadWriteLock.html) either provided to the constructor or an internally created [ReentrantReadWriteLock](http://docs.oracle.com/javase/8/docs/api/java/util/concurrent/locks/ReentrantReadWriteLock.html). The [ReadWriteLock](http://docs.oracle.com/javase/8/docs/api/java/util/concurrent/locks/ReadWriteLock.html) is used to synchronize read calls to [SyncIterator.hasNext](has-next.md) against write calls to [SyncIterator.next](next.md) and write calls to any other read or write calls. |

### Functions

| Name | Summary |
|---|---|
| [hasNext](has-next.md) | `fun hasNext(): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [next](next.md) | `fun next(): `[`T`](index.md#T) |
