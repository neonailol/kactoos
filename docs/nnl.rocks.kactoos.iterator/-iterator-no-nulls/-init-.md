---
title: IteratorNoNulls.<init> - kactoos-jvm
---

[kactoos-jvm](../../index.html) / [nnl.rocks.kactoos.iterator](../index.html) / [IteratorNoNulls](index.html) / [&lt;init&gt;](./-init-.html)

# &lt;init&gt;

`IteratorNoNulls(iterator: `[`Iterator`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterator/index.html)`<`[`X`](index.html#X)`>)``IteratorNoNulls(iterator: `[`MutableIterator`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-mutable-iterator/index.html)`<`[`X`](index.html#X)`>, pos: `[`AtomicLong`](http://docs.oracle.com/javase/8/docs/api/java/util/concurrent/atomic/AtomicLong.html)`)`

A decorator of an [Iterator](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterator/index.html) that returns no NULL.

There is no thread-safety guarantee.

### Parameters

`X` - Type of item.

`iterator` - Encapsulated iterator.

`pos` - Position counter.

**Since**
0.3

