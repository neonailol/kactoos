[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos.list](../index.md) / [Shuffled](./index.md)

# Shuffled

`class Shuffled<T : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`ListEnvelope`](../-list-envelope/index.md)`<`[`T`](index.md#T)`>`

Shuffled list.

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
| [&lt;init&gt;](-init-.md) | `Shuffled(collection: `[`Collection`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-collection/index.html)`<`[`T`](index.md#T)`>)`<br>`Shuffled(vararg args: `[`T`](index.md#T)`)`<br>`Shuffled(iterable: `[`Iterable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)`<`[`T`](index.md#T)`>)` |

### Inherited Functions

| Name | Summary |
|---|---|
| [iterator](../-list-envelope/iterator.md) | `open fun iterator(): `[`Iterator`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterator/index.html)`<`[`T`](../-list-envelope/index.md#T)`>` |
| [listIterator](../-list-envelope/list-iterator.md) | `open fun listIterator(): `[`ListIterator`](../-list-iterator/index.md)`<`[`T`](../-list-envelope/index.md#T)`>`<br>`open fun listIterator(index: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`): `[`ListIterator`](../-list-iterator/index.md)`<`[`T`](../-list-envelope/index.md#T)`>` |
