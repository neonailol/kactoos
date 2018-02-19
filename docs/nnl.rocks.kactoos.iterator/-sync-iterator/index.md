---
title: SyncIterator - kactoos-jvm
---

[kactoos-jvm](../../index.html) / [nnl.rocks.kactoos.iterator](../index.html) / [SyncIterator](./index.html)

# SyncIterator

`class SyncIterator<out T> : `[`Iterator`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterator/index.html)`<`[`T`](index.html#T)`>` [(source)](https://github.com/neonailol/kactoos/blob/master/kactoos-jvm/src/main/kotlin/nnl/rocks/kactoos/iterator/SyncIterator.kt#L20)

Synchronized [Iterator](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterator/index.html) implementation using a [ReadWriteLock](http://docs.oracle.com/javase/8/docs/api/java/util/concurrent/locks/ReadWriteLock.html)
either provided to the constructor or an internally created
[ReentrantReadWriteLock](http://docs.oracle.com/javase/8/docs/api/java/util/concurrent/locks/ReentrantReadWriteLock.html).
The [ReadWriteLock](http://docs.oracle.com/javase/8/docs/api/java/util/concurrent/locks/ReadWriteLock.html) is used to synchronize read calls to
[SyncIterator.hasNext](has-next.html) against write calls to
[SyncIterator.next](next.html) and write calls to any other read or write
calls.

### Parameters

`T` - The type of the iterator.

`iterator` - The iterator to synchronize access to.

`lock` - The lock to use for synchronization.

**Since**
0.3

### Constructors

| [&lt;init&gt;](-init-.html) | `SyncIterator(iterator: `[`Iterator`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterator/index.html)`<`[`T`](index.html#T)`>, lock: `[`ReadWriteLock`](http://docs.oracle.com/javase/8/docs/api/java/util/concurrent/locks/ReadWriteLock.html)` = ReentrantReadWriteLock())`<br>Synchronized [Iterator](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterator/index.html) implementation using a [ReadWriteLock](http://docs.oracle.com/javase/8/docs/api/java/util/concurrent/locks/ReadWriteLock.html) either provided to the constructor or an internally created [ReentrantReadWriteLock](http://docs.oracle.com/javase/8/docs/api/java/util/concurrent/locks/ReentrantReadWriteLock.html). The [ReadWriteLock](http://docs.oracle.com/javase/8/docs/api/java/util/concurrent/locks/ReadWriteLock.html) is used to synchronize read calls to [SyncIterator.hasNext](has-next.html) against write calls to [SyncIterator.next](next.html) and write calls to any other read or write calls. |

### Functions

| [hasNext](has-next.html) | `fun hasNext(): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [next](next.html) | `fun next(): `[`T`](index.html#T) |

