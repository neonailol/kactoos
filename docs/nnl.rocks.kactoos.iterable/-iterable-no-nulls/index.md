[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos.iterable](../index.md) / [IterableNoNulls](./index.md)

# IterableNoNulls

`class IterableNoNulls<out X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`Iterable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)`<`[`X`](index.md#X)`>`

A decorator for [Iterable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html) that doesn't allow any NULL.

There is no thread-safety guarantee.

### Parameters

`X` - Type of item

**Since**
0.4

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `IterableNoNulls(iterable: `[`IterableEnvelope`](../-iterable-envelope/index.md)`<`[`X`](index.md#X)`>)``IterableNoNulls(origin: `[`Iterable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)`<`[`X`](index.md#X)`>)`<br>A decorator for [Iterable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html) that doesn't allow any NULL. |

### Functions

| Name | Summary |
|---|---|
| [iterator](iterator.md) | `fun iterator(): `[`Iterator`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterator/index.html)`<`[`X`](index.md#X)`>` |
