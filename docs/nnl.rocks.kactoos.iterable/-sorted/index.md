[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos.iterable](../index.md) / [Sorted](./index.md)

# Sorted

`class Sorted<out T : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`IterableEnvelope`](../-iterable-envelope/index.md)`<`[`T`](index.md#T)`>`

Sorted iterable.

There is no thread-safety guarantee.

### Parameters

`T` - Element type

**Since**
0.4

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `Sorted(cmp: `[`Comparator`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-comparator/index.html)`<`[`T`](index.md#T)`>, vararg args: `[`T`](index.md#T)`)``Sorted(cmp: `[`Comparator`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-comparator/index.html)`<`[`T`](index.md#T)`>, src: `[`Iterable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)`<`[`T`](index.md#T)`>)`<br>Sorted iterable. |

### Inherited Functions

| Name | Summary |
|---|---|
| [iterator](../-iterable-envelope/iterator.md) | `open fun iterator(): `[`Iterator`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterator/index.html)`<`[`T`](../-iterable-envelope/index.md#T)`>` |

### Companion Object Functions

| Name | Summary |
|---|---|
| [invoke](invoke.md) | `operator fun <T : `[`Comparable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-comparable/index.html)`<`[`T`](invoke.md#T)`>> invoke(origin: `[`Iterable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)`<`[`T`](invoke.md#T)`>): `[`Sorted`](./index.md)`<`[`T`](invoke.md#T)`>`<br>`operator fun <T : `[`Comparable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-comparable/index.html)`<`[`T`](invoke.md#T)`>> invoke(vararg args: `[`T`](invoke.md#T)`): `[`Sorted`](./index.md)`<`[`T`](invoke.md#T)`>` |
