[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos.collection](../index.md) / [Skipped](./index.md)

# Skipped

`class Skipped<T : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`CollectionEnvelope`](../-collection-envelope/index.md)`<`[`T`](index.md#T)`>`

Skipped collection.

There is no thread-safety guarantee.

### Parameters

`T` - Type of source item

`skip` - How many to skip

`src` - Source collection

**Since**
0.29

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `Skipped(skip: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`, vararg src: `[`T`](index.md#T)`)`<br>`Skipped(skip: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`, src: `[`Iterable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)`<`[`T`](index.md#T)`>)`<br>Ctor.`Skipped(skip: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`, src: `[`Collection`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-collection/index.html)`<`[`T`](index.md#T)`>)`<br>Skipped collection. |

### Inherited Functions

| Name | Summary |
|---|---|
| [iterator](../-collection-envelope/iterator.md) | `open fun iterator(): `[`Iterator`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterator/index.html)`<`[`X`](../-collection-envelope/index.md#X)`>` |
