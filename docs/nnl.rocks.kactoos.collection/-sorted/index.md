[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos.collection](../index.md) / [Sorted](./index.md)

# Sorted

`class Sorted<T : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`CollectionEnvelope`](../-collection-envelope/index.md)`<`[`T`](index.md#T)`>`

Sorted collection.

There is no thread-safety guarantee.

### Parameters

`T` - Element type

**Since**
0.4

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `Sorted(cmp: `[`Comparator`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-comparator/index.html)`<`[`T`](index.md#T)`>, src: `[`Collection`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-collection/index.html)`<`[`T`](index.md#T)`>)`<br>`Sorted(cmp: `[`Comparator`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-comparator/index.html)`<`[`T`](index.md#T)`>, vararg src: `[`T`](index.md#T)`)`<br>`Sorted(cmp: `[`Comparator`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-comparator/index.html)`<`[`T`](index.md#T)`>, src: `[`Iterable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)`<`[`T`](index.md#T)`>)` |

### Inherited Functions

| Name | Summary |
|---|---|
| [iterator](../-collection-envelope/iterator.md) | `open fun iterator(): `[`Iterator`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterator/index.html)`<`[`X`](../-collection-envelope/index.md#X)`>` |

### Companion Object Functions

| Name | Summary |
|---|---|
| [invoke](invoke.md) | `operator fun <T : `[`Comparable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-comparable/index.html)`<`[`T`](invoke.md#T)`>> invoke(src: `[`Iterable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)`<`[`T`](invoke.md#T)`>): `[`Sorted`](./index.md)`<`[`T`](invoke.md#T)`>`<br>`operator fun <T : `[`Comparable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-comparable/index.html)`<`[`T`](invoke.md#T)`>> invoke(vararg src: `[`T`](invoke.md#T)`): `[`Sorted`](./index.md)`<`[`T`](invoke.md#T)`>` |
