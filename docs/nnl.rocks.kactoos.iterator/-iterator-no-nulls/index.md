[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos.iterator](../index.md) / [IteratorNoNulls](./index.md)

# IteratorNoNulls

`class IteratorNoNulls<out X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`MutableIterator`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-mutable-iterator/index.html)`<`[`X`](index.md#X)`>`

A decorator of an [Iterator](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterator/index.html) that returns no NULL.

There is no thread-safety guarantee.

### Parameters

`X` - Type of item.

`iterator` - Encapsulated iterator.

`pos` - Position counter.

**Since**
0.3

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `IteratorNoNulls(iterator: `[`Iterator`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterator/index.html)`<`[`X`](index.md#X)`>)``IteratorNoNulls(iterator: `[`MutableIterator`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-mutable-iterator/index.html)`<`[`X`](index.md#X)`>, pos: `[`AtomicLong`](http://docs.oracle.com/javase/8/docs/api/java/util/concurrent/atomic/AtomicLong.html)`)`<br>A decorator of an [Iterator](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterator/index.html) that returns no NULL. |

### Functions

| Name | Summary |
|---|---|
| [next](next.md) | `fun next(): `[`X`](index.md#X) |
