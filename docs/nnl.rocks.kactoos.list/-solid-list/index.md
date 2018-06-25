[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos.list](../index.md) / [SolidList](./index.md)

# SolidList

`class SolidList<X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`ListEnvelope`](../-list-envelope/index.md)`<`[`X`](index.md#X)`>`

A List that is both synchronized and sticky.

Objects of this class are thread-safe.

### Parameters

`X` - Type of item

**Since**
0.4

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `SolidList(list: `[`Collection`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-collection/index.html)`<`[`X`](index.md#X)`>)`<br>`SolidList(vararg items: `[`X`](index.md#X)`)`<br>`SolidList(items: `[`Iterable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)`<`[`X`](index.md#X)`>)` |

### Inherited Functions

| Name | Summary |
|---|---|
| [iterator](../-list-envelope/iterator.md) | `open fun iterator(): `[`Iterator`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterator/index.html)`<`[`T`](../-list-envelope/index.md#T)`>` |
| [listIterator](../-list-envelope/list-iterator.md) | `open fun listIterator(): `[`ListIterator`](../-list-iterator/index.md)`<`[`T`](../-list-envelope/index.md#T)`>`<br>`open fun listIterator(index: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`): `[`ListIterator`](../-list-iterator/index.md)`<`[`T`](../-list-envelope/index.md#T)`>` |
