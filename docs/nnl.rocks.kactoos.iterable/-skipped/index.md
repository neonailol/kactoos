[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos.iterable](../index.md) / [Skipped](./index.md)

# Skipped

`class Skipped<out T : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`IterableEnvelope`](../-iterable-envelope/index.md)`<`[`T`](index.md#T)`>`

Skipped iterable.

There is no thread-safety guarantee.

### Parameters

`T` - Element type

**Since**
0.4

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `Skipped(skip: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`, vararg src: `[`T`](index.md#T)`)``Skipped(skip: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`, iterable: `[`Iterable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)`<`[`T`](index.md#T)`>)`<br>Skipped iterable. |

### Inherited Functions

| Name | Summary |
|---|---|
| [iterator](../-iterable-envelope/iterator.md) | `open fun iterator(): `[`Iterator`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterator/index.html)`<`[`T`](../-iterable-envelope/index.md#T)`>` |
