---
title: IteratorNoNulls - kactoos-jvm
---

[kactoos-jvm](../../index.html) / [nnl.rocks.kactoos.iterator](../index.html) / [IteratorNoNulls](./index.html)

# IteratorNoNulls

`class IteratorNoNulls<out X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`MutableIterator`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-mutable-iterator/index.html)`<`[`X`](index.html#X)`>` [(source)](https://github.com/neonailol/kactoos/blob/master/kactoos-jvm/src/main/kotlin/nnl/rocks/kactoos/iterator/IteratorNoNulls.kt#L15)

A decorator of an [Iterator](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterator/index.html) that returns no NULL.

There is no thread-safety guarantee.

### Parameters

`X` - Type of item.

`iterator` - Encapsulated iterator.

`pos` - Position counter.

**Since**
0.3

### Constructors

| [&lt;init&gt;](-init-.html) | `IteratorNoNulls(iterator: `[`Iterator`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterator/index.html)`<`[`X`](index.html#X)`>)``IteratorNoNulls(iterator: `[`MutableIterator`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-mutable-iterator/index.html)`<`[`X`](index.html#X)`>, pos: `[`AtomicLong`](http://docs.oracle.com/javase/8/docs/api/java/util/concurrent/atomic/AtomicLong.html)`)`<br>A decorator of an [Iterator](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterator/index.html) that returns no NULL. |

### Functions

| [next](next.html) | `fun next(): `[`X`](index.html#X) |

