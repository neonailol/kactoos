---
title: SyncIterator.<init> - kactoos-jvm
---

[kactoos-jvm](../../index.html) / [nnl.rocks.kactoos.iterator](../index.html) / [SyncIterator](index.html) / [&lt;init&gt;](./-init-.html)

# &lt;init&gt;

`SyncIterator(iterator: `[`Iterator`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterator/index.html)`<`[`T`](index.html#T)`>, lock: `[`ReadWriteLock`](http://docs.oracle.com/javase/8/docs/api/java/util/concurrent/locks/ReadWriteLock.html)` = ReentrantReadWriteLock())`

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

