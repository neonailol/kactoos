[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos.iterable](../index.md) / [HeadOf](./index.md)

# HeadOf

`class HeadOf<out T : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`IterableEnvelope`](../-iterable-envelope/index.md)`<`[`T`](index.md#T)`>`

Head portion of the iterable.

There is no thread-safety guarantee.

### Parameters

`T` - Element type

`num` - Number of head elements

`iterable` - Decorated iterable

**Since**
0.4

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `HeadOf(num: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`, vararg src: `[`T`](index.md#T)`)``HeadOf(num: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`, iterable: `[`Iterable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)`<`[`T`](index.md#T)`>)`<br>Head portion of the iterable. |

### Inherited Functions

| Name | Summary |
|---|---|
| [iterator](../-iterable-envelope/iterator.md) | `open fun iterator(): `[`Iterator`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterator/index.html)`<`[`T`](../-iterable-envelope/index.md#T)`>` |
