[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos.iterable](../index.md) / [Joined](./index.md)

# Joined

`class Joined<out T : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`IterableEnvelope`](../-iterable-envelope/index.md)`<`[`T`](index.md#T)`>`

A few Iterables joined together.

There is no thread-safety guarantee.

### Parameters

`T` - Type of item

**Since**
0.1

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `Joined(items: `[`Iterable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)`<`[`Iterable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)`<`[`T`](index.md#T)`>>)`<br>`Joined(vararg items: `[`Iterable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)`<`[`T`](index.md#T)`>)` |

### Inherited Functions

| Name | Summary |
|---|---|
| [iterator](../-iterable-envelope/iterator.md) | `open fun iterator(): `[`Iterator`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterator/index.html)`<`[`T`](../-iterable-envelope/index.md#T)`>` |
