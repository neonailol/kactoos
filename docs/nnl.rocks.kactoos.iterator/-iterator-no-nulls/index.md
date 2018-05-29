[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos.iterator](../index.md) / [IteratorNoNulls](./index.md)

# IteratorNoNulls

`class IteratorNoNulls<out T : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`Iterator`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterator/index.html)`<`[`T`](index.md#T)`>`

A decorator of an [Iterator](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterator/index.html) that returns no NULL.

There is no thread-safety guarantee.

### Parameters

`T` - Element type.

`iterator` - Encapsulated iterator.

**Since**
0.3

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `IteratorNoNulls(iterator: `[`Iterator`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterator/index.html)`<`[`T`](index.md#T)`>)`<br>A decorator of an [Iterator](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterator/index.html) that returns no NULL. |
