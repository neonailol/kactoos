[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos.list](../index.md) / [StickyList](./index.md)

# StickyList

`class StickyList<X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`ListEnvelope`](../-list-envelope/index.md)`<`[`X`](index.md#X)`>`

List decorator that goes through the list only once.

The list is read only.

There is no thread-safety guarantee.

### Parameters

`X` - Type of item

**Since**
0.4

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `StickyList(collection: `[`Collection`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-collection/index.html)`<`[`X`](index.md#X)`>)`<br>`StickyList(vararg items: `[`X`](index.md#X)`)`<br>`StickyList(items: `[`Iterable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)`<`[`X`](index.md#X)`>)` |

### Inherited Functions

| Name | Summary |
|---|---|
| [iterator](../-list-envelope/iterator.md) | `open fun iterator(): `[`Iterator`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterator/index.html)`<`[`T`](../-list-envelope/index.md#T)`>` |
| [listIterator](../-list-envelope/list-iterator.md) | `open fun listIterator(): `[`ListIterator`](../-list-iterator/index.md)`<`[`T`](../-list-envelope/index.md#T)`>`<br>`open fun listIterator(index: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`): `[`ListIterator`](../-list-iterator/index.md)`<`[`T`](../-list-envelope/index.md#T)`>` |
