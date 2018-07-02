[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos.iterable](../index.md) / [Partitioned](./index.md)

# Partitioned

`class Partitioned<out T : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`IterableEnvelope`](../-iterable-envelope/index.md)`<`[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`T`](index.md#T)`>>`

Iterable implementation for partitioning functionality.

### Parameters

`T` - Partitions value type

**Since**
0.4

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `Partitioned(size: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`, iterable: `[`Iterable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)`<`[`T`](index.md#T)`>)`<br>`Partitioned(size: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`, vararg items: `[`T`](index.md#T)`)` |

### Inherited Functions

| Name | Summary |
|---|---|
| [iterator](../-iterable-envelope/iterator.md) | `open fun iterator(): `[`Iterator`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterator/index.html)`<`[`T`](../-iterable-envelope/index.md#T)`>` |
