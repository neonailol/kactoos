[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos.iterator](../index.md) / [IteratorNoNulls](index.md) / [&lt;init&gt;](.)

# &lt;init&gt;

`IteratorNoNulls(iterator: `[`Iterator`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterator/index.html)`<X>)``IteratorNoNulls(iterator: `[`MutableIterator`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-mutable-iterator/index.html)`<X>, pos: AtomicLong = AtomicLong())`

A decorator of an [Iterator](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterator/index.html) that returns no NULL.

There is no thread-safety guarantee.

### Parameters

`X` - Type of item.

`iterator` - Encapsulated iterator.

`pos` - Position counter.

**Since**
0.27

