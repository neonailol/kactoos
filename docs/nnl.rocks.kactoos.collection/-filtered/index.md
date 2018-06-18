[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos.collection](../index.md) / [Filtered](./index.md)

# Filtered

`class Filtered<X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`CollectionEnvelope`](../-collection-envelope/index.md)`<`[`X`](index.md#X)`>`

Filtered collection.

There is no thread-safety guarantee.

### Parameters

`X` - Type of source item.

**Since**
0.4

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `Filtered(func: `[`KFunc`](../../nnl.rocks.kactoos/-k-func.md)`<`[`X`](index.md#X)`, `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`>, vararg src: `[`X`](index.md#X)`)`<br>`Filtered(func: `[`Func`](../../nnl.rocks.kactoos/-func/index.md)`<`[`X`](index.md#X)`, `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`>, vararg src: `[`X`](index.md#X)`)`<br>`Filtered(func: `[`Func`](../../nnl.rocks.kactoos/-func/index.md)`<`[`X`](index.md#X)`, `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`>, src: `[`Iterable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)`<`[`X`](index.md#X)`>)``Filtered(func: `[`KFunc`](../../nnl.rocks.kactoos/-k-func.md)`<`[`X`](index.md#X)`, `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`>, src: `[`Iterable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)`<`[`X`](index.md#X)`>)`<br>Filtered collection. |

### Inherited Functions

| Name | Summary |
|---|---|
| [iterator](../-collection-envelope/iterator.md) | `open fun iterator(): `[`Iterator`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterator/index.html)`<`[`X`](../-collection-envelope/index.md#X)`>` |
