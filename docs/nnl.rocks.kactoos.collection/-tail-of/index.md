[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos.collection](../index.md) / [TailOf](./index.md)

# TailOf

`class TailOf<T : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`CollectionEnvelope`](../-collection-envelope/index.md)`<`[`T`](index.md#T)`>`

Tail portion of the collection.

There is no thread-safety guarantee.

### Parameters

`T` - Element type

`num` - Number of tail elements

`src` - Source collection

**Since**
0.5

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `TailOf(num: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`, vararg src: `[`T`](index.md#T)`)`<br>`TailOf(num: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`, src: `[`Iterable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)`<`[`T`](index.md#T)`>)``TailOf(num: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`, src: `[`Collection`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-collection/index.html)`<`[`T`](index.md#T)`>)`<br>Tail portion of the collection. |

### Inherited Functions

| Name | Summary |
|---|---|
| [iterator](../-collection-envelope/iterator.md) | `open fun iterator(): `[`Iterator`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterator/index.html)`<`[`X`](../-collection-envelope/index.md#X)`>` |
