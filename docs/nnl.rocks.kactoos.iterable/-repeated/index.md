[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos.iterable](../index.md) / [Repeated](./index.md)

# Repeated

`class Repeated<out T : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`IterableEnvelope`](../-iterable-envelope/index.md)`<`[`T`](index.md#T)`>`

Repeat an element.

If you need to repeat endlessly, use [Endless](../-endless/index.md).

### Parameters

`T` - Element type

`total` - The total number of repetitions

`item` - The element to repeat

**Since**
0.1

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `Repeated(total: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`, elm: `[`T`](index.md#T)`)``Repeated(total: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`, item: `[`KScalar`](../../nnl.rocks.kactoos/-k-scalar.md)`<`[`T`](index.md#T)`>)`<br>Repeat an element. |

### Inherited Functions

| Name | Summary |
|---|---|
| [iterator](../-iterable-envelope/iterator.md) | `open fun iterator(): `[`Iterator`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterator/index.html)`<`[`T`](../-iterable-envelope/index.md#T)`>` |
