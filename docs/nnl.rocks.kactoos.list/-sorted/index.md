[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos.list](../index.md) / [Sorted](./index.md)

# Sorted

`class Sorted<T : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`ListEnvelope`](../-list-envelope/index.md)`<`[`T`](index.md#T)`>`

Sorted list.

There is no thread-safety guarantee.

### Parameters

`T` - Element type

**See Also**

[StickyList](../-sticky-list/index.md)

**Since**
0.4

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `Sorted(cmp: `[`Comparator`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-comparator/index.html)`<`[`T`](index.md#T)`>, src: `[`Collection`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-collection/index.html)`<`[`T`](index.md#T)`>)`<br>`Sorted(cmp: `[`Comparator`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-comparator/index.html)`<`[`T`](index.md#T)`>, vararg src: `[`T`](index.md#T)`)` |

### Inherited Functions

| Name | Summary |
|---|---|
| [iterator](../-list-envelope/iterator.md) | `open fun iterator(): `[`Iterator`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterator/index.html)`<`[`T`](../-list-envelope/index.md#T)`>` |
| [listIterator](../-list-envelope/list-iterator.md) | `open fun listIterator(): `[`ListIterator`](../-list-iterator/index.md)`<`[`T`](../-list-envelope/index.md#T)`>`<br>`open fun listIterator(index: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`): `[`ListIterator`](../-list-iterator/index.md)`<`[`T`](../-list-envelope/index.md#T)`>` |

### Companion Object Functions

| Name | Summary |
|---|---|
| [invoke](invoke.md) | `operator fun <T : `[`Comparable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-comparable/index.html)`<`[`T`](invoke.md#T)`>> invoke(src: `[`Iterable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)`<`[`T`](invoke.md#T)`>): `[`Sorted`](./index.md)`<`[`T`](invoke.md#T)`>`<br>`operator fun <T : `[`Comparable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-comparable/index.html)`<`[`T`](invoke.md#T)`>> invoke(vararg src: `[`T`](invoke.md#T)`): `[`Sorted`](./index.md)`<`[`T`](invoke.md#T)`>` |
